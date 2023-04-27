/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Nan extends Personatge {
    
    public Nan(double forca, double constitucio, double velocitat,
                   double intelligencia, double sort) {

        super(forca,constitucio,velocitat,intelligencia,sort);
    }

    protected void calculaEstadistiquesDerivades() {
        super.calculaEstadistiquesDerivades();
        pd = (constitucio + forca)/4;                
    }    
}

