import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Materia  {
    private int id_Materia;
    private String nombre_Materia;
    private String descripcion;
    private List<Materia>matCorrelativas;
    private static int cntMateria;

    public Materia(String nombreMateria){
        cntMateria++;
        this.id_Materia=cntMateria;
        this.nombre_Materia=nombreMateria;
        this.descripcion=null;
        this.matCorrelativas=new ArrayList<>();
    }
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
