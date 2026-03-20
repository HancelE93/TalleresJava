public class Main {
    public static void main(String[] args) {
        Billetera miBilletera = new Billetera("Juan Perez", 100.0);
        Billetera miBilletera2 = new Billetera("Maria Lopez", 500.0);

        System.out.println("===BIENVENIDO AL SISTEMA BANCARIO===");

        miBilletera2.mostrarSaldo();

        miBilletera.mostrarSaldo();
        miBilletera.transferir(20.0);
        miBilletera.transferir(30.0);
        miBilletera.transferir(10.0);
        miBilletera.mostrarSaldo();
    }
}