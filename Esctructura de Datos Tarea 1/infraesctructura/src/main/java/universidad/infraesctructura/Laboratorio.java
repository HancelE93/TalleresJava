package universidad.infraesctructura;

public class Laboratorio {
	private String nombreLab;
    private int capacidad;
    private boolean equiposEncendidos;

    public Laboratorio(String nombreLab, int capacidad) {
        this.nombreLab = nombreLab;
        this.capacidad = capacidad;
        this.equiposEncendidos = false;
    }

    public void abrirLaboratorio() {
        equiposEncendidos = true;
        System.out.println("El laboratorio " + nombreLab + " ha sido abierto. ¿Equipos encendidos? " + equiposEncendidos);
    }

    public void mostrarInformacion() {
        System.out.println("--- Info Lab: " + nombreLab + " | Capacidad: " + capacidad + " personas ---");
    }
}