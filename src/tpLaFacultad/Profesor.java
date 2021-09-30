package tpLaFacultad;

class Profesor extends Persona{
    double basico;
    int antiguedad;

    public Profesor(String nombre, String Apellido, int legajo, double basico, int antiguedad) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    /*
    public double calcularSueldo(){

    }
     */

    @Override
    public String toString() {
        return "Profesor: " + super.toString();
    }

    @Override
    public void modificarDatos() {

    }
}
