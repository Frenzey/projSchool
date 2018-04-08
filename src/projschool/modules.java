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
public class modules {
    
    private int idModule;
    private String libelModule;

    public modules() {
    }

    public modules(int idModule, String libelModule) {
        this.idModule = idModule;
        this.libelModule = libelModule;
    }

    public int getIdModule() {
        return idModule;
    }

    public void setIdModule(int idModule) {
        this.idModule = idModule;
    }

    public String getLibelModule() {
        return libelModule;
    }

    public void setLibelModule(String libelModule) {
        this.libelModule = libelModule;
    }
    
    
    
    
}
