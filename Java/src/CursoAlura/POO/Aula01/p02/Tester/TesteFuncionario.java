package CursoAlura.POO.Aula01.p02.Tester;

import CursoAlura.POO.Aula01.p02.classes.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nico Steppat");
        funcionario.setCpf("223323241241-2");
        funcionario.setSalario(1234.43);
    }
}
