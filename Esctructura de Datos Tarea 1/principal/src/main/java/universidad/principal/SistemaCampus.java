package universidad.principal;

import universidad.infraesctructura.Laboratorio;
import universidad.usuarios.Estudiante;

public class SistemaCampus {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Carlos Pérez","","Ingenieria en Sistemas", 2);
        Estudiante estudiante2 = new Estudiante("María López", "", "Medicina",4);

        Laboratorio laboratorio = new Laboratorio("Laboratorio de Computación", 30);

        laboratorio.mostrarInformacion();
        laboratorio.abrirLaboratorio();
        estudiante1.presentarse();
        estudiante1.estudiar();
        estudiante2.presentarse();
    }
}