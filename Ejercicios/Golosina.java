package Ejercicios;

class Golosina {
    private String nombre;
    public Golosina(String nombre) { this.nombre = nombre; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Golosina g = (Golosina) obj;
        return nombre.equals(g.nombre);
    }
}

class Chocolatina {
    private String tipo;
    public Chocolatina(String tipo) { this.tipo = tipo; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Chocolatina c = (Chocolatina) obj;
        return tipo.equals(c.tipo);
    }
}
