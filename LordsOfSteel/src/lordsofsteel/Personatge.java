/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lordsofsteel;
/**
 *
 * @author David
 */
public class Personatge {


    protected int forca;
    protected int constitucio;
    protected int velocitat;
    protected int intelligencia;
    protected int sort;

    // Estadístiques secundaries
    protected int ps;
    protected int pd;
    protected int pa;
    protected int pe;

    public String getNom() {
        return nom;
    }

    // Nom
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    protected String nom;
    
    // Arma
    protected Arma arma;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
        public void setForca(int forca) {
        this.forca = forca;
    }

    public void setConstitucio(int constitucio) {
        this.constitucio = constitucio;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public void setIntelligencia(int intelligencia) {
        this.intelligencia = intelligencia;
    }

    // Atributs principals
    public void setSort(int sort) {
        this.sort = sort;
    }
    
    public int getForca() {
        return forca;
    }

    public int getConstitucio() {
        return constitucio;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public int getIntelligencia() {
        return intelligencia;
    }

    public int getSort() {
        return sort;
    }
    
        public void setPs(int ps) {
        this.ps = ps;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPs() {
        return ps;
    }

    public int getPd() {
        return pd;
    }

    public int getPa() {
        return pa;
    }

    public int getPe() {
        return pe;
    }

    public Personatge(String nom, int forca, int constitucio, int velocitat,
            int intelligencia, int sort, Arma arma) {
        
        this.nom = nom;
        this.forca = forca;
        this.constitucio = constitucio;
        this.velocitat = velocitat;
        this.intelligencia = intelligencia;
        this.sort = sort;
        this.arma = arma;

        calculaEstadistiquesSecundaries();
    }

    protected void calculaEstadistiquesSecundaries() {
        ps = constitucio + forca;
        pd = (forca + arma.getWpow()) / 4;
        pa = intelligencia + sort;
        pe = velocitat + sort + intelligencia;
    }

}
