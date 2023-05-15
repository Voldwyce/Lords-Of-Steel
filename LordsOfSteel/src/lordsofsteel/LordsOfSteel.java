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
    static String colorVermell = "\u001B[31m";
    static String colorVerd = "\u001B[32m";
    static String colorBlau = "\u001B[34m";
    static String colorTaronja = "\u001B[33m";
    static String colorLila = "\u001B[35m";
    static String colorBlauCel = "\u001B[36m";
    static String colorReset = "\u001B[0m";
    static String colorBlanc = "\u001B[37m";

    public static void main(String[] args) {

        // Clases proba
        Nan n1 = new NanOrdre("Tirion", 9, 6, 13, 16, 16, 0, new Arma("Daga"));
        Huma h1 = new HumaOrdre("Luis", 15, 18, 8, 12, 7, 0, new Arma("Espasa"));
        Mitja mi1 = new MitjaCaos("Frodo", 15, 7, 7, 15, 16, 0, new Arma("Martell"));
        Maia ma1 = new MaiaCaos("Nilf", 7, 9, 12, 15, 17, 0, new Arma("Daga"));

        // Personatge[] personatges = new Personatge[4];
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        personatges.add(n1);
        personatges.add(h1);
        personatges.add(mi1);
        personatges.add(ma1);

        System.out.println("");
        System.out.println(colorVermell + "        __                                           __");
        System.out.println(colorVermell + "       (**)                                         (**)");
        System.out.println(colorVermell + "       IIII                                         IIII");
        System.out.println(colorVermell + "       ####                                         ####");
        System.out.println(colorVermell + "       HHHH     	             " + colorBlanc + "LORDS" + colorVermell + "                  HHHH");
        System.out.println(colorVermell + "       HHHH                                         HHHH");
        System.out.println(colorVermell + "       ####                                         ####");
        System.out.println(colorVermell + "    ___IIII___                                   ___IIII___");
        System.out.println(colorVermell + " .-`_._\"**\"_._`-.                             .-`_._\"**\"_._`-.");
        System.out.println(colorVermell + "|/``  .`\\/`.  ``\\|            " + colorBlanc + "OF" + colorVermell + "             |/``  .`\\/`.  ``\\|");
        System.out.println(colorVermell + "`     }    {     '                           `     }    {     '");
        System.out.println(colorVermell + "      ) () (                                       ) () (");
        System.out.println(colorVermell + "      ( :: )                                       ( :: )");
        System.out.println(colorVermell + "      | :: |                                       | :: |");
        System.out.println(colorVermell + "      | )( |                 " + colorBlanc + "STEEL" + colorVermell + "                 | )( |");
        System.out.println(colorVermell + "      | || |                                       | || |");
        System.out.println(colorVermell + "      | || |                                       | || |");
        System.out.println(colorVermell + "      | || |                                       | || |");
        System.out.println(colorVermell + "      ( () )                                       ( () )");
        System.out.println(colorVermell + "       \\  /                                         \\  /");
        System.out.println(colorVermell + "        \\/                                           \\/");
        System.out.println(colorReset);
        System.out.println("Pulsa enter per continuar: ");
        sc.nextLine();

        boolean sortir = false;

        while (!sortir) {
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

            System.out.print("Seleccionar: ");
            int opcio = verificarMenu(sc.nextLine(), 5);
            switch (opcio) {
                case 1:
                    crearPersonatge(personatges);
                    break;
                case 2:
                    esborrarPersonatge(personatges);
                    break;
                case 3:
                    editarPersonatge(personatges);
                    break;
                case 4:
                    System.out.println("");
                    iniciarCombat(personatges);
                    break;
                case 5:
                    sortir = true;
                    System.out.println("");
                    System.out.println(colorVerd + "         _.---,._,'");
                    System.out.println(colorVerd + "       /' _.--.<");
                    System.out.println(colorVerd + "         /'     `'");
                    System.out.println(colorVerd + "       /' _.---._____");
                    System.out.println(colorVerd + "       \\.'   ___, .-'`");
                    System.out.println(colorVerd + "           /'    \\\\             .");
                    System.out.println(colorVerd + "         /'       `-.          -|-");
                    System.out.println(colorVerd + "        |                       |");
                    System.out.println(colorVerd + "        |                   .-'~~~`-.");
                    System.out.println(colorVerd + "        |                 .'         `.");
                    System.out.println(colorVerd + "        |                 |  A D E U  |");
                    System.out.println(colorVerd + "        |                 |           |");
                    System.out.println(colorVerd + "        |                 |           |");
                    System.out.println(colorVerd + "         \\              \\\\|           |//");
                    System.out.println(colorVerd + "   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                    System.out.println(colorReset);
                    break;
                default:
                    break;
            }
        }
    }

    public static void crearPersonatge(ArrayList<Personatge> personatges) {
        boolean crearPersonatge = false;
        String gameMode = "(1) Crear   ";
        mostrarMenu(gameMode);
        int crearSortir = verificarMenu(sc.nextLine(), 2);
        crearPersonatge = sortir(crearSortir);
        while (!crearPersonatge) {

            System.out.println("+-------------------------+");
            System.out.println("|                         |");
            System.out.println("|         |Clase|         |");
            System.out.println("|                         |");
            System.out.println("| 1. Huma                 |");
            System.out.println("| 2. Nan                  |");
            System.out.println("| 3. Maia                 |");
            System.out.println("| 4. Mitja                |");
            System.out.println("|                         |");
            System.out.println("+-------------------------+");
            System.out.println("");

            int puntsRestants = 60;
            String nomArma;
            System.out.print("Selecció: ");
            int opcio = verificarMenu(sc.nextLine(), 4);;
            System.out.println("");

            System.out.print("Introdueix el nom del personatge: ");
            String nom = sc.nextLine();
            System.out.println("");
            System.out.println("Tens " + puntsRestants + " punts per repartir entre les següents característiques:");
            System.out.println("Força / Constitució / Velocitat / Intel·ligència / Sort");
            System.out.println("");

            System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
            int forca = verificarMenu(sc.nextLine(), puntsRestants);

            puntsRestants -= forca;

            System.out.print("Constitució (màxim " + puntsRestants + " punts disponibles): ");
            int constitucio = verificarMenu(sc.nextLine(), puntsRestants);

            puntsRestants -= constitucio;

            System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
            int velocitat = verificarMenu(sc.nextLine(), puntsRestants);

            puntsRestants -= velocitat;

            System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
            int intelligencia = verificarMenu(sc.nextLine(), puntsRestants);

            puntsRestants -= intelligencia;

            System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
            int sort = verificarMenu(sc.nextLine(), puntsRestants);

            puntsRestants -= sort;

            System.out.println("");
            System.out.println(colorVermell + "Et queden " + puntsRestants + " punts per distribuir, pots asignarlos al editar el personatge" + colorReset);
            System.out.println("");

            System.out.println("Selecciona una opció d'arma:");
            System.out.println("");
            System.out.println("1. Daga");
            System.out.println("2. Espassa");
            System.out.println("3. Martell");
            System.out.println("");
            System.out.print("Selecció: ");
            int opcioArma = verificarMenu(sc.nextLine(), 3);
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
            System.out.println("");
            System.out.println("Selecciona una pasiva: ");
            System.out.println("");
            System.out.println(colorTaronja + "1. Ordre (Robatori de vida)" + colorReset);
            System.out.println(colorLila + "2. Caos (Atac extra)" + colorReset);
            System.out.println("");
            System.out.print("Selecció: ");
            int opcio2 = verificarMenu(sc.nextLine(), 2);
            if (opcio == 1 && opcio2 == 1) {
                HumaOrdre nouHumaOrdre = new HumaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouHumaOrdre);
                System.out.println("Personatge creat: " + colorVerd + nouHumaOrdre.getNom() + colorTaronja + " (Ordre)" + colorReset);
            } else if (opcio == 1 && opcio2 == 2) {
                HumaCaos nouHumaCaos = new HumaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouHumaCaos);
                System.out.println("Personatge creat: " + colorVerd + nouHumaCaos.getNom() + colorLila + " (Caos)" + colorReset);
            } else if (opcio == 2 && opcio2 == 1) {
                NanOrdre nouNanOrdre = new NanOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouNanOrdre);
                System.out.println("Personatge creat: " + colorVerd + nouNanOrdre.getNom() + colorTaronja + " (Ordre)" + colorReset);
            } else if (opcio == 2 && opcio2 == 2) {
                NanCaos nouNanCaos = new NanCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouNanCaos);
                System.out.println("Personatge creat: " + colorVerd + nouNanCaos.getNom() + colorLila + " (Caos)" + colorReset);
            } else if (opcio == 3 && opcio2 == 1) {
                MaiaOrdre nouMaiaOrdre = new MaiaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMaiaOrdre);
                System.out.println("Personatge creat: " + colorVerd + nouMaiaOrdre.getNom() + colorTaronja + " (Ordre)" + colorReset);
            } else if (opcio == 3 && opcio2 == 2) {
                MaiaCaos nouMaiaCaos = new MaiaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMaiaCaos);
                System.out.println("Personatge creat: " + colorVerd + nouMaiaCaos.getNom() + colorLila + " (Caos)" + colorReset);
            } else if (opcio == 4 && opcio2 == 1) {
                MitjaOrdre nouMitjaOrdre = new MitjaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMitjaOrdre);
                System.out.println("Personatge creat: " + colorVerd + nouMitjaOrdre.getNom() + colorTaronja + " (Ordre)" + colorReset);
            } else if (opcio == 2 && opcio2 == 2) {
                MitjaCaos nouMitjaCaos = new MitjaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMitjaCaos);
                System.out.println("Personatge creat: " + colorVerd + nouMitjaCaos.getNom() + colorLila + " (Caos)" + colorReset);
            }
            mostrarMenu(gameMode);
            crearSortir = verificarMenu(sc.nextLine(), 2);
            crearPersonatge = sortir(crearSortir);

        }

    }

    public static void esborrarPersonatge(ArrayList<Personatge> personatges) {

        boolean borrarPersonatge = false;
        String gameMode = "(1) Esborrar";
        mostrarMenu(gameMode);
        int crearSortir = verificarMenu(sc.nextLine(), 2);
        borrarPersonatge = sortir(crearSortir);

        System.out.println("");
        while (!borrarPersonatge) {

            mostrarPersonatges(personatges);
            if (personatges.size() <= 0) {
                System.out.println(colorVermell + "No hi ha personatges a esborrar!!" + colorReset);
                borrarPersonatge = true;
                break;
            }
            System.out.println("");
            System.out.print("Personatge a esborrar: ");
            int opcio = verificarMenu(sc.nextLine(), personatges.size()) - 1;

            if (opcio >= 0 && opcio < personatges.size()) {
                Personatge personatgeEsborrat = personatges.remove(opcio);
                System.out.println("Personatge " + colorVermell + personatgeEsborrat.getNom() + " esborrat" + colorReset + " amb èxit.");
            } else {
                System.out.println("El personatge proporcionat és invàlid. Si us plau, selecciona un altre vàlid.");
            }
            mostrarMenu(gameMode);
            crearSortir = verificarMenu(sc.nextLine(), 2);
            borrarPersonatge = sortir(crearSortir);
        }

    }

    public static void editarPersonatge(ArrayList<Personatge> personatges) {
        boolean editarPersonatge = false;
        String gameMode = "(1) Editar  ";
        mostrarMenu(gameMode);
        int crearSortir = verificarMenu(sc.nextLine(), 2);
        System.out.println("");
        editarPersonatge = sortir(crearSortir);

        while (!editarPersonatge) {
            mostrarPersonatges(personatges);
            if (personatges.size() <= 0) {
                System.out.println(colorVermell + "No hi ha personatges a editar!!" + colorReset);
                editarPersonatge = true;
                break;
            }
            System.out.println("");
            System.out.println("Selecciona el personatge a editar:");
            int opcio = verificarMenu(sc.nextLine(), personatges.size()) - 1;

            if (opcio >= 0 && opcio < personatges.size()) {
                Personatge personatge = personatges.get(opcio);
                System.out.println("Has seleccionat a " + personatge.getNom() + ". A continuació, pots editar les seves estadístiques.");

                int puntsRestants = personatge.getConstitucio() + personatge.getForca() + personatge.getIntelligencia() + personatge.getSort() + personatge.getVelocitat();
                if (puntsRestants < 60) {
                    puntsRestants = 60;
                }

                // Mostrar estadísticas actuales
                System.out.println("Estadístiques actuals:");
                System.out.println("Força: " + personatge.getForca());
                System.out.println("Constitucio: " + personatge.getConstitucio());
                System.out.println("Velocitat: " + personatge.getVelocitat());
                System.out.println("Intel·ligència: " + personatge.getIntelligencia());
                System.out.println("Sort: " + personatge.getSort());
                System.out.println("Punts disponibles per repartir: " + puntsRestants);

                // Solicitar las nuevas estadísticas
                System.out.print("Nova força (màxim " + puntsRestants + " punts disponibles): ");
                int novaForca = verificarMenu(sc.nextLine(), puntsRestants);

                puntsRestants -= novaForca;

                System.out.print("Nova constitucio (màxim " + puntsRestants + " punts disponibles): ");
                int novaConstitucio = verificarMenu(sc.nextLine(), puntsRestants);

                puntsRestants -= novaConstitucio;

                System.out.print("Nova velocitat (màxim " + puntsRestants + " punts disponibles): ");
                int novaVelocitat = verificarMenu(sc.nextLine(), puntsRestants);

                puntsRestants -= novaVelocitat;

                System.out.print("Nova intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
                int novaIntel = verificarMenu(sc.nextLine(), puntsRestants);

                puntsRestants -= novaIntel;

                System.out.print("Nova sort (màxim " + puntsRestants + " punts disponibles): ");
                int novaSort = verificarMenu(sc.nextLine(), puntsRestants);

                puntsRestants -= novaSort;

                // Actualizar las estadísticas del personaje
                personatge.setForca(novaForca);
                personatge.setConstitucio(novaConstitucio);
                personatge.setVelocitat(novaVelocitat);
                personatge.setIntelligencia(novaIntel);
                personatge.setSort(novaSort);

                System.out.println("");
                System.out.println("Les estadístiques del personatge s'han actualitzat amb" + colorVerd + " èxit." + colorReset);
                if (puntsRestants > 0) {
                    System.out.println("");
                    System.out.println(colorVermell + "Recorda que et falten: " + puntsRestants + " punt(s) per asignar" + colorReset);
                    System.out.println("");
                }
            } else {
                System.out.println("Opció no vàlida. Si us plau, selecciona un personatge vàlid.");
            }
            mostrarMenu(gameMode);
            crearSortir = verificarMenu(sc.nextLine(), 2);
            editarPersonatge = sortir(crearSortir);
        }
    }

    public static void iniciarCombat(ArrayList<Personatge> personatges) {

        boolean combat = false;
        String gameMode = "(1) Combat  ";
        mostrarMenu(gameMode);
        int crearSortir = verificarMenu(sc.nextLine(), 2);
        combat = sortir(crearSortir);

        if (personatges.size() < 2) {
            System.out.println("");
            System.out.println(colorVermell + "No hi ha personatges suficients, minim 2!!" + colorReset);
            combat = true;

        }

        while (!combat) {

            boolean[] seleccionats = new boolean[personatges.size()];
            Personatge[] lluitador = new Personatge[2];

            //  for (Personatge p : personatges)
            for (int selec = 1; selec <= 2; selec++) {
                boolean personatgeRepetit = true;
                while (personatgeRepetit) {
                    for (int i = 0; i < personatges.size(); i++) {
                        if (!seleccionats[i]) {

                            String tipus = " ";
                            if (personatges.get(i) instanceof Nan && personatges.get(i) instanceof Caos) {
                                tipus = "Nan" + colorVermell + " Caos" + colorReset;
                            } else if (personatges.get(i) instanceof Nan && personatges.get(i) instanceof Ordre) {
                                tipus = "Nan" + colorTaronja + " Ordre" + colorReset;
                            } else if (personatges.get(i) instanceof Huma && personatges.get(i) instanceof Caos) {
                                tipus = "Huma" + colorVermell + " Caos" + colorReset;
                            } else if (personatges.get(i) instanceof Huma && personatges.get(i) instanceof Ordre) {
                                tipus = "Huma" + colorTaronja + " Ordre" + colorReset;
                            } else if (personatges.get(i) instanceof Mitja && personatges.get(i) instanceof Caos) {
                                tipus = "Mitja" + colorVermell + " Caos" + colorReset;
                            } else if (personatges.get(i) instanceof Mitja && personatges.get(i) instanceof Ordre) {
                                tipus = "Mitja" + colorTaronja + " Caos" + colorReset;
                            } else if (personatges.get(i) instanceof Maia && personatges.get(i) instanceof Caos) {
                                tipus = "Maia" + colorVermell + " Caos" + colorReset;
                            } else if (personatges.get(i) instanceof Maia && personatges.get(i) instanceof Ordre) {
                                tipus = "Maia" + colorTaronja + " Caos" + colorReset;
                            }

                            System.out.println((i + 1) + ". " + personatges.get(i).getNom() + " (" + tipus + ")");
                        }

                    }

                    System.out.printf("\nTria un personatge " + selec + " : ");
                    int opcio = verificarMenu(sc.nextLine(), personatges.size());

                    if (!seleccionats[opcio - 1]) {
                        seleccionats[opcio - 1] = true;
                        lluitador[selec - 1] = personatges.get(opcio - 1);
                        personatgeRepetit = false;

                        System.out.println("Personatge triat: " + colorVerd + personatges.get(opcio - 1).getNom() + colorReset);
                        System.out.println("");
                        if (personatges.get(opcio - 1).getPs() == 0) {
                            System.out.println("");
                            System.out.println(colorVermell + "El personatge: " + personatges.get(opcio - 1).getNom() + " s'ha suicidat" + colorReset);
                            System.out.println("");
                        }
                    } else {
                        System.out.println("");
                        System.out.println(colorVermell + "Aquest personatge ja ha estat seleccionat. Tria un altre." + colorReset);
                        System.out.println("");
                    }
                }
            }

            // Inici combat
            Personatge atacant = lluitador[0];
            Personatge defensor = lluitador[1];

            int vida1 = lluitador[0].getPs();
            int vida2 = lluitador[1].getPs();

            Dau dau1 = new Dau();
            Dau dau2 = new Dau();
            Dau dau3 = new Dau();

            int ronda = 0;

            while (atacant.getPs() > 0 && defensor.getPs() > 0) {
                System.out.println(atacant.getNom() + " Intenta atacar");

                int valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
                System.out.println("Valor daus atacant: " + valor);
                System.out.println("");

                if (valor <= atacant.getPa()) {
                    valor = dau1.llencar() + dau2.llencar() + dau3.llencar();
                    System.out.println(defensor.getNom() + " Intenta esquivar l'atac");
                    System.out.println("Valor daus defensor: " + valor);
                    System.out.println("");

                    if (valor > defensor.getPe()) {
                        defensor.setPs(defensor.getPs() - atacant.getPd());
                        System.out.println(defensor.getNom() + " ha sigut atacat, ha perdut: " + atacant.getPd());
                        System.out.println("Vida restant: " + defensor.getPs());
                        if (atacant instanceof Ordre) {
                            atacant.restaurarPS();
                            System.out.println("S'ha robat un 10% de vida a l'enemic");
                            if (lluitador[0].getPs() > vida1) {
                                lluitador[0].setPs(vida1);
                            } else if (lluitador[1].getPs() > vida2) {
                                lluitador[1].setPs(vida2);
                            }
                        }
                        if (atacant instanceof Caos) {
                            boolean atacarDeNou = atacant.atacPAReduida(dau1, dau2, dau3);
                            if (atacarDeNou) {
                                defensor.setPs(defensor.getPs() - atacant.getPd());
                                System.out.println(defensor.getNom() + " ha sigut atacat de nou, ha perdut: " + atacant.getPd());
                                System.out.println("Vida restant: " + defensor.getPs());
                            } else {
                                System.out.println("Ha fallat l'atac extra ");
                            }
                        }

                    } else {
                        System.out.println(defensor.getNom() + " ha evitat l'atac");
                    }
                } else {
                    System.out.println(defensor.getNom() + " ha evitat l'atac");
                }
                System.out.println("");
                System.out.println("Vida de " + atacant.getNom() + ": " + atacant.getPs());
                System.out.println("Vida de " + defensor.getNom() + ": " + defensor.getPs());
                System.out.println("");
                System.out.println(colorBlau + "Ronda: " + ronda + colorReset);
                System.out.println("----------");
                ronda++;

                // Intercambi rols
                Personatge aux = atacant;
                atacant = defensor;
                defensor = aux;
            }

            // Finalitzar combat
            Personatge guanyador = (atacant.getPs() > 0) ? atacant : defensor;
            Personatge perdedor = (atacant.getPs() > 0) ? defensor : atacant;
            System.out.println("El guanyador és: " + colorVerd + guanyador.getNom() + colorReset);

            lluitador[0].setPs(vida1);
            lluitador[1].setPs(vida2);

            System.out.println("");
            System.out.println("El guanyador ha obtingut: " + perdedor.getPs() + " punts d'experiencia");
            System.out.println("Experiencia " + guanyador.getPex() + " --> " + (guanyador.getPex() + perdedor.getPs()));
            guanyador.setPex(guanyador.getPex() + perdedor.getPs());
            if (guanyador.getPex() >= guanyador.getPexSiguienteNivel()) {
                guanyador.subirDeNivel();
                System.out.println("Felicitats " + colorVerd + guanyador.getNom() + colorReset + " ha pujat de nivell!! " + colorBlauCel + "Lvl: " + guanyador.getNivell() + colorReset);
                System.out.println("");
                System.out.println("Noves estadistiques:");
                System.out.println("Força: " + guanyador.getForca());
                System.out.println("Constitucio: " + guanyador.getConstitucio());
                System.out.println("Velocitat: " + guanyador.getVelocitat());
                System.out.println("Intel·ligència: " + guanyador.getIntelligencia());
                System.out.println("Sort: " + guanyador.getSort());
            }

            // Nuevo combate o salir
            System.out.println("");
            System.out.println("Vols iniciar un nou combat? (s/n)");
            System.out.print("Selecció: ");
            String opcio = sc.nextLine().toLowerCase();
            while (!opcio.equalsIgnoreCase("s") && !opcio.equalsIgnoreCase("n")) {
                System.out.println(colorVermell + "Input incorrecte" + colorReset);
                System.out.print("Selecció: ");
                opcio = sc.nextLine();
            }

            if (opcio.equalsIgnoreCase("n")) {
                combat = true;
                System.out.println("Tornant al menú principal...");
            }

        }

    }

    public static int verificarMenu(String input, int maxValor) {
        boolean valorValid = false;
        int valor = 0;

        while (!valorValid) {
            try {
                valor = Integer.parseInt(input);
                if (valor <= maxValor && valor >= 0) {
                    valorValid = true;
                } else {
                    System.out.println(colorVermell + "Número no vàlid" + colorReset);
                    System.out.print("Introdueix un valor correcte: ");
                    return verificarMenu(sc.nextLine(), maxValor);
                }
            } catch (NumberFormatException e) {
                System.out.println(colorVermell + "Input incorrecte" + colorReset);
                System.out.print("Introdueix un valor correcte: ");
                return verificarMenu(sc.nextLine(), maxValor);
            }
        }

        return valor;
    }

    // No llistat de combat
    public static void mostrarPersonatges(ArrayList<Personatge> personatges) {
        for (int i = 0; i < personatges.size(); i++) {
            String tipus = " ";
            if (personatges.get(i) instanceof Nan && personatges.get(i) instanceof Caos) {
                tipus = "Nan" + colorVermell + " Caos" + colorReset;
            } else if (personatges.get(i) instanceof Nan && personatges.get(i) instanceof Ordre) {
                tipus = "Nan" + colorTaronja + " Ordre" + colorReset;
            } else if (personatges.get(i) instanceof Huma && personatges.get(i) instanceof Caos) {
                tipus = "Huma" + colorVermell + " Caos" + colorReset;
            } else if (personatges.get(i) instanceof Huma && personatges.get(i) instanceof Ordre) {
                tipus = "Huma" + colorTaronja + " Ordre" + colorReset;
            } else if (personatges.get(i) instanceof Mitja && personatges.get(i) instanceof Caos) {
                tipus = "Mitja" + colorVermell + " Caos" + colorReset;
            } else if (personatges.get(i) instanceof Mitja && personatges.get(i) instanceof Ordre) {
                tipus = "Mitja" + colorTaronja + " Caos" + colorReset;
            } else if (personatges.get(i) instanceof Maia && personatges.get(i) instanceof Caos) {
                tipus = "Maia" + colorVermell + " Caos" + colorReset;
            } else if (personatges.get(i) instanceof Maia && personatges.get(i) instanceof Ordre) {
                tipus = "Maia" + colorTaronja + " Caos" + colorReset;
            }

            System.out.println((i + 1) + ". " + personatges.get(i).getNom() + " (" + tipus + ")");
        }
    }

    public static boolean sortir(int opcio) {
        switch (opcio) {
            case 1:
                return false;
            case 2:
                System.out.println("Sortint...");
                return true;
            default:
                throw new AssertionError();
        }
    }

    public static void mostrarMenu(String menu) {
            System.out.println("");
            System.out.println("+------------------------+");
            System.out.println("|     " + menu + "       |");
            System.out.println("|     (2) Sortir         |");
            System.out.println("+------------------------+");
            System.out.println("");
            System.out.print("Selecciona una opció: ");
    }

}
