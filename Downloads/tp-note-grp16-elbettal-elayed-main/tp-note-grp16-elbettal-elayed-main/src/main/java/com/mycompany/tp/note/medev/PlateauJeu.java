/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp.note.medev;

import java.util.ArrayList;

/**
 *
 * @author samar
 */
public class PlateauJeu {

    private String[][] plateau;
    private ArrayList<Pion> ListPionCodeur = new ArrayList<>();
    private ArrayList<Pion> ListPionDecodeur = new ArrayList<>();
    private ArrayList<Pion> TrousDeMarque = new ArrayList<>();
    private Codeur codeur = new Codeur();
    private Decodeur decodeur = new Decodeur();
    
    /**
     *definition de plateau de jeu avec 12 lignes et 4 colonnes
     */
    public PlateauJeu() {
        plateau = new String[12][4];
    }

    /**
     *
     * @param row lignes
     * @param col colonnes
     * @param couleur couleur du pion a cette position
     */
    public void setColor(int row, int col, String couleur) {
        plateau[row][col] = couleur;
    }

    /**
     *
     * @param row ligne
     * @param col colonne
     * @return retourne string du couleur
     */
    public String getColor(int row, int col) {
        return plateau[row][col];
    }

    /**
     * methode des tentatives que va faire le decodeur
     */
    public void Manche() {
        codeur.choix();
        ListPionCodeur = codeur.getListPion();
        int i = 0;
        boolean trouve = false;
        while (i < 12 && !trouve) {
            decodeur.choix();
            ListPionDecodeur = decodeur.getListPion();
            AddCombinaison( ListPionDecodeur, i) ;
            if (trouver()) {
                trouve = true;
                System.out.println("Vous avez trouvez la combinaison aprés " + i+1 + "tentative(s)");
            } else {
                comparaison();

            }
        }

    }
 
    /**
     * methode de comparaison des pions du codeurs et des pions du decodeur
     */
    public void comparaison() {
        System.out.println("Trous de Marque :");
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(i).getColor())) {
                Pion P1 = new Pion("N");
                TrousDeMarque.add(P1);
                System.out.print("  " + P1.getColor());
            }
            for (int j = 0; j < 4; j++) {
                if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(j).getColor()))  {
                    Pion P2 = new Pion("Bl");
                    TrousDeMarque.add(P2);
                    System.out.print("  " + P2.getColor());
                }
            }
        }
        System.out.println("");
    }

    /**
     * verifie si le decodeur a trouver la reponse correcte
     * @return
     */
    public boolean trouver() {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (ListPionCodeur.get(i).getColor().equals(ListPionDecodeur.get(i).getColor())) {
                k++;
            }
        }
        return k == 4;
    }
    
    /**
     * ajouter les pions au plateau 
     * @param listeP liste des pions de cette combinaison
     * @param i position
     */
    public  void AddCombinaison(ArrayList<Pion> listeP, int i){
        for (int k = 0; k < 4; k++) {
            plateau[i][k] = listeP.get(k).getColor() ;
        }
    }

}
