import br.com.gui.ListaNomes;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTesteTest {

    @Test
    public void testeMulheres() {
        List<ListaNomes> listaPessoas = new ArrayList<>();
        listaPessoas.add(new ListaNomes("F", "Ana"));
        listaPessoas.add(new ListaNomes("F", "Maria"));
        listaPessoas.add(new ListaNomes("M", "Pedro"));
        listaPessoas.add(new ListaNomes("M", "Joao"));
        listaPessoas.add(new ListaNomes("F", "Daniela"));
        listaPessoas.add(new ListaNomes("F", "Ana Paula"));
        listaPessoas.add(new ListaNomes("M", "Guilherme"));
        listaPessoas.add(new ListaNomes("F", "Simone"));

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("F"));

        ListaNomes[] mulheres = new ListaNomes[0];

        for (ListaNomes mulher : mulheres) {
            Assert.assertEquals("F", mulher.getGenero());
        }
    }
}