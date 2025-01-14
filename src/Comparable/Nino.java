package Comparable;

public class Nino implements Comparable<Nino> {
    private int comportamiento;
    private int peso;

    public Nino(int comportamiento, int peso) {
        this.comportamiento = comportamiento;
        this.peso = peso;
    }

    public int getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(int comportamiento) {
        this.comportamiento = comportamiento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "comportamiento: " + comportamiento + ", peso: " + peso;
    }

    @Override
    public int compareTo(Nino other) {
        if (this.comportamiento == other.getComportamiento()) {
            return this.peso - other.getPeso();
        } else {
            return other.comportamiento - this.getComportamiento();
        }
    }
}
