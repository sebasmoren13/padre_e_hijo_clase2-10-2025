public class Cliente extends Persona {


    private String categoria;
    private String codigo;



    // VACIO


    public Cliente() {
    }



    //Los demas valores



    public Cliente(String nombre, String apellido, String documento, int edad, String categoria, String codigo) {
        super(nombre, apellido, documento, edad);
        this.categoria = categoria;
        this.codigo = codigo;
    }

// GETTER AND SETTER


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    //To string


    @Override
    public String toString() {
        return super.toString()+"Cliente{" +
                "categoria='" + categoria + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }


@Override
    public String mostrarInfo(){


        return "SOY UN CLIENTE"+"nombre:"+ nombre+ "Apellidio:" + apellido + "documento:" + documento +
                "Edad:"+ edad + "Categoria:" + categoria + "Codigo:" + codigo ;

    }

}
