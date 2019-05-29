package org.crptoMoney.exchange.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class CryptoMoney extends PanacheEntity {
    public String miniIdMonnaieCrypto;
    public String nomMonnaieCrypto;
}
