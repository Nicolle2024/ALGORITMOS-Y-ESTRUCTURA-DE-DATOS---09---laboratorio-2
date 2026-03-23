package Ejercicios;
import clasedia16.Chocolatina;

public class PrincipalCajo {

    public static void main(String[] args) {

        Cajoneria<Chocolatina> cajoneria = new Cajoneria<>(10);

        cajoneria.add(new Caja<>("Rojo", new Chocolatina("Milka")));
        cajoneria.add(new Caja<>("Azul", new Chocolatina("Ferrero")));
        cajoneria.add(new Caja<>("Verde", new Chocolatina("Nestlé")));
        cajoneria.add(new Caja<>("Amarillo", new Chocolatina("Milka")));

        // Mostrar
        System.out.println("Contenido:");
        System.out.println(cajoneria);

        // Buscar
        System.out.println("Buscar Milka:");
        System.out.println(cajoneria.search(new Chocolatina("Milka")));

        // Contar
        System.out.println("Cantidad de Milka:");
        System.out.println(cajoneria.count(new Chocolatina("Milka")));

        // Eliminar
        System.out.println("\nEliminar Milka:");
        System.out.println(cajoneria.delete(new Chocolatina("Milka")));

        // Final
        System.out.println("\nContenido final:");
        System.out.println(cajoneria);
    }
}
