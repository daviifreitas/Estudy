package Laboratory.Lab04.Teste02.Classes;

public class PoliceMan {
    private String name ;
    private int age ;
    private int workAge ;

    public PoliceMan(String name, int age, int workAge) {
        this.name = name;
        this.age = age;
        this.workAge = workAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
}
