package Laboratory.Lab02.Classes;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name ;
    private Long cpf ;
    private int id ;

    public Person(String name, Long cpf, int id){
        Objects.requireNonNull(name , "O nome está como nulo !!!");
        Objects.requireNonNull(cpf , "Erro o cpf está como nulo !!!");
        Objects.requireNonNull(id, "Error o id não pode está como nulo !!!");
        setName(name);
        setCpf(cpf);
        setId(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name) && cpf.equals(person.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public int compareTo(Person o) {
        return Integer.valueOf(getId()).compareTo(o.getId());
    }
}
