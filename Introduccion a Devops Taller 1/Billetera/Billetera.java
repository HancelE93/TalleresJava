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
        if (monto > balanceTotal) {
            System.out.println("Fondos insuficientes");
            return;
        }

        balanceTotal = balanceTotal - monto;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }
}