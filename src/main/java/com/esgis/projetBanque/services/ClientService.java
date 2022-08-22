/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esgis.projetBanque.services;

import com.esgis.projetBanque.models.Client;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lacpili
 */
public interface ClientService {
    public Client saveClient(Client c);
    public Optional<Client> findById(String id);
    public List<Client> findAll();
    public void deleteClient(String id);
}
