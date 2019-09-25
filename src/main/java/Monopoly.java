import java.util.ArrayList;
import java.util.List;

public class Monopoly {
    private List<Billete> billetes = new ArrayList<>();
    private List<Carta> cartas = new ArrayList<>();
    private List<Casilla> casillas = new ArrayList<>();
    private List<Jugador> jugadores = new ArrayList<>();
    private Dado dado1 = new Dado();
    private Dado dado2 = new Dado();

    public Monopoly() {
        Casilla casilla = new Casilla("Carrer Cabana",500);
        Casilla casilla2 = new Casilla("Carrer Major",700);
        Casilla casilla3 = new Casilla("Carrer Menor",300);
        this.casillas.add(casilla);
        this.casillas.add(casilla2);
        this.casillas.add(casilla3);
    }

    public List<Billete> getBilletes() {
        return billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        this.billetes = billetes;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(List<Casilla> casillas) {
        this.casillas = casillas;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Dado getDado1() {
        return dado1;
    }

    public void setDado1(Dado dado1) {
        this.dado1 = dado1;
    }

    public Dado getDado2() {
        return dado2;
    }

    public void setDado2(Dado dado2) {
        this.dado2 = dado2;
    }
}
