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

        Nan n1 = new Nan("Tirion", 8, 6, 13, 16, 16, 0, new Arma("Daga"));
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
            int opcio = verificarMenu(sc.nextLine());
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
                    System.out.println("Sortint...");
                    break;
                default:
                    break;
            }
        }
    }

    public static void crearPersonatge(ArrayList<Personatge> personatges) {
        boolean crearPersonatge = false;
        System.out.println("");
        System.out.println("1. Crear un personatge");
        System.out.println("2. Sortir");
        System.out.println("");
        System.out.print("Selecciona una opció: ");
        int crearSortir = sc.nextInt();
        switch (crearSortir) {
            case 1:
                crearPersonatge = false;
                break;
            case 2:
                crearPersonatge = true;
                System.out.println("Sortint...");
                break;
            default:
                throw new AssertionError();
        }
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
            int opcio = sc.nextInt();
            System.out.println("");

            System.out.print("Introdueix el nom del personatge: ");
            String nom = sc.next();
            System.out.println("Tens " + puntsRestants + " punts per repartir entre les següents característiques:");

            System.out.print("Força (màxim " + puntsRestants + " punts disponibles): ");
            int forca = sc.nextInt();
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
            int velocitat = sc.nextInt();
            while (velocitat > puntsRestants) {
                System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
                System.out.print("Velocitat (màxim " + puntsRestants + " punts disponibles): ");
                velocitat = sc.nextInt();
            }
            puntsRestants -= velocitat;

            System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
            int intelligencia = sc.nextInt();
            while (intelligencia > puntsRestants) {
                System.out.println("Has superat el límit de punts disponibles. Siusplau, introdueix un valor vàlid.");
                System.out.print("Intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
                intelligencia = sc.nextInt();
            }
            puntsRestants -= intelligencia;

            System.out.print("Sort (màxim " + puntsRestants + " punts disponibles): ");
            int sort = sc.nextInt();
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
            System.out.println("");
            System.out.print("Selecció: ");
            int opcioArma = sc.nextInt();
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

            System.out.println("Selecciona una pasiva: ");
            System.out.println("1. Ordre (Robatori de vida)");
            System.out.println("2. Caos (% Atac extra)");
            System.out.println("");
            System.out.print("Seleccoó: ");
            int opcio2 = sc.nextInt();
            if (opcio == 1 && opcio2 == 1) {
                HumaOrdre nouHumaOrdre = new HumaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouHumaOrdre);
                System.out.println("Personatge creat: " + nouHumaOrdre.getNom() + " (Ordre)");
            } else if (opcio == 1 && opcio2 == 2) {
                HumaCaos nouHumaCaos = new HumaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouHumaCaos);
                System.out.println("Personatge creat: " + nouHumaCaos.getNom() + " (Caos)");
            } else if (opcio == 2 && opcio2 == 1) {
                NanOrdre nouNanOrdre = new NanOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouNanOrdre);
                System.out.println("Personatge creat: " + nouNanOrdre.getNom() + " (Ordre)");
            } else if (opcio == 2 && opcio2 == 2) {
                NanCaos nouNanCaos = new NanCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouNanCaos);
                System.out.println("Personatge creat: " + nouNanCaos.getNom() + " (Caos)");
            } else if (opcio == 3 && opcio2 == 1) {
                MaiaOrdre nouMaiaOrdre = new MaiaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMaiaOrdre);
                System.out.println("Personatge creat: " + nouMaiaOrdre.getNom() + " (Ordre)");
            } else if (opcio == 3 && opcio2 == 2) {
                MaiaCaos nouMaiaCaos = new MaiaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMaiaCaos);
                System.out.println("Personatge creat: " + nouMaiaCaos.getNom() + " (Caos)");
            } else if (opcio == 4 && opcio2 == 1) {
                MitjaOrdre nouMitjaOrdre = new MitjaOrdre(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMitjaOrdre);
                System.out.println("Personatge creat: " + nouMitjaOrdre.getNom() + " (Ordre)");
            } else if (opcio == 2 && opcio2 == 2) {
                MitjaCaos nouMitjaCaos = new MitjaCaos(nom, forca, constitucio, velocitat, intelligencia, sort, 0, new Arma(nomArma));
                personatges.add(nouMitjaCaos);
                System.out.println("Personatge creat: " + nouMitjaCaos.getNom() + " (Caos)");
            }
            System.out.println("");
            System.out.println("1. Crear un personatge");
            System.out.println("2. Sortir");
            System.out.println("");
            System.out.print("Selecciona una opció: ");
            crearSortir = sc.nextInt();
            switch (crearSortir) {
                case 1:
                    crearPersonatge = false;
                    break;
                case 2:
                    crearPersonatge = true;
                    System.out.println("Sortint...");
                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

    public static void esborrarPersonatge(ArrayList<Personatge> personatges) {

        boolean borrarPersonatge = false;
        System.out.println("");
        System.out.println("1. Esborrar un personatge");
        System.out.println("2. Sortir");
        System.out.println("");
        System.out.print("Selecciona una opció: ");
        int crearSortir = sc.nextInt();
        switch (crearSortir) {
            case 1:
                borrarPersonatge = false;
                break;
            case 2:
                borrarPersonatge = true;
                System.out.println("Sortint...");
                break;
            default:
                throw new AssertionError();
        }
        System.out.println("");
        while (!borrarPersonatge) {

            for (int i = 0; i < personatges.size(); i++) {
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
            System.out.println("");
            System.out.print("Personatge a esborrar: ");
            int opcio = sc.nextInt() - 1;

            if (opcio >= 0 && opcio < personatges.size()) {
                Personatge personatgeEsborrat = personatges.remove(opcio);
                System.out.println("Personatge " + personatgeEsborrat.getNom() + " esborrat amb èxit.");
            } else {
                System.out.println("El personatge proporcionat és invàlid. Si us plau, selecciona un altre vàlid.");
            }
            System.out.println("");
            System.out.println("1. Esborrar un personatge");
            System.out.println("2. Sortir");
            System.out.println("");
            System.out.print("Selecciona una opció: ");
            crearSortir = sc.nextInt();
            switch (crearSortir) {
                case 1:
                    borrarPersonatge = false;
                    break;
                case 2:
                    borrarPersonatge = true;
                    System.out.println("Sortint...");
                    break;
                default:
                    throw new AssertionError();
            }
        }

    }

    public static void editarPersonatge(ArrayList<Personatge> personatges) {
        boolean editarPersonatge = false;
        System.out.println("");
        System.out.println("1. Editar un personatge");
        System.out.println("2. Sortir");
        System.out.println("");
        System.out.print("Selecciona una opció:");
        int crearSortir = sc.nextInt();
        switch (crearSortir) {
            case 1:
                editarPersonatge = false;
                break;
            case 2:
                editarPersonatge = true;
                System.out.println("Sortint...");
                break;
            default:
                throw new AssertionError();
        }
        while (!editarPersonatge) {
            for (int i = 0; i < personatges.size(); i++) {
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

            System.out.println("Selecciona el personatge a editar:");
            int opcio = sc.nextInt() - 1;

            if (opcio >= 0 && opcio < personatges.size()) {
                Personatge personatge = personatges.get(opcio);
                System.out.println("Has seleccionat a " + personatge.getNom() + ". A continuació, pots editar les seves estadístiques.");

                // Guardar estadísticas actuales
                int forcaActual = personatge.getForca();
                int constitucioActual = personatge.getConstitucio();
                int velocitatActual = personatge.getVelocitat();
                int intelActual = personatge.getIntelligencia();
                int sortActual = personatge.getSort();
                int puntsRestants = 60;

                // Mostrar estadísticas actuales
                System.out.println("Estadístiques actuals:");
                System.out.println("Força: " + forcaActual);
                System.out.println("Constitucio: " + constitucioActual);
                System.out.println("Velocitat: " + velocitatActual);
                System.out.println("Intel·ligència: " + intelActual);
                System.out.println("Sort: " + sortActual);
                System.out.println("Punts disponibles per repartir: " + puntsRestants);

                // Solicitar las nuevas estadísticas
                System.out.print("Nova força (màxim " + puntsRestants + " punts disponibles): ");
                int novaForca = sc.nextInt();
                while (novaForca > puntsRestants) {
                    System.out.println("Has superat el límit de punts disponibles. Si us plau, introdueix un valor vàlid.");
                    System.out.print("Nova força (màxim " + puntsRestants + " punts disponibles): ");
                    novaForca = sc.nextInt();
                }
                puntsRestants -= novaForca;

                System.out.print("Nova constitucio (màxim " + puntsRestants + " punts disponibles): ");
                int novaConstitucio = sc.nextInt();
                while (novaConstitucio > puntsRestants) {
                    System.out.println("Has superat el límit de punts disponibles. Si us plau, introdueix un valor vàlid.");
                    System.out.print("Nova constitucio (màxim " + puntsRestants + " punts disponibles): ");
                    novaForca = sc.nextInt();
                }
                puntsRestants -= novaConstitucio;

                System.out.print("Nova velocitat (màxim " + puntsRestants + " punts disponibles): ");
                int novaVelocitat = sc.nextInt();
                while (novaVelocitat > puntsRestants) {
                    System.out.println("Has superat el límit de punts disponibles. Si us plau, introdueix un valor vàlid.");
                    System.out.print("Nova velocitat (màxim " + puntsRestants + " punts disponibles): ");
                    novaVelocitat = sc.nextInt();
                }
                puntsRestants -= novaVelocitat;

                System.out.print("Nova intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
                int novaIntel = sc.nextInt();
                while (novaIntel > puntsRestants) {
                    System.out.println("Has superat el límit de punts disponibles. Si us plau, introdueix un valor vàlid.");
                    System.out.print("Nova intel·ligència (màxim " + puntsRestants + " punts disponibles): ");
                    novaIntel = sc.nextInt();
                }
                puntsRestants -= novaIntel;

                System.out.print("Nova sort (màxim " + puntsRestants + " punts disponibles): ");
                int novaSort = sc.nextInt();
                while (novaSort > puntsRestants) {
                    System.out.println("Has superat el límit de punts disponibles. Si us plau, introdueix un valor vàlid.");
                    System.out.print("Nova sort (màxim " + puntsRestants + " punts disponibles): ");
                    novaSort = sc.nextInt();
                }
                puntsRestants -= novaSort;

                // Actualizar las estadísticas del personaje
                personatge.setForca(novaForca);
                personatge.setConstitucio(novaConstitucio);
                personatge.setVelocitat(novaVelocitat);
                personatge.setIntelligencia(novaIntel);
                personatge.setSort(novaSort);

                System.out.println("Les estadístiques del personatge s'han actualitzat amb èxit.");
            } else {
                System.out.println("Opció no vàlida. Si us plau, selecciona un personatge vàlid.");
            }
            System.out.println("");
            System.out.println("1. Editar un personatge");
            System.out.println("2. Sortir");
            System.out.println("");
            System.out.print("Selecciona una opció:");
            crearSortir = sc.nextInt();
            switch (crearSortir) {
                case 1:
                    editarPersonatge = false;
                    break;
                case 2:
                    editarPersonatge = true;
                    System.out.println("Sortint...");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void iniciarCombat(ArrayList<Personatge> personatges) {

        boolean sortir = false;

        while (!sortir) {
            System.out.println("");
            System.out.println("+------------------------+");
            System.out.println("|     Combat           |");
            System.out.println("+------------------------+");
            System.out.println("|     Personatges        |");
            System.out.println("+------------------------+");
            System.out.println("");

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

            int vida1 = lluitador[0].getPs();
            int vida2 = lluitador[1].getPs();

            Dau dau1 = new Dau();
            Dau dau2 = new Dau();
            Dau dau3 = new Dau();
            Dau dauCaos = new Dau();

            int ronda = 0;

            while (atacant.getPs() > 0 && defensor.getPs() > 0) {
                System.out.println(atacant.getNom() + " Ataca");

                int valorDau1 = dau1.llencar();
                int valorDau2 = dau2.llencar();
                int valorDau3 = dau3.llencar();
                System.out.println("Daus atacant:");
                System.out.println("Valor daus: " + "Dau 1: " + valorDau1 + " Dau 2: " + valorDau2 + " Dau 3: " + valorDau3);
                System.out.println("");

                if (valorDau1 <= atacant.getPa() || valorDau2 <= atacant.getPa() || valorDau2 <= atacant.getPa()) {
                    valorDau1 = dau1.llencar();
                    valorDau2 = dau2.llencar();
                    valorDau3 = dau3.llencar();
                    System.out.println("Daus defensor: ");
                    System.out.println("Valor daus: " + "Dau 1: " + valorDau1 + " Dau 2: " + valorDau2 + " Dau 3: " + valorDau3);
                    System.out.println("");

                    if (valorDau1 > defensor.getPe() || valorDau2> defensor.getPe() || valorDau2 > defensor.getPe()) {
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
                            boolean atacarDeNou = atacant.atacPAReduida(dauCaos);
                            if (atacarDeNou) {
                                defensor.setPs(defensor.getPs() - atacant.getPd());
                                System.out.println(defensor.getNom() + " ha sigut atacat de nou, ha perdut: " + atacant.getPd());
                                System.out.println("Vida restant: " + defensor.getPs());
                            } else {
                                System.out.println("Ha fallat l'atac extra");
                            }
                        }

                    } else {
                        System.out.println(defensor.getNom() + " ha evitat l'atac");
                    }
                } else {
                    System.out.println(defensor.getNom() + " ha evitat l'atac");
                }

                System.out.println("Vida de " + atacant.getNom() + ": " + atacant.getPs());
                System.out.println("Vida de " + defensor.getNom() + ": " + defensor.getPs());
                System.out.println("Ronda: " + ronda);
                ronda++;

                // Intercambi rols
                Personatge aux = atacant;
                atacant = defensor;
                defensor = aux;
            }

            // Finalitzar combat
            Personatge guanyador = (atacant.getPs() > 0) ? atacant : defensor;
            Personatge perdedor = (atacant.getPs() > 0) ? defensor : atacant;
            System.out.println("El guanyador és: " + guanyador.getNom());

            lluitador[0].setPs(vida1);
            lluitador[1].setPs(vida2);

            guanyador.setPex(guanyador.getPex() + perdedor.getPs());
            System.out.println("El guanyador te: " + guanyador.getPex());
            if (guanyador.getPex() >= guanyador.getPexSiguienteNivel()) {
                guanyador.subirDeNivel();
                guanyador.calculaEstadistiquesSecundaries();
                System.out.println("Felicitats " + guanyador.getNom() + " ha pujat de nivell!! " + "Lvl: " + guanyador.getNivell());
            }

            // Preguntar si se desea iniciar un nuevo combate o salir al menú principal
            System.out.println("");
            System.out.println("Vols iniciar un nou combat? (s/n)");
            String opcio = sc.next();

            if (opcio.equalsIgnoreCase("n")) {
                sortir = true;
                System.out.println("Tornant al menú principal...");
            }

        }

    }

    public static int verificarMenu(String input) {
        int opcio;
        try {
            opcio = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            opcio = 0;
        }
        return opcio;
    }

}
