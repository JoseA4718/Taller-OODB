package Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase {

    private String curso;
    private String horario;
    private List<Estudiante> estudiantes;
    private static int numClases;

    public Clase(String curso,String horario, List<Estudiante> estudiantes, int numClases){
        this.curso = curso;
        this.horario = horario;
        this.estudiantes = estudiantes;
        this.numClases = numClases;
    }
    public void matricular(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }

    public void claseDada(){
        numClases -= 1;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getNumClases() {
        return numClases;
    }

    public void setNumClases(int numClases) {
        this.numClases = numClases;
    }


    @Override
    public String toString() {
        return "Clase{" +
                "curso='" + curso + '\'' +
                ", horario='" + horario + '\'' +
                ", estudiantes=" + estudiantes +
                ", numClases=" + numClases +
                '}';
    }
}
