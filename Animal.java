package proyectozoologico;

public class Animal extends Especie{
    private int id;
    private String nombre;
    private String especie;
    private String veterinarioAsignado;
    private String tipoAlimentacion;
    private String area;
    private int edad; 
    private char genero; 
   private float peso; 

    public Animal(int id, String nombre, String especie, String veterinarioAsignado, String tipoAlimentacion, String area, int edad, char genero, float peso) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.veterinarioAsignado = veterinarioAsignado;
        this.tipoAlimentacion = tipoAlimentacion;
        this.area = area;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
    }

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getVeterinarioAsignado() {
        return veterinarioAsignado;
    }

    public void setVeterinarioAsignado(String veterinarioAsignado) {
        this.veterinarioAsignado = veterinarioAsignado;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
 public void agregaAnimal(List<Animal>ListAnimal,int id, String nombre, String especie, String veterinarioAsignado, String tipoAlimentacion, String area, int edad, char genero, float peso) {
         
        ListAnimal.add(new  Animal(id, nombre, especie, veterinarioAsignado, tipoAlimentacion, area, edad, genero, peso));
    }
    
   
    
    public int buscaAnimal(List<Animal>ListAnimal,int id ){
        for(int i = 0; i < ListAnimal.size(); i++){
            if(ListAnimal.get(i).getId()== id){
              return i;
            }//Cierre if
        }//Cierre for
        return -1;
    }//Cierre buscaAnimal 
     
}
