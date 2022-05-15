package Laboratory.Lab06.Enuns;

public enum Sintomas {
    DOR_DE_CABECA(1 , "Dor de cabeça"),
    DOR_ABDOMINAIS(2 ,"Dor abdominal")
    ,DORES_MUSCULARES (3 , "Dor Muscular")
    ,DOR_NOS_OSSOS (4 , "Dor nos Ossos");
    int tipo ;
    String nome ;

    Sintomas(int tipo , String nome ){
        this.tipo = tipo ;
        this.nome = nome ;
    }
}
