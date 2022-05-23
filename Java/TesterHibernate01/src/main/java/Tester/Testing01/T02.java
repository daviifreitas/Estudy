package Tester.Testing01;

import Tester.Entities.Clientes;
import org.hibernate.HibernateError;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;

public class T02 {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    public static void main(String[] args) {

        String jpqj = "select c from Clientes c where c.id  = :idCliente" ;
        int idCliente = 3;
        TypedQuery<Clientes> typedQuery = entityManager
                .createQuery(jpqj , Clientes.class)
                .setParameter("idCliente", idCliente);
        List<Clientes> clientesList = typedQuery.getResultList();

        Consumer<List<Clientes>> consumerListClientes = System.out::println;

        consumerListClientes.accept(clientesList);
    }
    public static void  createRow(String clienteName){
        Clientes cliente = new Clientes();
        cliente.setNome(clienteName);

        try{
            entityManager.getTransaction().begin();
            entityManager.persist(cliente);
            entityManager.getTransaction().commit();

        }catch(HibernateError e){
            e.printStackTrace();
        } finally{
            entityManager.close();
            entityManagerFactory.close();
        }
        System.out.println("Novo registro de cliente criado com o nome de : "+clienteName);
    }

}
