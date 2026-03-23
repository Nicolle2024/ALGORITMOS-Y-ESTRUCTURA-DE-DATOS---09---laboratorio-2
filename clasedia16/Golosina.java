package clasedia16;
 
public class Golosina {
 
    private String nombre;
    private double peso;
 
    public Golosina(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public double getPeso() {
        return peso;
    }
 
    // para search, delete y exist
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Golosina)) return false;
 
        Golosina g = (Golosina) obj;
        return nombre.equals(g.nombre) && peso == g.peso;
    }
 
    @Override
    public String toString() {
        return "Golosina: " + nombre + " - " + peso;
    }
}