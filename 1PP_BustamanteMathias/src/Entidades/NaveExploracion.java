package Entidades;

public class NaveExploracion extends Nave {
    private ETipoExploracion tipoExploracion;

    public NaveExploracion(String nombre, int capacidadDeTripulacion, int anioDeLanzamiento, ETipoExploracion tipoExploracion) {
        super(nombre, capacidadDeTripulacion, anioDeLanzamiento);
        this.setTipoExploracion(tipoExploracion);
    }

    public ETipoExploracion getTipoExploracion() {
        return tipoExploracion;
    }

    public void setTipoExploracion(ETipoExploracion tipoExploracion) {
        this.tipoExploracion = tipoExploracion;
    }

    @Override
    public String toString() {
        return "[NAVE DE EXPLORACION] Nombre: " + super.nombre +
                " - Tripulacion: " + super.capacidadDeTripulacion +
                " - Año de lanzamiento: " + super.anioDeLanzamiento +
                " - Tipo de exploracion: " + this.getTipoExploracion();
    }

    @Override
    public String iniciarExploracion() {
        return "Se inicia explocacion para nave... " + this;
    }
}
