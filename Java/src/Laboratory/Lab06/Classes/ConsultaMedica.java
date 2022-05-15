package Laboratory.Lab06.Classes;

import Laboratory.Lab06.Enuns.Sintomas;

import java.util.Scanner;

/**
 * Uma interface que vai ser implementada pela classe médico ,sendo assim a mesma vai ficar responsável pela consulta inicial de uma paciênte
 * para tanta necessidade há uma disponibilidade desta classe receber um parâmetro generico que referência a classe pessoa e suas filhas para a utilização
 * de métodos importantes como getNome() ou outros que fazem referências a atributos do objeto da calsse pessoa
 * @param <T> Qualquer instância de objeto que é filha ou até mesmo a classe pessoa ,para fazer a questão da utilização
 *           desses métodos em outras classes
 */
public interface ConsultaMedica<T extends Pessoa> {

    /**
     * Função que vai receber um médico e um paciênte que necessariamente vai ser da classe pessoa ou filho dela
     * Sendo a mesma necessária para a realização de consultas medicas e com isto conseguindo fazer de maneira objetiva
     * o tratamento de uma primeira ida de um paciênte ao hosital !!!
     * @param type Tipo generico que pode referenciar pessoa ou alguma filha desta classe
     * @param medico medico que será responsável pelo exame
     */
    default void atender(T type, Medico medico)  {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá ?! Tudo bem ?  " + type.toString());
        medico.setDisponivel(false);

        externo : do {

            System.out.println("Quais são os sintomas que você está sentindo ? : " +
                    "\nDigite 1 para dor de cabeça\nDigite 2 para dor no abdomem\nDigite 3 para dores musculares " +
                    "\nDigite 4 para dor nos ossos\nDigite 5 para sair \n\nDigite aqui :");
            int decisaoSobrePrimeirosSintomas = input.nextInt();

            if (decisaoSobrePrimeirosSintomas == 1) {
                do {
                    System.out.println("Certo ,você já sentiu algum enjoou ou nauseá ?\nDigite 1 para sim e 2 para não \n" +
                            "Digite aqui :");
                    int decisaoSobreSegundosSintomas = input.nextInt();

                    if (decisaoSobreSegundosSintomas == 1) {

                        System.out.println("Você pode está com um problema um pouco mais sério ,vou lhe passar uma bateria " +
                                "de exames para você fazer !!!!");

                        System.out.println("\n\n--------------------------------Exames--------------------------------\n" +
                                "Ressonância magnética\nTomografia computadorizada\nUltrassonografia com Doppler\nAngiografia");

                        type.setFezConsuta(true); //Essa variável vai ser utilizada para fazer a verificação posteriormente caso
                                                    // a pessoa tenha feito a consultado com o médico para o seu parecer ......
                        type.setDoenca(Sintomas.DOR_DE_CABECA);
                        break externo;

                    } else if (decisaoSobreSegundosSintomas == 2) {

                        System.out.println("Você está com uma dor de cabeça que pode ser algo simples para se solucionar\n " +
                                "vou lhe passar uma medicação e você vai tomar durante uma semana de 6 em 6 horas\ncaso as " +
                                "dores permanecerem ,venha novamente para fazermos exames para identificar o problema ");

                        System.out.println("----------------------------Remédio----------------------------\n" +
                                "Cloridrato de Naratriptana 2,5mg\n\nFazer isso por 1 semana de 6 em 6 horas\n" +
                                "4 vezes ao dia !!!!");

                        type.setFezConsuta(true);

                        break externo ;
                    } else {
                        System.out.println("Valor inválido ,Digite novamente \n\n\n");
                        limparTela();
                    }

                } while (true);


            } else if (decisaoSobrePrimeirosSintomas == 2) {
                do {
                    System.out.println("Você já teve diarreia esses dias ?\nDigite 1 para sim ou 2 para não ." +
                            "\n\nDigite aqui:");
                    int decisaoSobreSegundosSintomas = input.nextInt();

                    if(decisaoSobreSegundosSintomas == 1){
                        System.out.println("Deve ser algum tipo de problema referente a sua alimentação ,ou alguma virose\n" +
                                " que você possa ter contraido ,vou lhe passar um medicamento e você utilize ele de forma moderada !");

                        System.out.println("----------------------------------------Medicamento----------------------------------------" +
                                "\nBifilac 250mg tomar em a cada 8 horas ,ou seja , 3 vezes ao dia durante 1 semana !");
                        type.setDoenca(Sintomas.DOR_ABDOMINAIS);

                        type.setFezConsuta(true);

                        break externo ;

                    } if (decisaoSobreSegundosSintomas == 2){
                        System.out.println("Então possa ser algo mais sério , então vamos ver a questão de alguns " +
                                "exames para tentarmos verificar o que poderá ser");

                        System.out.println("----------------------------------EXAMES----------------------------------\n" +
                                "Ultrassonografia abdominal\n" +
                                "Ressonância magnética\n" +
                                "Exame de fezes");

                        type.setFezConsuta(true);
                        type.setDoenca(Sintomas.DOR_ABDOMINAIS);

                        break externo;
                    } else {
                        System.out.println("Valor inválido !!!!\nDigite novamente !!!\n\n\n");
                        limparTela();
                    }

                    /*
                     *  Necessário para manter o funcionamento da repetição caso o usuario digite algum comando errado e tenha a opção de voltar e digitar
                     *  novamente, caso ele digite adequadamente haverá um 'break' para finalizar o ciclo externo e interno.
                     */
                } while ( true );

            } else if (decisaoSobrePrimeirosSintomas == 3) {
                do{
                    System.out.println("Certo ,então vamos fazer o seguinte \nVocê já está há quantos dias com essa dor ? \nDigite a quantidade de dias : ");
                    int decisaoSobreSegundoSintoma = input.nextInt();

                    if(decisaoSobreSegundoSintoma > 10){
                        System.out.println("Temos quer ver há necessidade de fazer alguns exames ,sendo assim vou lhe passar uma lista e você vai a recepção agendar\n" +
                                "---------------------------------EXAMES---------------------------------\n" +
                                "Eletroneuromiografia\n" +
                                "Aldolase\n" +
                                "Exame de sangue");
                        type.setFezConsuta(true);
                        type.setDoenca(Sintomas.DORES_MUSCULARES);
                        break externo ;

                    }
                    else if (decisaoSobreSegundoSintoma < 10 && decisaoSobreSegundoSintoma > 0){
                        System.out.println("Vou lhe passar um anti inflamatório para observar a reação do seu corpo em relação a essas dores\n" +
                                "----------------------------REMEDIO----------------------------\n" +
                                "Ibuprofeno 400 mg\nFazer a utilização desse remédio após as treis refeições do dia ,ou seja, a cada 8 horas ");
                        type.setFezConsuta(true);
                        type.setDoenca(Sintomas.DORES_MUSCULARES);
                        break externo ;

                    }
                    else {
                        System.out.println("Digite novamente o valor dos dias !!!!!\n\n\n\n\n\n\n\n");
                    }

                }while (true);

            } else if (decisaoSobrePrimeirosSintomas == 4) {
                do {
                    System.out.println("Certo ,essas suas dores nos ossos são constântes ou você está sentindo isso quando faz" +
                            "algum determinado movimento?\nDigite 1 ou 2 \nDigite aqui : ");
                    int decisaoSobreSegundoSintoma = input.nextInt();

                    if(decisaoSobreSegundoSintoma == 1){
                        System.out.println("Já que elas estão constântes tenho que pedir para você já a recepção para marcar um exame de densitometria óssea");
                        type.setFezConsuta(true);
                        type.setDoenca(Sintomas.DOR_NOS_OSSOS);
                        break externo ;
                    }

                    else if (decisaoSobreSegundoSintoma == 2){
                        do {
                            System.out.println("Então sua dor está localizada em qual região ?\n1 - Joelho\n2- Coluna\n3- Quadril");
                            int decisaoSobreTerceiroSintoma = input.nextInt();

                            if (decisaoSobreTerceiroSintoma == 1) {
                                System.out.println("Certo você vai fazer um agendamente de uma radiografica na recepção ");
                                type.setFezConsuta(true);
                                type.setDoenca(Sintomas.DOR_DE_CABECA);
                                break externo ;

                            }
                            else if (decisaoSobreTerceiroSintoma == 2) {
                                System.out.println("Ok, então você precisa fazer uma ressonância magnética , vá a recepção para agendar ");
                                type.setFezConsuta(true);
                                type.setDoenca(Sintomas.DOR_DE_CABECA);
                                break externo ;

                            }
                            else if (decisaoSobreTerceiroSintoma == 3) {
                                System.out.println("Entendi ,então você precisa fazer um exma de coluna ombar e dos membros inferiores " +
                                        "vá a recepção para realizar o agendamento ,por gentileza");
                                type.setFezConsuta(true);
                                type.setDoenca(Sintomas.DOR_DE_CABECA);
                                break externo ;

                            }
                            else {
                                System.out.println("Opção inválida, digite novamente  !!!!!");
                                limparTela();

                            }
                        } while (true) ;
                    }
                    else {
                        System.out.println("Você digitou errado pode digitar novamente ?");
                        try{
                            Thread.sleep(1000);
                        } catch (InterruptedException e ){
                            e.printStackTrace();
                        } finally {
                            limparTela();
                        }
                    }
                } while (true);

            }
            else if (decisaoSobrePrimeirosSintomas == 5) {
                limparTela();
                System.out.println("Obrigado por utlizar nossos sistemas !!!!");
                break;

            }
            else {
                System.out.println("Digite novamente !!!!");
                limparTela();
            }
        } while (true); //fazer a questão do looping do primeiro menu para o usuário digitar toda a questão do seu
        // primeiro sintoma !!!!

    }

    default void finalizarConsulta(T type, Medico medico) {
        System.out.println("Finalizando a consulta do paciênte : " + type.toString());
        medico.setDisponivel(true);
    }
    private void limparTela(){
        for(int i = 0 ; i< 1000; i++){
            System.out.println();
        }
    }
}