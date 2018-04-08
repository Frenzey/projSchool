/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

/**
 *
 * @author frenzey
 */
public class fonctions {
    
    public int idFonction;
    private String libelFonction;

    public fonctions() {
    }

    public fonctions(int idFonction, String libelFonction) {
        this.idFonction = idFonction;
        this.libelFonction = libelFonction;
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public String getLibelFonction() {
        return libelFonction;
    }

    public void setLibelFonction(String libelFonction) {
        this.libelFonction = libelFonction;
    }
    
}
