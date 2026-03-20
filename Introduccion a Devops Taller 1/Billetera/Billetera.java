public class Billetera {
    double balanceTotal;
    String moneda=USD;
    String titular;
    boolean cuentaActiva = true;

    public Billetera(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public void transferir(double monto) {
<<<<<<< HEAD
        if (monto > balanceTotal) {
            System.out.println("Fondos insuficientes");
            return;
        }

=======
        System.out.println("Iniciando transaccion...")
>>>>>>> fa57878353f2f2893f42379371bdaf1c95f0bcf8
        balanceTotal = balanceTotal - monto;
        Systemo.out.println("Transferencia exitosa de $: "+ monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }
}