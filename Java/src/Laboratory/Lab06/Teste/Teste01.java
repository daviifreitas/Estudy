package Laboratory.Lab06.Teste;

import Laboratory.Lab06.Classes.Medico;
import Laboratory.Lab06.Classes.Pessoa;

public class Teste01 {
    public static void main(String[] args) {
        Medico medico1 = new Medico("Maria", 54);
        Pessoa pessoa1 = new Pessoa("Francisca",32, 344122121);
        medico1.atender(pessoa1 , medico1);
    }
}
