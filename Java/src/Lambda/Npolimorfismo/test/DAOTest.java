package Lambda.Npolimorfismo.test;

import Lambda.Npolimorfismo.Classes.DatabaseDAOimpli;
import Lambda.Npolimorfismo.Classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAOimpli();
        arquivoDAO.save();
    }
}
