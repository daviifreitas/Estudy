package Raoni.AtividadeOMS.Classes;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class Usuario {
    private Long cpf;
    private int id;
    private String nome;
    private String email;
    private String password;
    private double longitude;
    private double latitude;
    private List<String> listaDeOcorrencias;

    public Usuario(Long cpf, String nome, String email, String password) {
        Random random = new Random();
        this.cpf = cpf;
        this.id = random.nextInt(10000);
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public void fazerOcorrencia(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o que aconteceu : ");
        Ocorrencia ocorrencia = new Ocorrencia(input.nextLine(), this.id ,this.longitude ,this.latitude );
        adicionarOcorrenciaALista(ocorrencia.toString());
        System.out.println("Ocorrencia feita com sucesso !!!");
    }
    public void fazerOcorrencia(String novoDado){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o que aconteceu : ");
        Ocorrencia ocorrencia = new Ocorrencia(novoDado, this.id ,this.longitude ,this.latitude );
        adicionarOcorrenciaALista(ocorrencia.toString());
        System.out.println("Ocorrencia feita com sucesso !!!");
    }

    public void adicionarOcorrenciaALista(String ocorrencia){
        this.listaDeOcorrencias.add(ocorrencia);
    }

    public void verOcorrencias(){
        for (String listaDeOcorrencia : listaDeOcorrencias) {
            System.out.println(listaDeOcorrencia);
        }
    }
    public void ativarModoAlerta(){
        System.out.println("Modo de alerta ativado !");
        fazerOcorrencia("Fazendo ocorrência de alerta !!!!!");
    }
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
