package org.crptoMoney.exchange;

import org.crptoMoney.exchange.model.CryptoMoney;
import org.crptoMoney.exchange.model.CryptoMoneyCours;
import org.crptoMoney.exchange.model.CryptoMoneyUser;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class GettingRessource {

   /* @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "hello";
    }*/

    @GET
    @Path("/cryptoMoney")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoney> getAllCryptoMoney() {
        return CryptoMoney.listAll();
    }

    @GET
    @Path("/cryptoMoney/sigle/{sigle}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoney> getCryptoMoneyBySigle(@PathParam("sigle") String sigle) {
        return CryptoMoney.list("miniIdMonnaieCrypto",sigle);
    }

    @GET
    @Path("/cryptoMoney/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoney> getCryptoMoneyByName(@PathParam("name") String name) {
        return CryptoMoney.list("nomMonnaieCrypto",name);
    }

    @GET
    @Path("/cryptoMoney/price/{price}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoney> getCryptoMoneyByPrice(@PathParam("price") String price) {
        return CryptoMoney.list("price",price);
    }

    @GET
    @Path("/cryptoMoney/cours/{sigle}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoneyCours> getCryptoMoneyCoursBySigle(@PathParam("sigle") String sigle) {
        return CryptoMoneyCours.list("sigle",sigle);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cryptoMoneyUser")
    public List<CryptoMoneyUser> getAllCryptoMoneyUser() {
        return CryptoMoneyUser.listAll();
    }
}