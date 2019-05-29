package org.crptoMoney.exchange.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class CryptoMoneyUser extends PanacheEntity {
    public String miniIdMonnaieCrypto;
    public String idUser;
}
