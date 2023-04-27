/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class LordsOfSteel {
    public static void main(String[] args) {

        Maia morderK = new Maia(4,8,3,9,2);
        
        System.out.println("Força de l'assasí MorderKaiser: " + morderK.getForca());
        
        System.out.println("Punts de salut de l'assasí MorderKaiser: " + 
                           morderK.getPs());
        System.out.println("Punts d'atac de l'assasí MorderKaiser: " + morderK.getPa());
    }

}
