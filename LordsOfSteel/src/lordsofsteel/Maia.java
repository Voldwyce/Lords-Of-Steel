/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;
/**
 *
 * @author David
 */
public class Maia extends Personatge {

    public Maia (int forca, int constitucio, int velocitat,
                   int intelligencia, int sort, Arma arma) {

        super(forca,constitucio,velocitat,intelligencia,sort,arma);
    }
    
    protected void calculaEstadistiquesSecundaries() {
        super.calculaEstadistiquesSecundaries();
        pa = intelligencia + sort + velocitat;                
    }    
    
}

