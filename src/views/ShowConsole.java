package views;
import java.util.Scanner;
public class ShowConsole{
    private Scanner scanner;
    

    public ShowConsole() {
    }

    public ShowConsole(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        showBanner();

    }

    public void showBanner(){
        System.out.println("----Metodos de busqueda----");

    }

    public int inputCode(){
        System.out.println("Ingrese un codigo");
        int code = scanner.nextInt();
        return code;
    }

    public void showMesagge(String mesagge){
        System.out.println(mesagge);
    }

}