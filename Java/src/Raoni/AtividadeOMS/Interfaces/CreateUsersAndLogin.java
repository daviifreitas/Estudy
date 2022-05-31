package Raoni.AtividadeOMS.Interfaces;

import Raoni.AtividadeOMS.Classes.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public interface CreateUsersAndLogin {

    List<Usuario> listaDeUSuarios = new ArrayList<>();
    static void menu(){
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Bem-vindo!\nVeja as opções e escolha qual você deseja fazer\n1 - Criar conta \n2 - Login\n3 - Para sair\nDigite aqui : ");
            int decisaoParaOpcoesDoMenu = input.nextInt();

            if (decisaoParaOpcoesDoMenu == 1) {
                createNewUsers();
            }
            if (decisaoParaOpcoesDoMenu == 2) {
                login();
                break ;
            }
            if (decisaoParaOpcoesDoMenu == 3) {
                break;
            }
            else {
                System.out.println("Valor inválido !!\n\n\n\n");
            }
        }while(true);
    }
    static void createNewUsers(){
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o seu nome :");
            String nomeNovoUsuario = input.nextLine();

            System.out.println("Digite o cpf : ");
            Long cpfNovoUsuario = input.nextLong();

            System.out.println("Digite o seu email :");
            String emailNovoUsuario = input.next();

            System.out.println("Digite a sua senha : ");
            String senhaNovoUsuario = input.next();

            Usuario usuario = new Usuario(cpfNovoUsuario, nomeNovoUsuario, emailNovoUsuario, senhaNovoUsuario);

            System.out.println("Do you want create more users ? type 1 for yes or 2 for not \n\nType here: ");
            int decisionForCreateNewUsers = input.nextInt();

            if(decisionForCreateNewUsers == 2){
                listaDeUSuarios.add(usuario);
                break;
            }
            listaDeUSuarios.add(usuario);
        }while(true);
    }

    static void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o email : ");
        String emailForLogin = input.next();

        System.out.println("Digite o password : ");
        String passwordForLogin = input.next();

        BiFunction<String ,String ,Boolean> testerForLogin = (emailForLogin1 ,passwordForLogin1) -> listaDeUSuarios.stream().anyMatch(s-> s.getEmail().equals(emailForLogin1)) && listaDeUSuarios.stream().anyMatch(s-> s.getPassword().equals(passwordForLogin1));

        if(testerForLogin.apply(emailForLogin, passwordForLogin)){
            Usuario usuarioAtualDoLogin = null;
            for (Usuario listaDeUSuario : listaDeUSuarios) {
                if(listaDeUSuario.getPassword().equals(passwordForLogin) && listaDeUSuario.getEmail().equals(emailForLogin)){
                    usuarioAtualDoLogin = listaDeUSuario;
                }
            }
            System.out.println("Bem vindo "+usuarioAtualDoLogin.getNome());
            System.out.println("Você deseja fazer alguma ocorrência ?");
            String fazerOcorrencia = input.next();

            if(fazerOcorrencia.equalsIgnoreCase("sim")){
                usuarioAtualDoLogin.fazerOcorrencia();
            }else {
                System.out.println("Certo , obrigado por utilizar nossos serviços !!!");
            }
        }
    }
}
