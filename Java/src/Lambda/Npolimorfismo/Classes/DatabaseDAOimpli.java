package Lambda.Npolimorfismo.Classes;

public class DatabaseDAOimpli implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
