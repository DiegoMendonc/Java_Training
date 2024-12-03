import org.junit.jupiter.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.junit.jupiter.MockitoExtension;


@ExtendWith

public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    void adicionarItemLista(){
        Mockito.when(letras.get(0).thenReturn("B"));

        Assertions.assertEquals("B", letras.get(0));
        }

    }
}
