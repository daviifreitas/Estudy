package Laboratory.Lab10.Tester;

public class Tester01 {
    public static void main(String[] args) {
        int[] valores = new int[]{4, 5, 6, 4, 3};
        int[] valores01 = new int[valores.length];
        int quantidade = 0 ;

        for(int i = 0 ; i < valores.length; i++){
            quantidade = 0 ;
            if(i > 0){
                for(int j = 0 ; j< valores.length; j++){
                    if(j < i && valores[i] < valores[j]){
                        quantidade ++;
                    }
                }
                valores01[i] = quantidade ;
            } else {
                valores[0] = 0 ;
            }
        }
        for (int valore : valores01) {
            System.out.println(valore);
        }

    }
}
