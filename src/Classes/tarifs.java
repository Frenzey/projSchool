/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author frenzey
 */
public class tarifs {
    
    private int idTarif;
    private float fraisInscTarif;
    private float cotisTarif;
    private float remDurTarif;
    private float remModTarif;

    public tarifs() {
    }

    public tarifs(int idTarif, float fraisInscTarif, float cotisTarif, float remDurTarif, float remModTarif) {
        this.idTarif = idTarif;
        this.fraisInscTarif = fraisInscTarif;
        this.cotisTarif = cotisTarif;
        this.remDurTarif = remDurTarif;
        this.remModTarif = remModTarif;
    }

    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    public float getFraisInscTarif() {
        return fraisInscTarif;
    }

    public void setFraisInscTarif(float fraisInscTarif) {
        this.fraisInscTarif = fraisInscTarif;
    }

    public float getCotisTarif() {
        return cotisTarif;
    }

    public void setCotisTarif(float cotisTarif) {
        this.cotisTarif = cotisTarif;
    }

    public float getRemDurTarif() {
        return remDurTarif;
    }

    public void setRemDurTarif(float remDurTarif) {
        this.remDurTarif = remDurTarif;
    }

    public float getRemModTarif() {
        return remModTarif;
    }

    public void setRemModTarif(float remModTarif) {
        this.remModTarif = remModTarif;
    }
    
    
}
