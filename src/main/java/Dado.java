import java.util.Random;

public class Dado {
    private final int MAXIMO = 6;
    private final int MINIMO = 1;

    public Dado() {
    }

    public int tirar(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(MAXIMO)+MINIMO;
    }
}
