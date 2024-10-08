package p110_CuentaBancariaV1;

public class CuentaBancaria {
    private double Saldo;

    public CuentaBancaria(double saldo) {
        Saldo = saldo;
    }
    
    public void deposita(double cantidad) {
        Saldo = Saldo + cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }

    public boolean retira(double cantidad) {
        if( Saldo >= cantidad ) {
            Saldo = Saldo - cantidad;
            return true;
        } else return false;
    }
}
