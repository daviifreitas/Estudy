package Tester02.Interfaces;

import Tester02.Classes.Pessoa;
import org.hibernate.HibernateError;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public interface Crud {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();


    static  void createRow(String nome , int idade , String trabalho){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setTrabalho(trabalho);
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();
            System.out.println("Criando um novo registro de pessoa na tabela");

        }catch(HibernateError e ){
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }

    static void readRows(){
        String jpql = "select p from Pessoa p ";
        TypedQuery<Pessoa> typedQuery = entityManager.createQuery(jpql, Pessoa.class);
        List<Pessoa> pessoas = typedQuery.getResultList() ;
        Consumer<List<Pessoa>> exibirListaPessoas = System.out::println;
        exibirListaPessoas.accept(pessoas);
    }

    static void updateRow(){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want update what's data ?\nType: 1 - nome \n2 - idade \n3 - trabalho\nDigte aqui : ");
        int escolha = input.nextInt();

        if(escolha == 1){
            System.out.println("Digite o id que você deseja alterar : ");
            int idParaAlterar = input.nextInt();

            System.out.println("Digite o novo nome que você deseja colocar no lugar : ");
            String novoNome = input.next();

            try{
                entityManager.getTransaction().begin();
                entityManager.createQuery("update Pessoa p set p.nome = :novoNome where p.id = :idParaAlterar")
                        .setParameter("novoNome",novoNome )
                        .setParameter("idParaAlterar",idParaAlterar)
                        .executeUpdate();
                entityManager.getTransaction().commit();

            } finally{
                entityManager.close();
                entityManagerFactory.close();
            }
        } else if (escolha == 2){
            System.out.println("Digite o id de quem você deseja alterar : ");
            int idParaAlterar = input.nextInt();

            System.out.println("Digite a nova idade dessa pessoa : ");
            int novaIdade = input.nextInt();

            try{
                entityManager.getTransaction().begin();
                entityManager.createQuery("update Pessoa p set p.idade = :novaIdade where p.id = :idParaAlterar")
                        .setParameter("novaIdade",novaIdade)
                        .setParameter("idParaAlterar",idParaAlterar)
                        .executeUpdate();
                entityManager.getTransaction().commit();

            } finally {
                entityManager.close();
                entityManagerFactory.close();
            }
        } else if(escolha == 3){
            System.out.println("Digite o id de quem você deseja alterar : ");
            int idParaAlterar = input.nextInt();

            System.out.println("Digite a nova profissão dessa pessoa : ");
            String novaProfissao = input.next();

            try{
                entityManager.getTransaction().begin();
                entityManager.createQuery("update Pessoa p set p.trabalho = :novaProfissao where p.id = :idParaAlterar")
                        .setParameter("novaProfissao",novaProfissao)
                        .setParameter("idParaAlterar",idParaAlterar)
                        .executeUpdate();
                entityManager.getTransaction().commit();
            } finally{
                entityManager.close();
                entityManagerFactory.close();
            }
        } else {
            System.out.println("O valor que você digitou está errado !!!!!!!!!!!");
        }
    }
}
