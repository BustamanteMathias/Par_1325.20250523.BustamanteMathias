package Entidades;

public class Carguero extends Nave {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento, int capacidadCarga) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.setcapacidadCarga(capacidadCarga);
    }

    public int getcapacidadCarga() {
        return capacidadCarga;
    }

    public void setcapacidadCarga(int capacidadCarga) {
        if (capacidadCarga < 100) {
            capacidadCarga = 100;
        }
        if (capacidadCarga <= 500) {
            this.capacidadCarga = capacidadCarga;
        }
    }

    @Override
    public String toString() {
        return "[NAVE CARGUERO] Nombre: " + super.nombre +
                " - Tripulacion: " + super.capacidadDeTripulacion +
                " - Año de lanzamiento: " + super.anioDeLanzamiento +
                " - Cap. de carga: " + this.getcapacidadCarga();
    }

    @Override
    public String iniciarExploracion() {
        return "Se inicia explocacion para nave... " + this;
    }
}
