package Raoni.Auladia11.Teste;

import Raoni.Auladia11.Classes.Personagens.Luigi;
import Raoni.Auladia11.Classes.Personagens.Mario;
import Raoni.Auladia11.Classes.Personagem;
import Raoni.Auladia11.Classes.Personagens.Yoshi;
import Raoni.Auladia11.Interfaces.PersonagemCorredor;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Personagem p1 = null ;
        String ler ;

        do{

            System.out.println("Qual personagem você deseja ?\n1 - Mario\n2 - Yoshi\n3 - Luigi");
            switch(input.nextInt()){
                case 1: p1 = new Mario(); break ;
                case 2: p1 = new Yoshi(); break ;
                case 3: p1 = new Luigi(); break;
                default:
                    System.out.println("Escolha um personagem"); break ;
            }

            p1.andar();
            System.out.println();
            p1.pular();

             if (p1 instanceof PersonagemCorredor){
                if(p1 instanceof Mario){
                    Mario m1 = (Mario) p1 ;
                    m1.correr();
                }
                if(p1 instanceof Luigi){
                    Luigi l1 = (Luigi) p1 ;
                    l1.correr();
                }
            }

            System.out.println("Você deseja continuar (Digite S para sim ):");
            ler = input.next();
        } while (ler.equals("S"));
    }
}
