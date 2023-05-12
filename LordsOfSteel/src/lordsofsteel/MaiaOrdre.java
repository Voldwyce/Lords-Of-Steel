/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author David
 */
public class MaiaOrdre extends Maia implements Ordre {

    public MaiaOrdre(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, Arma arma) {
        super(nom, forca, constitucio, velocitat, intelligencia, sort, arma);
    }

    @Override
    public void restaurarPS() {
        this.ps = (int) (this.ps * 1.10);
    }

}
