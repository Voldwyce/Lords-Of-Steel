/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Personatge {

    // Atributs principals
    protected int forca;
    protected int constitucio;
    protected int velocitat;
    protected int intelligencia;
    protected int sort;

    // Estadístiques derivades
    protected int ps;
    protected int pd;
    protected int pa;
    protected int pe;
    
    // Arma
    protected Arma arma;

    public double getForca() {
        return forca;
    }

    public double getConstitucio() {
        return constitucio;
    }

    public double getVelocitat() {
        return velocitat;
    }

    public double getIntelligencia() {
        return intelligencia;
    }

    public double getSort() {
        return sort;
    }

    public double getPs() {
        return ps;
    }

    public double getPd() {
        return pd;
    }

    public double getPa() {
        return pa;
    }

    public double getPe() {
        return pe;
    }

    public Personatge(int forca, int constitucio, int velocitat,
            int intelligencia, int sort) {
        this.forca = forca;
        this.constitucio = constitucio;
        this.velocitat = velocitat;
        this.intelligencia = intelligencia;
        this.sort = sort;

        calculaEstadistiquesDerivades();
    }

    protected void calculaEstadistiquesDerivades() {
        ps = constitucio + forca;
        pd = forca / 4;
        pa = intelligencia + sort;
        pe = velocitat + sort + intelligencia;
    }

}
