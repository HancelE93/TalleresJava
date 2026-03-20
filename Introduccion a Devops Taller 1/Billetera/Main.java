import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Billetera miBilletera = new Billetera("Juan Perez", 100.0);
        Billetera miBilletera2 = new Billetera("Maria Lopez", 500.0);

        System.out.println("=== BIENVENIDO AL SISTEMA BANCARIO ===");

        miBilletera2.mostrarSaldo();

        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuánto desea transferir? ");
        double monto = sc.nextDouble();

        miBilletera.mostrarSaldo();
        miBilletera.transferir(monto);
        miBilletera.transferir(30.0);
        miBilletera.transferir(10.0);
        miBilletera.mostrarSaldo();
    }
}