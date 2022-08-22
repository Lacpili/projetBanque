/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.projetBanque.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author lacpili
 */
@Document("compte_bancaire")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompteBancaire {

    @Id
   private String numCompte;
   private String numAgance;
   private double solde = 0;
   private boolean isEpargne = false;
   private String titulaire;

    public  CompteBancaire(String numCompte, String titulaire, String numAgance, double solde, boolean isEpargne) {
        this.numCompte = numCompte;
        this.isEpargne = isEpargne;
        this.solde = solde;
        this.numAgance = numAgance;
        this.titulaire = titulaire;
    }

    public void depot(double montant, double taux) {
        if (isEpargne) {
            this.solde = this.solde + montant + montant * taux;
        } else {
            this.solde = this.solde + montant;
        }

    }

    public void retrait(double montant) {
        this.solde = this.solde - montant;
    }

    public void virement(double montant, CompteBancaire autre, double taux, double prixTransaction) {
        if (this.titulaire.equals(autre.titulaire)) {
            this.retrait(montant);
            autre.depot(montant, taux);
        } else {
            this.retrait(montant + prixTransaction);
            autre.depot(montant, taux);
        }

    }

    @Override
    public String toString() {
        return "CompteBancaire{" + "numCompte=" + numCompte + ", numAgance=" + numAgance + ", solde=" + solde + ", isEpargne=" + isEpargne + ", titulaire=" + titulaire + '}';
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public String getNumAgance() {
        return numAgance;
    }

    public void setNumAgance(String numAgance) {
        this.numAgance = numAgance;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public boolean isIsEpargne() {
        return isEpargne;
    }

    public void setIsEpargne(boolean isEpargne) {
        this.isEpargne = isEpargne;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

}
