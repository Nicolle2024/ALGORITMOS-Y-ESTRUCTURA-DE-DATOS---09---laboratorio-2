package Ejercicios;

public class MetodoExist {

    public static <T> boolean exist(T[] arreglo, T elemento) {

        for (T item : arreglo) {
            if (item.equals(elemento)) {
                return true;
            }
        }
        return false;
    }
}


