package Objects;

public class Estudiante extends Personal{

    private String carnetEst;
    private String carrera;
    private String emailEst;
    private int clasesRecibidas;

    public Estudiante(){

    }

    public Estudiante(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String carnetEst, String carrera, String emailEst, int clasesRecibidas) {
        super(nombre, apellido, cedula, direccion, telefono, fechIngr);
        this.carnetEst = carnetEst;
        this.carrera = carrera;
        this.emailEst = emailEst;
        this.clasesRecibidas = clasesRecibidas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnetEst='" + carnetEst + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", cedula='" + this.getCedula() + '\'' +
                ", direccion='" + this.getDireccion() + '\'' +
                ", telefono='" + this.getTelefono() + '\'' +
                ", fechaIngr='" + this.getFechIngr() + '\'' +
                ", carrera='" + carrera + '\'' +
                ", emailEst='" + emailEst + '\'' +
                ", clasesRecibidas=" + clasesRecibidas +
                '}';
    }
    public void cambioCarrera(String carreraNueva){
        this.carrera = carreraNueva;
    }
    public void asistirClase(){
        this.clasesRecibidas += 1;
    }
}
