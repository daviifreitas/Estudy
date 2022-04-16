package Laboratory.Lab01.Classes;

public class Vigilant extends Functionary{
    private String PeriodDay;

    public Vigilant(String name, String cpf, double salary ,String periodDay) {
        super(name, cpf, salary);
        setPeriodDay(periodDay);
    }

    public String getPeriodDay() {
        return PeriodDay;
    }

    public void setPeriodDay(String periodDay) {
        PeriodDay = periodDay;
    }
}
