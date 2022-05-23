package Tester.Testing01;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class T01 {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Find
//        MyClientes c1 = entityManager.find(MyClientes.class ,1);
////        System.out.println("Nome do cliente "+ c1.getNome());

        //Create
//        MyClientes cliente = new MyClientes();
//        cliente.setNome("Google");
//
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(cliente);
//        entityManager.getTransaction().commit();
//
        // REMOVE
//        MyClientes cliente = entityManager.find(MyClientes.class , 2);
//        entityManager.getTransaction().begin();
//        entityManager.remove(cliente);
//        entityManager.getTransaction().commit();


    }
}
