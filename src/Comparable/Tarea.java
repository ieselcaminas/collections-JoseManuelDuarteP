package Comparable;

public class Tarea implements Comparable<Tarea> {
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Prioridad: " + prioridad + ", duracion: " + duracion;
    }

    @Override
    public int compareTo(Tarea other) {

        if (other.prioridad == this.prioridad) {
            return this.duracion - other.duracion;
        } else {
            return other.prioridad - this.prioridad;
        }

    }

}
