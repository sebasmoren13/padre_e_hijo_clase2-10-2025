public class Empleado extends Persona{


    private String tipoCotrato;
    private int sueldo;



    // Valores vacio

    public Empleado() {
    }




    // Valores


    public Empleado(String nombre, String apellido, String documento, int edad, int sueldo, String tipoCotrato) {
        super(nombre, apellido, documento, edad);
        this.sueldo = sueldo;
        this.tipoCotrato = tipoCotrato;
    }


    // GETTER AND SETTER

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipoCotrato() {
        return tipoCotrato;
    }

    public void setTipoCotrato(String tipoCotrato) {
        this.tipoCotrato = tipoCotrato;
    }


    //To string


    @Override
    public String toString() {
        return super.toString()+"Empleado{" +
                "sueldo=" + sueldo +
                ", tipoCotrato='" + tipoCotrato + '\'' +
                '}';
    }



    @Override

    public String mostrarInfo(){


        return "SOY UN EMPLEADO"+"nombre:"+ nombre+ "Apellidio:" + apellido + "documento:" + documento +
                "Edad:"+ edad + "tipo contrato" + tipoCotrato + "Suelgo" + sueldo  ;

    }






}
