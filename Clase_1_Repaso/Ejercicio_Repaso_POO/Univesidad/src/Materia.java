import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia  {
    //Atributos
    private int id_Materia;
    private String nombre_Materia;
    private String descripcion;
    private List<Materia>matCorrelativas;
    private static int cntMateria;
    //Constructor
    public Materia(String nombreMateria){
        cntMateria++;
        this.id_Materia=cntMateria;
        this.nombre_Materia=nombreMateria;
        this.descripcion=null;
        this.matCorrelativas=new ArrayList<>();
    }
    //Getters y Setters
    public int getId_Materia() {
        return id_Materia;
    }
    
    public String getNombre_Materia() {
        return nombre_Materia;
    }

    public void setNombre_Materia(String nombre_Materia) {
        this.nombre_Materia = nombre_Materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //Se agregan las materias correlativas
    public void setMateriaCorrelativa(Materia mat){
        this.matCorrelativas.add(mat);
        for(var matc: mat.getMatCorrelativas()){
            this.matCorrelativas.add(matc);
        }
    }
    public List<Materia> getMatCorrelativas() {
        return matCorrelativas;
    }
}
