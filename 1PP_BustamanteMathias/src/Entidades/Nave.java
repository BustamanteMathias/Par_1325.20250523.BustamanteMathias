package Entidades;

import java.util.Comparator;
import java.util.List;

public abstract class Nave implements Comparable<Nave> {
    protected String nombre;
    protected int capacidadDeTripulacion;
    protected int anioDeLanzamiento;

    public int getCapacidadDeTripulacion() {
        return capacidadDeTripulacion;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    protected Nave(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capacidadDeTripulacion = capacidadDeTripulacion;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    public abstract String iniciarExploracion();

    @Override
    public int compareTo(Nave n) {
        return this.nombre.compareToIgnoreCase(n.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Nave aux = (Nave) obj;
        return this.nombre.equals(aux.nombre) && this.anioDeLanzamiento == aux.anioDeLanzamiento;
    }

    public static void ordenarCriterio(List<Nave> listaNaves, Comparator<Nave> criterio) {
        listaNaves.sort(criterio);
    }
}
