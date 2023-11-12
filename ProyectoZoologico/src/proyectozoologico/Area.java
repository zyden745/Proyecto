
package proyectozoologico;

public class Area {
    private String nombre;
    private String descripcion;
    private int capacidad;
    private boolean activa;

    public Area() {
    }

    public Area(String nombre, String descripcion, int capacidad, boolean activa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.activa = activa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }


   
}
