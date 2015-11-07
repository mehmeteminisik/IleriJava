/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tutev.ilerijava.erp.entity.genel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.tutev.ilerijava.erp.entity.base.BaseEntity;

/**
 *
 * @author Bilisim-Hoca
 */
@Entity
@Table(name = "AUT_USERS")
public class Kullanici extends  BaseEntity{
    
    Long id;
    String username;
    String password;

    @Id
    @SequenceGenerator(name = "SQ_KULLANICI",sequenceName = "SQ_KULLANICI",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "SQ_KULLANICI",strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
