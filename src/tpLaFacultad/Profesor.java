package tpLaFacultad;

class Profesor extends Persona{
    double basico;
    int antiguedad;

    //Constructor
    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double calcularSueldo(){
        //calcula el sueldo sumando un 10% al básico por cada año de antiguedad
        return basico + ((basico * 10) / 100) * antiguedad;
    }

    @Override
    public void modificarDatos(String nombre, String apellido, int legajo) {
        setNombre(nombre);
        setApellido(apellido);
        setLegajo(legajo);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public String toString() {
        return "\nProfesor: " + super.toString();
    }

    @Override
    public int getLegajo() {
        return super.getLegajo();
    }

    @Override
    public void setLegajo(int legajo) {
        super.setLegajo(legajo);
    }

}
