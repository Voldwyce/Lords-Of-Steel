/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;

/**
 *
 * @author David
 */
public class MitjaCaos extends Mitja implements Caos {

    public MitjaCaos(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, Arma arma) {
        super(nom, forca, constitucio, velocitat, intelligencia, sort, arma);
    }

    @Override
    public boolean atacPAReduida(Dau... dados) {
        int sum = 0;
        for (Dau dau : dados) {
            sum += dau.llencar();
        }
        
        int paReducida = getPa() / 2;
        
        return sum > paReducida;
    }

}

