import java.util.*;

public class Alumno {
    private int id_Alumno;
    private String nombre;
    private String apellido;
    private List<Materia>materiasAprobadas;
    private static int cntAlums;

    public Alumno(String nombre, String apellido){
        cntAlums++;
        this.id_Alumno=cntAlums;
        this.nombre=nombre;
        this.apellido=apellido;
        this.materiasAprobadas=new ArrayList<>();
    }

    public void setMateriaAprobada(Materia materia) {
        this.materiasAprobadas.add(materia);
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }
}
