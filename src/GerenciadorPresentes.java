import java.util.HashMap;
import java.util.Map;

public class GerenciadorPresentes implements ConjuntoItem{
    Map<String, Presente> listaNatal = new HashMap<>();

    @Override
    public boolean addItem(Presente p) {
        return false;
    }

    @Override
    public String darPresente(String destinatario) {
        return "";
    }

    @Override
    public void listarPresentes() {

    }
}
