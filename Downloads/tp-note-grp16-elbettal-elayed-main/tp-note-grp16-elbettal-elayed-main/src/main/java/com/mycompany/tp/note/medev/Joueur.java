/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.medev;

import java.util.ArrayList;

/**
 *classe abstraite des joueurs
 * @author samar
 */
public abstract class Joueur {
    
    private int score;
    
    private ArrayList<Pion> ListPion = new ArrayList<>();

    /**
     *
     */
    public Joueur() {
        this.score = 0;
    }
    
    /**
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     *retourne le score du codeur
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *retourne la liste des pions
     * @return
     */
    public ArrayList<Pion> getListPion() {
        return ListPion;
    }

    /**
     *définit la liste des pions
     * @param ListPion
     */
    public void setListPion(ArrayList<Pion> ListPion) {
        this.ListPion = ListPion;
    }
    
    
}
