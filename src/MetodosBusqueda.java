public class MetodosBusqueda {
    
    public int busquedaLineal(int[] arreglo, int indice, int valorBuscado) {
        if (indice >= arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == valorBuscado) {
            return indice;
        }
        return busquedaLineal(arreglo, indice + 1, valorBuscado); 
    }
}
