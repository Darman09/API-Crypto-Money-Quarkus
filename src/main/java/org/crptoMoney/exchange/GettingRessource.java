package org.crptoMoney.exchange;

import org.crptoMoney.exchange.model.CryptoMoney;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    @Produces(MediaType.APPLICATION_JSON)
    public List<CryptoMoney> getAllCryptoMoney() {
        return CryptoMoney.listAll();
    }
}