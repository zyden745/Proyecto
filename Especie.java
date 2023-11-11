
package proyectozoologico;
public abstract class Especie {
    private String tipo;
    private String descripcion;
    private int cantidad;

    public Especie() {
    }

    public Especie(String tipo, String descripcion, int cantidad) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


  
}
