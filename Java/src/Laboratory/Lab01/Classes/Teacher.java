package Laboratory.Lab01.Classes;

import Laboratory.Lab01.Interfaces.TeacherActions;

public class Teacher extends Functionary implements TeacherActions {
    private String matter ;
    private int hoursClass;
    private String schoolName;
    private boolean teaching;

    public Teacher(String name, String cpf, double salary) {
        super(name, cpf, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salary=" + salary +
                '}';
    }

    public boolean isTeaching() {
        return teaching;
    }

    public void setTeaching(boolean teaching) {
        this.teaching = teaching;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public int getHoursClass() {
        return hoursClass;
    }

    public void setHoursClass(int hoursClass) {
        this.hoursClass = hoursClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void toTeach() {
        System.out.printf("\nThe teacher %s is teaching for the class",getName());
        setTeaching(true);
    }

    @Override
    public void hitPoint() {
        System.out.printf("\nYou hit point  %s !!\nSee you latter !",getName());
    }
}
