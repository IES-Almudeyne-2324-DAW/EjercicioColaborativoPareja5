public class Instituto {
    String nombre;
    String ciudad;
    String codigo;
    int clases;

    public Instituto(String nombre, String ciudad, String codigo, int clases) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codigo = codigo;
        this.clases = clases;
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

    public String cambiarNombre(String nombre) {
        return nombre = "IES Al-mudeyne";
    }

    public int cambiarNumClases(int clases) {
        return clases = 120;
    }
}