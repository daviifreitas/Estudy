package Laboratory.Lab04.Teste03.Classes.Automobiles;

public abstract class Automobile {
    private String plate ;
    private int renamed; // renavam do carro !!!
    private String color ;
    private int year ;

    public Automobile(String plate, int renamed, String color, int year) {
        this.plate = plate;
        this.renamed = renamed;
        this.color = color;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getRenamed() {
        return renamed;
    }

    public void setRenamed(int renamed) {
        this.renamed = renamed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
