import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<Integer,String> lista=new HashMap<>();

        lista.put(1, " Leche");
        lista.put(2, " Huevos");
        lista.put(3, " Yerba");
        lista.put(4, " Tomates");
        lista.put(5, " Azucar");
        lista.put(6, " Fideos");
        lista.put(7, " Vino");
        lista.put(8, " Mayonesa");
        lista.put(9, " Pan");

        System.out.println("la lista esta vacia?: " + lista.isEmpty());
        lista.forEach((k,v)-> System.out.println(" " + k + ". " + v));
        System.out.println("....................................................................");
        lista.remove(1);
        lista.remove(2);
        lista.remove(3);
        lista.remove(4);
        lista.remove(5);
        lista.remove(6);
        lista.remove(7);
        lista.remove(8);
        lista.remove(9);
        System.out.println("la lista esta vacia?: " + lista.isEmpty());
        lista.forEach((k,v)-> System.out.println(" " + k + ". " + v));

    }
}


