package clasedia16;

public class TestExist {
 
    public static void main(String[] args) {
 
        // Arreglo de Integer

        Integer numeros[] = {1, 2, 3, 4, 5};
 
        System.out.println("Buscar 3 en numeros:");

        System.out.println(UtilGenerico.exist(numeros, 3)); // true
 
        System.out.println("Buscar 8 en numeros:");

        System.out.println(UtilGenerico.exist(numeros, 8)); // false
 
 
        //Arreglo de Golosinas

        Golosina g1 = new Golosina("Caramelo", 0.5);

        Golosina g2 = new Golosina("Chicle", 0.2);

        Golosina g3 = new Golosina("Gomita", 0.3);
 
        Golosina arregloGolosinas[] = {g1, g2, g3};
 
        // Golosina a buscar

        Golosina buscar = new Golosina("Chicle", 0.2);
 
        System.out.println("\nBuscar Golosina (Chicle, 0.2):");

        System.out.println(UtilGenerico.exist(arregloGolosinas, buscar)); // true

    }

}
 