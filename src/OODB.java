import Objects.*;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OODB {

    public static File f_profes = new File("profesores.db4o");
    public static File f_estudiantes = new File("estudiantes.db4o");
    public static File f_administradores = new File("administradores.db4o");
    public static File f_clases = new File("clases.db4o");

    public static ObjectContainer db_prof = Db4oEmbedded.openFile(f_profes.getAbsolutePath());
    public static ObjectContainer db_estu = Db4oEmbedded.openFile(f_estudiantes.getAbsolutePath());
    public static ObjectContainer db_admin = Db4oEmbedded.openFile(f_administradores.getAbsolutePath());
    public static ObjectContainer db_clase = Db4oEmbedded.openFile(f_clases.getAbsolutePath());

    public static void main(String [] args){
        //llenarTablas();
        //darClase("201983698","2012654","Bases de Datos");
        //eliminarClase("352149985","Lenguajes y Compiladores");

        //consultarProfesores(null,null,null,null,null,null,null,null,null,0);
        //consultarEstudiantes(null,null,null,null,null,null,null,null,null,0);
        //consultarAdministradores(null,null,null,null,null,null,null,null,null);
        //consultarClases(null,null, null,0);
    }



    public static void eliminarClase(String cedulaAdministrador, String nombreCurso){
        Administrador a = new Administrador(null,null,cedulaAdministrador,null,null,null,null,null,null);
        ObjectSet<Administrador> res = db_admin.queryByExample(a);
        if (res.next().getNombre() != null){
            Clase c = new Clase(nombreCurso,null,null,0);
            ObjectSet<Clase> result3 = db_clase.queryByExample(c);
            if (result3.hasNext()){
                Clase cAct = result3.next();
                db_clase.delete(cAct);
            }
        }
    }

    public static void darClase(String carnetEstudiante, String carnetProfesor, String nombreCurso){

        Estudiante e = new Estudiante(null,null,null,null,null,null,carnetEstudiante,null,null,0);
        ObjectSet<Estudiante> result1 = db_estu.queryByExample(e);
        if (result1.hasNext()){
            Estudiante eAct = result1.next();
            eAct.asistirClase();
            db_estu.store(eAct);
        }

        Profesor p = new Profesor(null,null,null,null,null,null,carnetProfesor,null,null,0);
        ObjectSet<Profesor> result2 = db_prof.queryByExample(p);
        if (result2.hasNext()){
            Profesor pAct = result2.next();
            pAct.asistirClase();
            db_prof.store(pAct);
        }

        Clase c = new Clase(nombreCurso,null,null,0);
        ObjectSet<Clase> result3 = db_clase.queryByExample(c);
        if (result3.hasNext()){
            Clase cAct = result3.next();
            cAct.claseDada();
            db_clase.store(cAct);
        }
    }

    public static void llenarTablas(){
        crearEstudiantes();
        crearProfesores();
        crearAdministradores();
        crearClases();
    }
    public static void crearProfesores(){

        Profesor profesor1 = new Profesor("Marco", "Rivera","375986651", "Cartago","8888-8888","2010", "2010654","Computadores","marcorm@itcr.ac.cr",0);
        Profesor profesor2 = new Profesor("Luis Diego", "Noguera","775984521", "Cartago","9999-9999","2012", "2012654","Computadores","ldnoguera@itcr.ac.cr",0);
        Profesor profesor3 = new Profesor("Alfonso", "Chacon","375942653", "San Jose","7777-7777","2008", "2008789","Electronica","alchacon@itcr.ac.cr",0);
        Profesor profesor4 = new Profesor("Juan Jose", "Montero","35648521", "Cartago","6666-6666","2015", "2015658","Electronica","jjmontero@itcr.ac.cr",0);

        db_prof.store(profesor1);
        db_prof.store(profesor2);
        db_prof.store(profesor3);
        db_prof.store(profesor4);
    }
    public static void crearAdministradores(){

        Administrador admin1 = new Administrador("Luis Paulino","Méndez","352149985","Cartago","7542-6398","1995","Rectoría","lpm@itcr.ac.cr","Rector");
        Administrador admin2 = new Administrador("Alejandra","Marín","154632598","San Jose","7854-9636","2000","Rectoría","almarin@itcr.ac.cr","Vicerrectora");
        Administrador admin3 = new Administrador("Paulo","Monge Cruz","652341598","Puntarenas","2158-9634","2010","Consejo","pmc@itcr.ac.cr","Consejal");
        Administrador admin4 = new Administrador("Laura","Araya","789542301","Limon","4598-9632","2015","Consejo","laraya@itcr.ac.cr","Presidenta");

        db_admin.store(admin1);
        db_admin.store(admin2);
        db_admin.store(admin3);
        db_admin.store(admin4);
    }
    public static void crearEstudiantes(){

        Estudiante estudiante1 = new Estudiante("Jose Antonio", "Espinoza Chaves", "118140061","Cartago","7037-1999","2019", "201983698","Computadores","joseaectec@estudiantec.cr",0);
        Estudiante estudiante2 = new Estudiante("Michael", "Valverde Navarro", "305240399","Cartago","8402-4322","2020", "2020044189","Computadores","michaelvn1399@estudiantec.cr",0);
        Estudiante estudiante3 = new Estudiante("Isaac", "Herrera Monge", "352145687","Cartago","6352-5874","2019", "2019785420","Computadores","isaacoun100@estudiantec.cr",0);
        Estudiante estudiante4 = new Estudiante("Juan Daniel", "Rodriguez Montero", "354201699","Cartago","7525-9636","2020", "2020584621","Computadores","jdrm@estudiantec.cr",0);

        db_estu.store(estudiante1);
        db_estu.store(estudiante2);
        db_estu.store(estudiante3);
        db_estu.store(estudiante4);
    }
    public static void crearClases(){

        List<Estudiante> list1 = new ArrayList<Estudiante>();
        List<Estudiante> list2 = new ArrayList<Estudiante>();

        Clase clase1 = new Clase("Bases de Datos", "K-J (15:00-17:00)",list1,15);
        Clase clase2 = new Clase("Lenguajes y Compiladores", "M-V (13:00-15:00)",list1,15);

        db_clase.store(clase1);
        db_clase.store(clase2);
    }
    public static void consultarProfesores(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String carnetProf, String escuela, String emailProf, int clasesDadas){
        Profesor p = new Profesor(nombre,apellido,cedula,direccion,telefono,fechIngr,carnetProf,escuela,emailProf,clasesDadas);
        ObjectSet<Profesor> result = db_prof.queryByExample(p);

        while (result.hasNext()){
            System.out.println(result.next().toString());
        }
        db_prof.close();
    }
    public static void consultarEstudiantes(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String carnetEst, String carrera, String emailEst, int clasesRecibidas){
        Estudiante p = new Estudiante(nombre,apellido,cedula,direccion,telefono,fechIngr,carnetEst,carrera,emailEst,clasesRecibidas);
        ObjectSet<Estudiante> result = db_estu.queryByExample(p);

        while (result.hasNext()){
            System.out.println(result.next().toString());
        }
        db_estu.close();
    }
    public static void consultarAdministradores(String nombre, String apellido, String cedula, String direccion, String telefono, String fechIngr, String departamento, String emailAdmin, String posicion){
        Administrador p = new Administrador(nombre,apellido,cedula,direccion,telefono,fechIngr,departamento,emailAdmin,posicion);
        ObjectSet<Administrador> result = db_admin.queryByExample(p);

        while (result.hasNext()){
            System.out.println(result.next().toString());
        }
        db_admin.close();
    }
    public static void consultarClases(String curso,String horario, List<Estudiante> estudiantes, int numClases){
        Clase p = new Clase(curso, horario, estudiantes, numClases);
        ObjectSet<Clase> result = db_clase.queryByExample(p);

        while (result.hasNext()){
            System.out.println(result.next().toString());
        }
        db_clase.close();
    }
}
