/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.ilerijava.erp.entity.genel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.tutev.ilerijava.erp.entity.base.BaseEntity;

/**
 *
 * @author Bilisim-Hoca
 */
@Entity
@Table(name = "GNL_KISI")
public class Kisi extends BaseEntity{

    public Kisi() {
    }

    public Kisi(Long id, String ad, String soyad, Date dogumTarihi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    
    private Long id;
    private String ad;
    private String soyad;
    private Date dogumTarihi;

    @Id
    @SequenceGenerator(name = "SQ_KISI",sequenceName = "SQ_KISI",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "SQ_KISI",strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME",length = 80)
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Column(name = "SURNAME",length = 80)
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "Kisi{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", dogumTarihi=" + dogumTarihi + '}';
    }

    
}
