package Javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNUmber;
    private String brand;

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNUmber='" + serialNUmber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    //Reflexivo : x.equals(x) tem que ser true parar tudo que for diferetne de null;
    // simétrico : para x e y diferentes de nul , se x.equals(y) == true logo , y.equals(x) == true
    // transitividade : para x ,y,z diferentes de null , se x.equals(y) == true ,logo x.equals(z) == true ,logo y.equals(z) == true
    // consistente : x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null ,x.equals(null) retorne falso
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false ;
        }
        if(this == obj){
            return true ;
        }
        if(this.getClass() != obj.getClass()){
            return false ;
        }
        Smartphone smartphone = (Smartphone) obj ;
        return serialNUmber != null && serialNUmber.equals(smartphone.serialNUmber) && brand.equals(smartphone.brand);
    }

    //Se x.equals(y) == true ,então y.hashcode() == x.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true ;
    // se x.equals(y) == false então x.hashCode() != y.hashCode()
    // se y.hashCode() != x.hashCode() , logo x.equals(y) deverá ser falso
    @Override
    public int hashCode() {
        return serialNUmber == null ? 0 : this.serialNUmber.hashCode();
    }

    public Smartphone(String serialNUmber, String brand) {
        this.serialNUmber = serialNUmber;
        this.brand = brand;
    }

    public String getSerialNUmber() {
        return serialNUmber;
    }

    public void setSerialNUmber(String serialNUmber) {
        this.serialNUmber = serialNUmber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
