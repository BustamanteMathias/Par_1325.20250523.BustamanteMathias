package Entidades;

public class CruceroEstelar extends Nave {
    private int capacidadDePasajeros;

    public CruceroEstelar(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento, int capacidadDePasajeros) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.setCapacidadDePasajeros(capacidadDePasajeros);
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    @Override
    public String toString() {
        return "[NAVE CRUCERO ESTELAR] Nombre: " + super.nombre +
                " - Tripulacion: " + super.capacidadDeTripulacion +
                " - Año de lanzamiento: " + super.anioDeLanzamiento +
                " - Cap. de pasajeros: " + this.getCapacidadDePasajeros();
    }

    @Override
    public String iniciarExploracion() {
        return "El CRUCERO ESTELAR " + super.nombre + " NO PUEDE INICIAR MISIONES DE EXPLORACION";
    }
}
