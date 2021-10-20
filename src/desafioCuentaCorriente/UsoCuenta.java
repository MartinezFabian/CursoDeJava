package desafioCuentaCorriente;

public class UsoCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Luis Fernandez", 5000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Fabricio Dominguez", 2500);

        System.out.println(cuenta1.verInformacionDeCuenta());
        System.out.println(cuenta2.verInformacionDeCuenta());

        cuenta1.transferencia(cuenta1, cuenta2, 2500);

        System.out.println("\nTransferencia realizada.\n");

        System.out.println(cuenta1.verInformacionDeCuenta());
        System.out.println(cuenta2.verInformacionDeCuenta());

    }
}
