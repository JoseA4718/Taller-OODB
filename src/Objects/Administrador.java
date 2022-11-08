package Objects;

public class Administrador extends Personal{

    private String departamento;
    private String emailAdmin;
    private String posicion;

    public Administrador() {
    }

    public Administrador(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String departamento, String emailAdmin, String posicion) {
        super(nombre, apellido, cedula, direccion, telefono, fechIngr);
        this.departamento = departamento;
        this.emailAdmin = emailAdmin;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "departamento='" + departamento + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", emailAdmin='" + emailAdmin + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
