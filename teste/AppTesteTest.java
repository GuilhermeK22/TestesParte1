import br.com.gui.ListaNomes;
import org.junit.Assert;
import org.junit.Test;

public class AppTesteTest {
    @Test
    public void testeApp() {
        ListaNomes cli = new ListaNomes();
        cli.setGenero("F");
        cli.setNome("Mae");

        Assert.assertTrue("F", cli.getNome());
    }
}
