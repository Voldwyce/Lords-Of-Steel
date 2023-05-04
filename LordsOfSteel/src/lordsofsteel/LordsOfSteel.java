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

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //  Maia morderK = new Maia(4,8,3,9,2);
        Nan n1 = new Nan("Tirion", 8, 6, 13, 16, 16, new Arma("Daga"));
        // Persontage normal (8+5)/4 = 3
        // Nan pd = (8+6+5)/4 = 4
        // Nan ps = (8+6) = 14
        // System.out.println("Punts de dany de n1: " + n1.getPd());
        // System.out.println("Punts de vida de n1" + n1.getPs());

        Huma h1 = new Huma("Luis", 13, 16, 6, 10, 6, new Arma("Espasa"));
        Mitja mi1 = new Mitja("Frodo", 9, 7, 7, 15, 16, new Arma("Martell"));
        Maia ma1 = new Maia("Nilf", 7, 9, 12, 15, 17, new Arma("Daga"));

        // Personatge[] personatges = new Personatge[4];
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);

        System.out.println("");
        System.out.println(" L      OOOO   SSSSS ");
        System.out.println(" L     O    O  S     ");
        System.out.println(" L     O    O  SSSSS ");
        System.out.println(" L     O    O      S ");
        System.out.println(" L     O    O      S ");
        System.out.println(" L     O    O  S   S ");
        System.out.println(" LLLL   OOOO    SSS  ");

        System.out.println("");

        System.out.println("+-------------------------+");
        System.out.println("|                         |");
        System.out.println("|     Menu Principal      |");
        System.out.println("|                         |");
        System.out.println("| (1) Crear Personatge    |");
        System.out.println("| (2) Esborrar Personatge |");
        System.out.println("| (3) Editar  Personatge  |");
        System.out.println("| (4) Iniciar combat      |");
        System.out.println("| (5) Sortir              |");
        System.out.println("|                         |");
        System.out.println("+-------------------------+");
        System.out.println("");
        String menuOption = sc.nextLine();
        int opcio = Integer.parseInt(menuOption);
        System.out.print("Seleccionar: ");
        boolean valor = false;
        switch (opcio) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                System.out.println("");
                iniciarCombat(personatges);
                break;
            case 5:

                break;
            default:
                throw new AssertionError();
        }

    }

    public static void iniciarCombat(ArrayList<Personatge> personatges) {

        //  for (Personatge p : personatges)
        for (int i = 0; i < personatges.size(); i++) {
            System.out.printf("%d %s\n", (i + 1), personatges.get(i).getNom());
        }

        System.out.printf("\nTria un personatge: ");
        int entrada = sc.nextInt();

    }

}
