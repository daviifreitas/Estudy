package Javacore.Npolimorfismo.servico;

import Javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo !!!!");
    }
}
