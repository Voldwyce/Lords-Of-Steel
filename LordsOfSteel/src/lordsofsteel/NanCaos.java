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
            int intelligencia, int sort,  int nivell, Arma arma) {
        super(nom, forca, constitucio, velocitat, intelligencia, sort, nivell, arma);
    }

    @Override
    public boolean atacPAReduida(Dau ...daus) {
          int sum = 0;
        for (Dau dau : daus) {
            sum += dau.llencar();
        }
        
        int paReducida = getPa() / 2;
        
        return sum > paReducida;
    }
    }


