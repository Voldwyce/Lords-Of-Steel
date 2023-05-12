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
        Nan n1 = new Nan("Tirion", 8, 6, 13, 16, 16, 0, new Arma("Daga"));
        // Persontage normal (8+5)/4 = 3
        // Nan pd = (8+6+5)/4 = 4
        // Nan ps = (8+6) = 14
        // System.out.println("Punts de dany de n1: " + n1.getPd());
        // System.out.println("Punts de vida de n1" + n1.getPs());

        Huma h1 = new Huma("Luis", 13, 16, 6, 10, 6, 0, new Arma("Espasa"));
        Mitja mi1 = new Mitja("Frodo", 9, 7, 7, 15, 16, 0, new Arma("Martell"));
        Maia ma1 = new Maia("Nilf", 7, 9, 12, 15, 17, 0, new Arma("Daga"));

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
        //String menuOption = sc.nextLine();
        //System.out.print("Seleccionar: ");
        int opcio = sc.nextInt();
        boolean valor = false;
        switch (opcio) {
            case 1:
                crearPersonatge(personatges);
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

    public static void crearPersonatge(ArrayList<Personatge> personatges) {

        System.out.println("+-------------------------+");
        System.out.println("|                         |");
        System.out.println("|    |Clase|     |");
        System.out.println("|                         |");
        System.out.println("| 1. Huma    |");
        System.out.println("| 2. Nan |");
        System.out.println("| 3. Maia  |");
        System.out.println("| 4. Mitja      |");
        System.out.println("|                         |");
        System.out.println("+-------------------------+");
        System.out.println("");
        //String menuOption = sc.nextLine();
        //System.out.print("Seleccionar: ");
            String nom = "";
    int puntsRestants = 60;
    int forca = 0;
     int velocitat = 0;
     int intelligencia = 0;
     int sort = 0;
     int opcioArma = 0;
     String nomArma;
        int opcio = sc.nextInt();
        switch (opcio) {
case 1:
    System.out.print("Introdueix el nom del personatge: ");
    nom = sc.next();
        String humaNom = nom;
    System.out.println("Tens " + puntsRestants + " punts per repartir entre les següents característiques:");

    System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
    forca = sc.nextInt();
    while (forca > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
        forca = sc.nextInt();
    }
    puntsRestants -= forca;

    System.out.print("Constitució (màxim " + puntsRestants + " punts disponibles): ");
    int constitucio = sc.nextInt();
    while (constitucio > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Constitució (màxim " + puntsRestants + " punts disponibles): ");
        constitucio = sc.nextInt();
    }
    puntsRestants -= constitucio;

    System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
    velocitat = sc.nextInt();
    while (velocitat > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
        velocitat = sc.nextInt();
    }
    puntsRestants -= velocitat;

    System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
     intelligencia = sc.nextInt();
    while (intelligencia > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
        intelligencia = sc.nextInt();
    }
    puntsRestants -= intelligencia;

    System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
    sort = sc.nextInt();
    while (sort > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
        sort = sc.nextInt();
    }
    puntsRestants -= sort;

    System.out.println("Et queden " + puntsRestants + " punts per distribuir.");

    System.out.println("Selecciona una opció d'arma:");
    System.out.println("1. Daga");
    System.out.println("2. Espassa");
    System.out.println("3. Martell");
    opcioArma = sc.nextInt();
    switch (opcioArma) {
        case 1:
            nomArma = "Daga";
            break;
        case 2:
            nomArma = "Espassa";
            break;
        case 3:
            nomArma = "Martell";
            break;
        default:
            throw new AssertionError();
    }

    System.out.println("Selecciona una opció:");
    System.out.println("1. Ordre");
    System.out.println("2. Caos");
    int opcio2huma = sc.nextInt();
    switch (opcio2huma) {
        case 1:
            HumaOrdre nouHumaOrdre = new HumaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
            personatges.add(nouHumaOrdre);
            System.out.println("Personatge creat: " + nouHumaOrdre.getNom() + " (Ordre)");
            break;
        case 2:
            HumaCaos nouHumaCaos = new HumaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
            personatges.add(nouHumaCaos);
          System.out.println("Personatge creat: " + nouHumaCaos.getNom() + " (Caos)");
            break;
        default:
            throw new AssertionError();
    }
    break;

            case 2:
System.out.print("Introdueix el nom del personatge: ");
    nom = sc.next();
    puntsRestants = 60;

    System.out.println("Tens " + puntsRestants + " punts per repartir entre les següents característiques:");

    System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
    forca = sc.nextInt();
    while (forca > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
        forca = sc.nextInt();
    }
    puntsRestants -= forca;

    System.out.print("Constitució (màxim " + puntsRestants + " punts disponibles): ");
    constitucio = sc.nextInt();
    while (constitucio > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Constitució (màxim " + puntsRestants + " punts disponibles): ");
        constitucio = sc.nextInt();
    }
    puntsRestants -= constitucio;

    System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
    velocitat = sc.nextInt();
    while (velocitat > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
        velocitat = sc.nextInt();
    }
    puntsRestants -= velocitat;

    System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
    intelligencia = sc.nextInt();
    while (intelligencia > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
        intelligencia = sc.nextInt();
    }
    puntsRestants -= intelligencia;

    System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
   sort = sc.nextInt();
    while (sort > puntsRestants) {
        System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
        System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
        sort = sc.nextInt();
    }
    puntsRestants -= sort;

    System.out.println("Et queden " + puntsRestants + " punts per distribuir.");

    System.out.println("Selecciona una opció d'arma:");
    System.out.println("1. Daga");
    System.out.println("2. Espassa");
    System.out.println("3. Martell");
    opcioArma = sc.nextInt();
    
    switch (opcioArma) {
        case 1:
            nomArma = "Daga";
            break;
        case 2:
            nomArma = "Espassa";
            break;
        case 3:
            nomArma = "Martell";
            break;
        default:
            throw new AssertionError();
    }

    System.out.println("Selecciona una opció:");
    System.out.println("1. Ordre");
    System.out.println("2. Caos");
    int opcio2nan = sc.nextInt();
    switch (opcio2nan) {
        case 1:
            NanOrdre nouNanOrdre = new NanOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
            personatges.add(nouNanOrdre);
            System.out.println("Personatge creat: " + nouNanOrdre.getNom() + " (Ordre)");
            break;
        case 2:
            NanCaos nouNanCaos = new NanCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
            personatges.add(nouNanCaos);
          System.out.println("Personatge creat: " + nouNanCaos.getNom() + " (Caos)");
            break;
        default:
            throw new AssertionError();
    }
    break;
            case 3:

                break;
            case 4:

                break;

            default:
                throw new AssertionError();
        }

    }

    public static void iniciarCombat(ArrayList<Personatge> personatges) {

        boolean[] seleccionats = new boolean[personatges.size()];
        Personatge[] lluitador = new Personatge[2];

        //  for (Personatge p : personatges)
        for (int selec = 1; selec <= 2; selec++) {

            for (int i = 0; i < personatges.size(); i++) {
                if (!seleccionats[i]) {

                    String tipus = " ";
                    if (personatges.get(i) instanceof Nan) {
                        tipus = "Nan";
                    } else if (personatges.get(i) instanceof Huma) {
                        tipus = "Huma";
                    } else if (personatges.get(i) instanceof Mitja) {
                        tipus = "Mitja";
                    } else if (personatges.get(i) instanceof Maia) {
                        tipus = "Maia";
                    }

                    System.out.printf("%d %s\n", (i + 1), personatges.get(i).getNom(), tipus);
                }

            }
            System.out.printf("\nTria un personatge" + selec + " : ");
            int opcio = sc.nextInt();
            seleccionats[opcio - 1] = true;
            lluitador[selec - 1] = personatges.get(opcio - 1);

            System.out.println("Personatge triat: " + personatges.get(opcio - 1).getNom());
        }

        // Inici combat
        Personatge atacant = lluitador[0];
        Personatge defensor = lluitador[1];

        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();

        int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
        // System.out.println("Valor daus: " + valor);

        if (valor <= atacant.getPa()) { // Atacant ataca
            valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
            if (valor > defensor.getPe()) { // No aconsegueix esquivar
                defensor.setPs(defensor.getPs() - atacant.getPd());
            }
        }

        // Final ronda
        Personatge aux = atacant;
        atacant = defensor;
        defensor = aux;

        /*
        atacant.setPs(atacant.getPs());
        defensor.setPs(defensor.getPs());
        int pexGanador = defensor.getPs();
        atacant.setPex(atacant.getPex() + pexGanador);
        if (atacant.subirDeNivel()) {
            atacant.calculaEstadistiquesSecundaries();
        } */
        // public static void verificarMenu(String menuOption) {
        //  }
    }
}
