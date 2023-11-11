
package proyectozoologico;

import java.util.List;

public class Veterinario extends Persona{
   
    private String telefono;
    private String Especializacion; 
    private String Area;  
    private int añosEmpleo; 
    private float salario; 
    private String certificado; 
    private String estado; 

    public Veterinario(String telefono, String Especializacion, String Area, int añosEmpleo, float salario, String certificado, String estado, String id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.telefono = telefono;
        this.Especializacion = Especializacion;
        this.Area = Area;
        this.añosEmpleo = añosEmpleo;
        this.salario = salario;
        this.certificado = certificado;
        this.estado = estado;
    }


    public Veterinario() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getAñosEmpleo() {
        return añosEmpleo;
    }

    public void setAñosEmpleo(int añosEmpleo) {
        this.añosEmpleo = añosEmpleo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     public void agregaVeterinario(List<Veterinario>ListVeterinario,String telefono, String Especializacion, String Area, int añosEmpleo, float salario, String certificado, String estado, String id, String nombre, String apellido, int edad) {
         
        ListVeterinario.add(new  Veterinario(telefono, Especializacion, Area, añosEmpleo, salario, certificado, estado, id, nombre, apellido, edad));
    }
    
   
    
    public int buscaVeterinario(List<Veterinario>ListVeterinario,String id ){
        for(int i = 0; i < ListVeterinario.size(); i++){
            if(ListVeterinario.get(i).getId().equalsIgnoreCase(id)){
              return i;
            }//Cierre if
        }//Cierre for
        return -1;
    }//Cierre buscaVeterinario 
    
}
