package Comparable;

public class Analfabeto implements Comparable<Analfabeto> {
    private String pais;
    private int cuantos;

    public Analfabeto(String pais, int cuantos) {
        this.pais = pais;
        this.cuantos = cuantos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCuantos() {
        return cuantos;
    }

    public void setCuantos(int cuantos) {
        this.cuantos = cuantos;
    }

    @Override
    public String toString() {
        return this.pais + " - " + this.cuantos;
    }

    @Override
    public int compareTo(Analfabeto other) {
        return this.cuantos - other.cuantos;
    }
}
