package Omega.Cursoo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import javax.sound.sampled.SourceDataLine;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad", 3253.85,0.15);
        p.view(p);
    }
    
}
class Produto {
    private String name ;
    private double value;
    private double desc;

    public Produto(){}

    public Produto(String name , double value ,double desc){
        setName(name);
        setDesc(desc);
        setValue(value);
    }

    public void view(Produto produto){
        System.out.println();
        System.out.println("-------------The product-----------");
        System.out.println("Name : "+produto.getName());
        calcTrueValue(produto);
        impostoMunicipal(produto);
        frete(produto);

    }

    public void calcTrueValue(Produto produto){
        calcular = (a ,b) -> {
            double result = a *(1 - b);
            System.out.println("The final value of product is : "+Math.round(result));
        };
        calcular.accept(produto.getValue(), produto.getDesc());
    }

    public void impostoMunicipal(Produto produto){
        if(produto.getValue() >= 2500){
            calcular1 = (a) -> {
                double result = a * 0.085;
                System.out.println("The result of tax is : "+result);
            };
            calcular1.accept(produto.getValue());
        } else {
            System.out.println("The product is exempt ");
        }
    }

    public void frete(Produto produto){
        if(produto.getValue() > 3000){
            System.out.println("The freight is : 100");
        } else {
            System.out.println("The freight is 50");
        }
    }

    BiConsumer<Double ,Double> calcular = (a ,b) -> {};
    Consumer <Double> calcular1 = (a) -> {};
  
    public void setName(String name ){
        this.name = name ;
    }
    
    public String getName(){
        return this.name;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

    public void setDesc(double desc){
        this.desc = desc;
    }

    public double getDesc(){
        return this.desc; 
    }
}
