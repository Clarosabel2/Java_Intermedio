public class Main {
    public static void main(String[] args) {
        //se instacia los alumnos
        Alumno alumno1 = new Alumno("Abel","Claros");
        Alumno alumno2 = new Alumno("Lorena","Sanchez");
        //se instancian los cursos
        Materia diseñoSistemas = new Materia("Diseño de Sistemas");
        Materia paradigmasProgramacion = new Materia("Paradigma de Programacion");
        Materia algEstructDatos = new Materia("Algoritmos y Estructura de Datos");
        //Se agregar las materias aprobadas por alumno
        alumno1.setMateriaAprobada(algEstructDatos);
        alumno2.setMateriaAprobada(paradigmasProgramacion);
        alumno2.setMateriaAprobada(algEstructDatos);
        //Se agregan las correlativas por mataria
        paradigmasProgramacion.setMateriaCorrelativa(algEstructDatos);
        diseñoSistemas.setMateriaCorrelativa(paradigmasProgramacion);

        System.out.println("Alumno 2:");
        if(Incripcion.aprobada(alumno2,diseñoSistemas)){
            System.out.println("Inscripto");
        }else{
            System.out.println("No se puede Inscribir porque no cumple con las correlativas");
        }
        System.out.println("Alumno 1: ");
        if(Incripcion.aprobada(alumno1,diseñoSistemas)){
            System.out.println("Inscripto");
        }else{
            System.out.println("No se puede Inscribir porque no cumple con las correlativas");
        }
    }
}