/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.projetBanque.services;

import com.esgis.projetBanque.models.CompteBancaire;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lacpili
 */
public interface CompteBancaireService {
    public CompteBancaire saveCompteBancaire(CompteBancaire c,String idTitulaire);
    public Optional<CompteBancaire> findById(String id);
    public List<CompteBancaire> findAll();
    public void deleteCompteBancaire(String id);
    
    public void depot(String idCompte, double montant, double taux);
    public void retrait(String idCompte, double montant);
    public void virement(String idCompte, double montant, String idCompte2, double taux, double prixTransaction);
    public String afficher(String idCompte);
}
