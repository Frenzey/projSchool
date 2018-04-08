/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author frenzey
 */
public class etudiants extends Individus{
    
    private int idEtudiant;
    /*private int idAffectation*/
    private ArrayList<affectations> LesAffects = new ArrayList<affectations>();

    public etudiants() {
        super();
    }

    public etudiants(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }
    
    
    
}
