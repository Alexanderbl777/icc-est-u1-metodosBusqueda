public class App {
    MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] numeros = {3, 7, 1, 9, 5};
        int valorBuscado = 9;

        int resultado = app.metodosBusqueda.busquedaLineal(numeros, 0, valorBuscado);

        if (resultado != -1) {
            System.out.println("Valor encontrado en la posición: " + resultado);
        } else {
            System.out.println("Valor no encontrado.");
        }
    }
}
