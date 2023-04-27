/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Huma extends Personatge {
    
    public Huma(double forca, double constitucio, double velocitat,
                   double intelligencia, double sort) {

        super(forca,constitucio,velocitat,intelligencia,sort);
    }  

    protected void calculaEstadistiquesDerivades() {
        super.calculaEstadistiquesDerivades();
        ps = constitucio + forca + intelligencia;                
    }    
    
   
}

