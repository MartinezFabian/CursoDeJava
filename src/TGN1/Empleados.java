package TGN1;

public class Empleados extends Persona{
    private double sueldo;

    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "\nEmpleado:\n" +
                "nombre:" + getNombre() +
                ", edad: " + getEdad() +
                ", sueldo: $" + sueldo + "\n";
    }
}
