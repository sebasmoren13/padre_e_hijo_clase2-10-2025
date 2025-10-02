import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Persona>lstPersona = new ArrayList<>();

        Persona c1= new Cliente("Pedro", "Lopez", "101010", 26 , "Auxiliar", "Aux1010");




        Persona e1= new Empleado("Lorena","Gil","202020",35,3200000,"Indefinido");

        lstPersona.add(c1);
        lstPersona.add(e1);



        for (Persona p: lstPersona){
            System.out.println(p.mostrarInfo());



        }













    }
}