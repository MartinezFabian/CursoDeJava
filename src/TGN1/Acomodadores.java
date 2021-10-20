package TGN1;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public void setSueldo(double sueldo) {
        super.setSueldo(sueldo);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo();
    }

    @Override
    public String toString() {
        return "\nAcomodador:\n" +
                "nombre:" + getNombre() +
                ", edad: " + getEdad() +
                ", sueldo: $" + getSueldo() + "\n";
    }
}
