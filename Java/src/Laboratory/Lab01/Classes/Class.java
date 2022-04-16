package Laboratory.Lab01.Classes;

public class Class {
    private Student[] students;
    private boolean inClass;

    public Class(Student[] students) {
        this.students = students;
    }

    public void startClass(Teacher teacher){
        System.out.println("The class will be start \nThe today matter is :"+teacher.getMatter());
        setInClass(true);
        teacher.setTeaching(true);

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean isInClass() {
        return inClass;
    }

    public void setInClass(boolean inClass) {
        this.inClass = inClass;
    }
}
