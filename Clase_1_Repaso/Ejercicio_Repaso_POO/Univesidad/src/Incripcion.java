public class Incripcion {
    //Corrobora que las materia aprobadas cumplan con las correlativas del curso seleccionado y devuelve y Boolean
    public static boolean aprobada(Alumno alum, Materia mat){
        for(Materia matAprobada:alum.getMateriasAprobadas()){
            if(!mat.getMatCorrelativas().contains(matAprobada)){
                return false;
            }
        }
        return true;
    }
}
