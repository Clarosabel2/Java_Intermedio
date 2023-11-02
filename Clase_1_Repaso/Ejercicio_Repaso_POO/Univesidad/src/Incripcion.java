public class Incripcion {
    public static boolean aprobada(Alumno alum, Materia mat){
        for(Materia matAprobada:alum.getMateriasAprobadas()){
            if(!mat.getMatCorrelativas().contains(matAprobada)){
                return false;
            }
        }
        return true;
    }
}
