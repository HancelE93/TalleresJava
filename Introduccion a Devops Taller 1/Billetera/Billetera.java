public class Billetera {
    double balanceTotal;
    String moneda="USD";
    String titular;
    boolean cuentaActiva = true;

    public BilleteraVirtual(String titular, double saldoInicial) {
        this.titular = titular;
        this.balanceTotal = saldoInicial;
    }

    public void transferir(double monto) {
        System.out.println("Iniciando transaccion...")
        balanceTotal = balanceTotal - monto;
        Systemo.out.println("Transferencia exitosa de $: "+ monto);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + balanceTotal);
    }
}   