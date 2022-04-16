package Javacore.Npolimorfismo.test;

import Javacore.Npolimorfismo.repositorio.Repositorio;
import Javacore.Npolimorfismo.servico.RepositorioArquivo;
import Javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import Javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
    }
}
