package clasedia16;

class DemoMetodoGenerico {

// Método genérico que compara dos arreglos
static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {

// Si las longitudes de los arrays son diferentes,
// entonces los arrays son diferentes
if (x.length != y.length)
return false;

// Se recorre cada posición del arreglo
for (int i = 0; i < x.length; i++) {

// Si algún elemento es diferente, retorna false
if (!x[i].equals(y[i]))
return false; // arrays diferentes
}

// Si todos los elementos son iguales
return true; // contenido de arrays equivalente
}

public static void main(String[] args) {

Integer nums[] = {1, 2, 3, 4, 5};
Integer nums2[] = {1, 2, 3, 4, 5};
Integer nums3[] = {1, 2, 7, 4, 5};
Integer nums4[] = {1, 2, 7, 4, 5, 6};

// Comparaciones entre arreglos
if (igualArrays(nums, nums))
System.out.println("nums es igual a nums");

if (igualArrays(nums, nums2))
System.out.println("nums es igual a nums2");

if (igualArrays(nums, nums3))
System.out.println("nums es igual a nums3");

if (igualArrays(nums, nums4))
System.out.println("nums es igual a nums4");


System.out.println("nums es igual a dvals");
}
}


