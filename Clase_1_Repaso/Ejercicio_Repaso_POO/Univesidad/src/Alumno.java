import java.util.*;

public class Alumno {
    //Atributos
    private int id_Alumno;
    private String nombre;
    private String apellido;
    private List<Materia>materiasAprobadas;
    private static int cntAlums;

    //Constructor
    public Alumno(String nombre, String apellido){
        cntAlums++;
        this.id_Alumno=cntAlums;
        this.nombre=nombre;
        this.apellido=apellido;
        this.materiasAprobadas=new ArrayList<>();
    }
    //Getters Y Setters
    public int getId_Alumno() {
        return id_Alumno;
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

    public void setMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
