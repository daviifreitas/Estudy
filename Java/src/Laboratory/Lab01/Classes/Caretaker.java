package Laboratory.Lab01.Classes;

import Laboratory.Lab01.Interfaces.CaretakerActions;

public class Caretaker extends Functionary implements CaretakerActions {
    private String sector;

    public Caretaker(String name, String cpf, double salary , String sector) {
        super(name, cpf, salary);
        setSector(sector);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public void swepFloor() {
        System.out.printf("\nThe caretaker %s are sweep the floor ",getName());
    }

    @Override
    public void washBathroom() {
        System.out.println("The bathroom is begin washed");
    }
}
