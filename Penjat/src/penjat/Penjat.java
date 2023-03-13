/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjat;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Penjat {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

          final char[][] estatPenjatInicial
                = {
                    {' ', ' ', ' ', ' ', '_', '_', '_', '_', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', '_', '_', '|', '_', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'|', ' ', ' ', ' ', ' ', '|', '_', '_', '_', '_', '_', ' '},
                    {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
                    {'|', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '|'}
                };

        final String[] paraules = {"patata", "armari", "bicicleta",
            "advocat", "ascensor", "astronauta", "autopista",
            "avinguda", "bigoti", "carretera", "castanya",
            "cervell", "civada", "cultura", "dentista", "esquena",
            "estrella", "formatge", "gendre", "genoll",
            "infermera", "internet", "maduixa", "malaltia",
            "maluc", "mandarina", "maquinista", "motocicleta",
            "nebot", "pastanaga", "patinet", "perruqueria",
            "pissarra", "professor", "quadrat", "taronja",
            "tramvia", "trapezi", "tricicle", "violeta"};

        final int MAXINTENTS = 7;

        // Estat gràfic del joc durant la partida
        char[][] estatPenjat
                = new char[estatPenjatInicial.length][estatPenjatInicial[0].length];

        // Inicialitzar el dibuix del penjat
        inicialitzarEstatPenjat(estatPenjatInicial, estatPenjat);

        // Seleccionar la paraula aleatòriament
        int index = (int) (Math.random() * paraules.length);
        String paraulaSecreta = paraules[index];

        // Convertir la paraula a un array de caràcters
        char[] paraulaSecretaChars = paraulaSecreta.toCharArray();
        int totalEncerts = 0, totalErrors = 0;

        // Estructura de dades (array) per saber quines lletres portem 
        // encertades
        boolean[] lletresEncertades = new boolean[paraulaSecretaChars.length];

        // Llistat de lletres que hem introduït
        String lletresIntroduides = "";

        Scanner scanner = new Scanner(System.in);

        do {
            // Mostrar enigma
            mostrarParaula(paraulaSecreta, lletresEncertades);

            // Mostrar lletres
            mostrarLletresIntroduides(lletresIntroduides);

            // Demana lletra al usuari
            String lletraStr = demanarLletra(lletresIntroduides);
            char lletra = lletraStr.charAt(0);

            // Comprovar si la lletra introduïda pertany a la paraula
            boolean encertada = false;
            for (int i = 0; i < paraulaSecretaChars.length; i++) {
                if (paraulaSecretaChars[i] == lletra) {
                    lletresEncertades[i] = true;
                    totalEncerts++;
                    encertada = true;
                }
            }
            // Actualitzar el dibuix del penjat si la lletra no es correcta
            if (!encertada) {
                totalErrors++;
                actualitzarEstatPenjat(estatPenjat, totalErrors);
            }

            // Afegir la lletra al llistat de lletres introduïdes
            lletresIntroduides += lletra;

            // Mostrar informació del joc
            System.out.println("Encerts: " + totalEncerts);
            System.out.println("Errors: " + totalErrors);

            // Mostrar dibuix del penjat
            mostrarEstatPenjat(estatPenjat);

        } while (totalEncerts < paraulaSecreta.length() && totalErrors < MAXINTENTS);

// Mostrar missatge si la partida ha acabat
        if (totalEncerts == paraulaSecreta.length()) {
            System.out.println("Felicitats, has guanyat");
        } else if (totalErrors == MAXINTENTS) {
            netejaPantalla();
            System.out.println("OOOOOoooohhhh! Has perdut!!");
            System.out.println("La paraula era: " + paraulaSecreta);
        }
    }

    static void mostrarEstatPenjat(char[][] estat) {

        for (char[] fila : estat) {
            for (char valor : fila) {
                System.out.print(valor);
            }
            System.out.println("");
        }

    }

    static void inicialitzarEstatPenjat(char[][] estatPenjatIni, char[][] estat) {

        for (int i = 0; i < estatPenjatIni.length; ++i) {
            for (int j = 0; j < estatPenjatIni[0].length; ++j) {
                estat[i][j] = estatPenjatIni[i][j];
            }
        }

    }

    static void mostrarParaula(String paraula, boolean[] encertades) {

    }

    static void mostrarLletresIntroduides(String lletres) {

    }

    static String demanarLletra(String lletres) {

        return null;

    }

    static boolean existeixLletra(String lletres, char lletra) {

        return true;

    }

    static void actualitzarEstatPenjat(char[][] penjat, int errors) {

    }

    static void netejaPantalla() {

    }

}
