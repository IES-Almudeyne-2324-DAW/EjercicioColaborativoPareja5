//Clase de Instituto con los atributos nombre, ciudad, codigo y clases
public class Instituto {
    String nombre;
    String ciudad;
    String codigo;
    int clases;

    //Constructor que recibe como parámetros los atributos indicados en la clase Instituto
    public Instituto(String nombre, String ciudad, String codigo, int clases) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.clases = clases;
    }

    //Métodos Setters y Getters de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setclases(int clases) {
        this.clases = clases;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getClases() {
        return clases;
    }

    //Método para cambiar el nombre del instituto
    public String cambiarNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
        return nombre;
    }

    //Método para cambiar el número de clases del instituto
    public int cambiarNumClases(int numClases) {
        this.clases = numClases;
        return clases;
    }
}