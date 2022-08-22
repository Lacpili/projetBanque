/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.esgis.projetBanque.repositories;

import  com.esgis.projetBanque.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author lacpili
 */
public interface ClientRepository extends MongoRepository<Client, String>{
    
}
