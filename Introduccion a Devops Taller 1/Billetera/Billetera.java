public class Billetera {
    double balanceTotal;
    String moneda = USD;
    String titular;
    boolean cuentaActiva = true;

  
    public Billetera(String titular, double saldoInicial) {
        this.titular = titular;
        this.balanceTotal = saldoInicial;
    }

    public void transferir(double monto) {
        if (monto > balanceTotal) {
            System.out.println("Fondos insuficientes");
            return;
        }
        System.out.println("Iniciando transaccion...");

        System.out.println("Iniciando transaccion...")
        balanceTotal = balanceTotal - monto;
        Systemo.out.println("Transferencia exitosa de $: " + monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }
}