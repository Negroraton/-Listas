import java.util.*;

public class Main {


    public static void main(String[] args) {


        HashMap<Integer, String> listaCompras = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        String nombre;
        String codigo = null;

        while (opcionElegida != 5) {
            System.out.println("Lista de Compras");
            System.out.println("1. Agregar Articulos");
            System.out.println("2. listar Articulos");
            System.out.println("3. Borrar Articulos");
            System.out.println("4. Modificar Articulos");
            System.out.println("5. Cerrar");
            System.out.print("opcion: ");
            opcionElegida = sc.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Introduce el codigo del Articulo");
                    codigo = sc.next();
                    System.out.println("Introduce el nombre del Articulo");
                    nombre = sc.next();
                    agregarArticulos(Integer.valueOf(codigo), nombre, listaCompras);
                    break;
                case 2:
                    mostrarArticulos(codigo, listaCompras);
                    break;
                case 3:
                    System.out.println("Introduce el códido del articulo que quieres eliminar:");
                    codigo = sc.next();
                    eliminaArticulo(Integer.valueOf(codigo), listaCompras);
                    break;
                case 4:
                    System.out.println("Introduce el códido del articulo que quieres modificar:");
                    codigo = sc.next();
                    modificarArticulo(Integer.valueOf(codigo), listaCompras);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Tiene que introducir una opcion valida");
            }
        }
    }

    private static void modificarArticulo(Integer codigo, HashMap<Integer, String> listaCompras) {
        Scanner sc = new Scanner(System.in);
        if (listaCompras.containsKey(codigo)) {
            System.out.println("Introduce el precio del producto:");
            listaCompras.put(codigo, sc.next());
        } else {
            System.out.println("No hay ningun producto con ese codigo.");
        }
    }

    private static void eliminaArticulo(Integer codigo, HashMap<Integer, String> listaCompras) {
        if (listaCompras.containsKey(codigo)) {
            listaCompras.remove(codigo);
            System.out.println("Se elimino el articulo con ese codigo.");
        } else {
            System.out.println("No hay ningun articulo con ese codigo.");
        }
    }


    private static void mostrarArticulos(String codigo, HashMap<Integer, String> listaCompras) {
        Integer clave;
        Iterator<Integer> articulos = listaCompras.keySet().iterator();
        System.out.println("Hay los siguientes articulos:");
        while (articulos.hasNext()) {
            clave = articulos.next();
            System.out.println(clave + " - " + listaCompras.get(clave));

        }
    }

    private static void agregarArticulos(Integer codigo, String nombre, HashMap<Integer, String> listaCompras) {
        if (listaCompras.containsKey(codigo)) {
            System.out.println("No se puede introducir el Articulo. El código esta repetido.");
        } else {
            listaCompras.put(Integer.valueOf(codigo), nombre);
        }
    }
}
