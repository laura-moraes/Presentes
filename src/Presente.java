import java.util.Date;

public abstract class Presente implements Comparable<Presente>, ItemPresente{
    protected Date dataTroca;
    protected int quantidade;
    protected boolean entrega;
    protected String destinatario;

    @Override
    public int compareTo(Presente o) {
        return 0;
    }

    @Override
    public void entregarPresente() {

    }
}
