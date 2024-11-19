package JUnit;

import org.JUnit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste{

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 11, 15, 0));
        Assertions.assertEquals(22,jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 11, 15, 0));
        Assertions.assertTrue(jessica.ehMaiorIdade());

        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorIdade());
        
    }
}
