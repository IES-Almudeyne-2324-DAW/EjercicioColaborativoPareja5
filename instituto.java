public class Instituto {
    String nombre;
    String ciudad;
    String codigo;
    int clases;

    public Instituto(String nombre, String ciudad, String codigo, int clases) {
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.codigo=codigo;
        this.clases=clases;
    }

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

    public String cambiarNombre(String nombre) {
        return nombre = "IES Al-mudeyne";
    }
}