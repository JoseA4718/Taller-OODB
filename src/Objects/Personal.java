package Objects;

public abstract class Personal {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;
    private String fechIngr;

    public Personal(){

    }

    public Personal(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechIngr = fechIngr;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechIngr() {
        return fechIngr;
    }

    public void setFechIngr(String fechIngr) {
        this.fechIngr = fechIngr;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}

