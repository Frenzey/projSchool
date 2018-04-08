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
public class statuts {
    
    public int idStatut;
    private String typeStatut;
    private String libelStatut;

    public statuts() {
    }

    public statuts(int idStatut, String typeStatut, String libelStatut) {
        this.idStatut = idStatut;
        this.typeStatut = typeStatut;
        this.libelStatut = libelStatut;
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
    }

    public String getTypeStatut() {
        return typeStatut;
    }

    public void setTypeStatut(String typeStatut) {
        this.typeStatut = typeStatut;
    }

    public String getLibelStatut() {
        return libelStatut;
    }

    public void setLibelStatut(String libelStatut) {
        this.libelStatut = libelStatut;
    }
    
}
