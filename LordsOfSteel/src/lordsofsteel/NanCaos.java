/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author David
 */
public class NanCaos extends Nan implements Caos {

    public NanCaos(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, Arma arma) {
        super(nom, forca, constitucio, velocitat, intelligencia, sort, arma);
    }

    @Override
    public boolean atacPAReduida(Dau ...d) {
        Dau dau1 = new Dau();
        Dau dau2 = new Dau();
        Dau dau3 = new Dau();
        
        // Falta completar
        return false;
    }

}
