package org.crptoMoney.exchange.model;


import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class CryptoMoneyCours extends PanacheEntity {
    public String sigle;
    public String price;
    public String dateMoney;
}