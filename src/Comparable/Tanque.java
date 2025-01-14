package Comparable;

public class Tanque implements Comparable<Tanque> {
    private String nombreTanque;
    private double calibreTanque;

    public Tanque(String nombreTanque, double calibreTanque) {
        this.nombreTanque = nombreTanque;
        this.calibreTanque = calibreTanque;
    }

    public String getNombreTanque() {
        return this.nombreTanque;
    }

    public double getCalibreTanque() {
        return this.calibreTanque;
    }

    @Override
    public String toString() {
        return nombreTanque + " " + calibreTanque + "mm";
    }

    @Override
    public int compareTo(Tanque other) {
        if (this.calibreTanque == other.getCalibreTanque()) {
            return 0;
        } else if (this.calibreTanque > other.getCalibreTanque()) {
            return 1;
        } else {
            return -1;
        }
    }

}
