package Lambda.Npolimorfismo.Classes;

public class ArquivoDAOImpli implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando dados nos arquivos");
    }
}
