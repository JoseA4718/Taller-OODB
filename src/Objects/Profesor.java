package Objects;

public class Profesor extends Personal {

    private String carnetProf;
    private String escuela;
    private String emailProf;
    private int clasesDadas;

    public Profesor(){

    }
    public Profesor(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String carnetProf, String escuela, String emailProf, int clasesDadas) {
        super(nombre, apellido, cedula, direccion, telefono, fechIngr);
        this.carnetProf = carnetProf;
        this.escuela = escuela;
        this.emailProf = emailProf;
        this.clasesDadas = clasesDadas;
    }


    public void asistirClase( ){
        this.clasesDadas += 1;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "carnetProf='" + carnetProf + '\'' +
                ", nombre='" + this.getNombre() + '\'' +
                ", apellido='" + this.getApellido() + '\'' +
                ", cedula='" + this.getCedula() + '\'' +
                ", direccion='" + this.getDireccion() + '\'' +
                ", telefono='" + this.getTelefono() + '\'' +
                ", fechaIngr='" + this.getFechIngr() + '\'' +
                ", escuela='" + escuela + '\'' +
                ", emailProf='" + emailProf + '\'' +
                ", clasesDadas=" + clasesDadas +
                '}';
    }
}
