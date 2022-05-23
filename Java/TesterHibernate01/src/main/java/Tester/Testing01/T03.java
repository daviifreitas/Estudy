package Tester.Testing01;

import org.hibernate.HibernateError;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class T03 {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {
        try{
            int idCliente = 1 ;

            entityManager.getTransaction().begin();

            // deletar algum registro dentro do banco de dados !!!
//            entityManager.createQuery("delete from Clientes c where c.id = :idCliente")
//                    .setParameter("idCliente", idCliente)
//                    .executeUpdate();

            // fazendo a alteração dentro do banco de dados !!!!!

            entityManager.createQuery("update Clientes c set c.nome ='Netflix new app' where c.id = :idCliente")
                            .setParameter("idCliente", 3)
                                    .executeUpdate();


            entityManager.getTransaction().commit();

        } catch(HibernateError e){
            e.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
