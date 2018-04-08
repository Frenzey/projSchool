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
public class frequences {
    
    private int idFrequence;
    private String libelFrequence;
    
    public frequences(){
        
    }

    public frequences(int idFrequence, String libelFrequence) {
        this.idFrequence = idFrequence;
        this.libelFrequence = libelFrequence;
    }

    public int getIdFrequence() {
        return idFrequence;
    }

    public void setIdFrequence(int idFrequence) {
        this.idFrequence = idFrequence;
    }

    public String getLibelFrequence() {
        return libelFrequence;
    }

    public void setLibelFrequence(String libelFrequence) {
        this.libelFrequence = libelFrequence;
    }
    
    
    
}
