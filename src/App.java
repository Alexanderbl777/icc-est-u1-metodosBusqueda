import java.util.Scanner;

import controllers.MetodosBusqueda;
import models.Persona;
public class App {
   public static void main(String[] args) {

        Persona[] personas = new Persona[7];
        personas[0]=new Persona(101,"Juan"); 
        personas[1]=new Persona(102,"Maria");      personas[2]=new Persona(103,"Carlos"); 
        personas[3]=new Persona(104,"Ana"); 
        personas[4]=new Persona(105,"Luis"); 
        personas[5]=new Persona(106,"Sofia"); 
        personas[6]=new Persona(107,"Pedro"); 

        MetodosBusqueda mB = new MetodosBusqueda(personas);
        //int[] datos = {3, 5, 7, 9};
        //int posicion = metodosBusqueda.busquedaLineal(datos, 7);
        //System.out.println("Resultado de la búsqueda: " + posicion);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de búsqueda ---");
            System.out.println("1. Buscar por código");
            System.out.println("2. Buscar por nombre");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mB.showPerson(); 
                    break;
                case 2:
                    mB.showPersonByName();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    
    }

}
