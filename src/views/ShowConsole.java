package views;
import java.util.Scanner;
public class ShowConsole{
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {
        System.out.println("---- Métodos de búsqueda ----");
    }

    public int inputCode() {
        System.out.print("Ingrese un código: ");
        return scanner.nextInt();
    }

    public String inputName() {
        System.out.print("Ingrese un nombre: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public void showMesagge(String mensaje) {
        System.out.println(mensaje);
    }
}