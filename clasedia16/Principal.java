package clasedia16;

public class Principal {

public static void main(String[] args) {

// Bolsa de Chocolatinas
Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);

Chocolatina c1 = new Chocolatina("Milka");
Chocolatina c2 = new Chocolatina("Ferrero");
Chocolatina c3 = new Chocolatina("Nestlé");

bolsaCho.add(c1);
bolsaCho.add(c2);
bolsaCho.add(c3);

System.out.println("Contenido de bolsa de chocolatinas:");
for (Chocolatina c : bolsaCho) {
System.out.println(c.getMarca());
}

// Bolsa de Golosinas
Bolsa<Golosina> bolsaGol = new Bolsa<>(3);

Golosina g1 = new Golosina("Caramelo", 0.5);
Golosina g2 = new Golosina("Chicle", 0.2);
Golosina g3 = new Golosina("Gomita", 0.3);

bolsaGol.add(g1);
bolsaGol.add(g2);
bolsaGol.add(g3);

System.out.println("\nContenido de bolsa de golosinas:");
for (Golosina g : bolsaGol) {
System.out.println(g.getNombre() + " - " + g.getPeso());
}
}
}



