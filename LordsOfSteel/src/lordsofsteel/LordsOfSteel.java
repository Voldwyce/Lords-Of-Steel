/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;
/**
 *
 * @author David
 */
import java.util.*;

public class LordsOfSteel {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //  Maia morderK = new Maia(4,8,3,9,2);
        
        /*
        System.out.println("");
        System.out.println("L      OOOO   SSSSS ");
        System.out.println("L     O    O  S     ");
        System.out.println("L     O    O  SSSSS ");
        System.out.println("L     O    O      S ");
        System.out.println("L     O    O      S ");
        System.out.println("L     O    O  S   S ");
        System.out.println("LLLL   OOOO    SSS  ");

        System.out.println("");

        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|     Menu Principal     |");
        System.out.println("|                        |");
        System.out.println("| (1) Jugar              |");
        System.out.println("| (2) Configuracion      |");
        System.out.println("| (3) Salir              |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");
        System.out.println("");
        System.out.print("Seleccionar: ");
        int menuOption = sc.nextInt();
        boolean valor = false;
        if (menuOption == 1) {
            System.out.println("Cargando...");
            System.out.println("...");
            System.out.println("");
            System.out.println("");
            valor = true;
        } else if (menuOption == 2) {
            System.out.println("Todavia no hay configuracion... :v ");
            System.out.println("Pulsa E para jugar.");
            String volver = sc.next();
        } else if (menuOption == 3) {
            System.out.println("Adios!!");
        }
*/

        Nan n1 = new Nan(8, 6, 13, 16, 16,new Arma("Daga"));
        // Persontage normal (8+5)/4 = 3
        // Nan (8+6+5)/4 = 4
        // Nan ps = (8+6) = 14
        System.out.println("Punts de dany de n1: " + n1.getPd());
        System.out.println("Punts de vida de n1" + n1.getPs());
    }

}
