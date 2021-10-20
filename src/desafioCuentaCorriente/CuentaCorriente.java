package desafioCuentaCorriente;

public class CuentaCorriente {
    private String nombreTitular;
    private long numeroCuenta;
    private double saldo;


    //Constructor
    public CuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        numeroCuenta = (long) (Math.random()*1000000000 + 1);
    }

    public void transferencia(CuentaCorriente cuenta1, CuentaCorriente cuenta2, double importe){
        cuenta1.reintegro(importe);
        cuenta2.ingresar(importe);
    }

    public String verInformacionDeCuenta() {
        return "Informacion de cuenta: " +
                "\nnombreTitular: " + nombreTitular +
                "\nnumeroCuenta:" + numeroCuenta +
                "\nsaldo: $" + saldo;
    }

    public void reintegro(double reintegro){
        this.saldo = this.saldo - reintegro;
    }

    public void ingresar(double ingreso) {
        this.saldo = this.saldo + ingreso;
    }

    public double getSaldo() {
        return saldo;
    }
}
