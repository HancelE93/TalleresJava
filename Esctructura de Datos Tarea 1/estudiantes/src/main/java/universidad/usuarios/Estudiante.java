package universidad.usuarios;

public class Estudiante {

	private String nombre;
	private String matricula;
	private String carrera;
	private int semestre;

	// 🔹 Constructor
	public Estudiante(String nombre, String matricula, String carrera, int semestre) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.carrera = carrera;
		this.semestre = semestre;
	}

	// 🔹 Método presentarse
	public void presentarse() {
		System.out.println("Hola, soy " + nombre + ", estudiante de " + carrera + " en el semestre " + semestre + ".");
	}

	// 🔹 Método estudiar
	public void estudiar() {
		System.out.println(
				"El estudiante " + nombre + " (Matrícula: " + matricula + ") está estudiando para sus exámenes.");
	}
}
