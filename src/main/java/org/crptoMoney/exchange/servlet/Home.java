package org.crptoMoney.exchange.servlet;


import org.crptoMoney.exchange.model.CryptoMoney;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("app")
public class Home extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*        req.setAttribute("listCryptos", CryptoMoney.listAll());*/
        /*        req.getRequestDispatcher("/index.html").forward(req, resp);*/
        PrintWriter writer = resp.getWriter();
        generateTableElement(writer);
        writer.flush();
        writer.close();
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void generateTableElement(PrintWriter writer) {
        writer.println("<!DOCTYPE html><html lang=\"fr\"><head>    <meta charset=\"UTF-8\">    <title>Crypto - Espace Client</title>    <style>        h1, h2, h3, h4, h5, h6 {            margin-bottom: 0.5rem;            font-weight: 400;            line-height: 1.5;        }        h1 {            font-size: 2.5rem;        }        h2 {            font-size: 2rem        }        h3 {            font-size: 1.75rem        }        h4 {            font-size: 1.5rem        }        h5 {            font-size: 1.25rem        }        h6 {            font-size: 1rem        }        .lead {            font-weight: 300;            font-size: 2rem;        }        .banner {            font-size: 2.7rem;            margin: 0;            padding: 2rem 1rem;            background-color: #00A1E2;            color: white;        }        body {            margin: 0;            font-family: -apple-system, system-ui, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif, \"Apple Color Emoji\", \"Segoe UI Emoji\", \"Segoe UI Symbol\", \"Noto Color Emoji\";        }        code {            font-family: SFMono-Regular, Menlo, Monaco, Consolas, \"Liberation Mono\", \"Courier New\", monospace;            font-size: 87.5%;            color: #e83e8c;            word-break: break-word;        }        .left-column {            padding: .75rem;            max-width: 75%;            min-width: 55%;        }        .right-column {            padding: .75rem;            max-width: 25%;        }        .container {            display: flex;            width: 100%;        }        li {            margin: 0.75rem;        }        .right-section {            margin-left: 1rem;            padding-left: 0.5rem;        }        .right-section h3 {            padding-top: 0;            font-weight: 200;        }        .right-section ul {            border-left: 0.3rem solid #00A1E2;            list-style-type: none;            padding-left: 0;        }    </style></head><body><div class=\"banner lead\">Liste des monnaies</div>");
        writer.println("<div class=\"left-column\"><table><tr><th>Sigle</th><th>Nom</th><th>Prix</th></tr><tbody>");
        List<CryptoMoney> list = CryptoMoney.listAll();
        for (CryptoMoney crypto : list) {
            writer.println("<tr><td><a href=\"\">" + crypto.miniIdMonnaieCrypto + "</a></td><td>" + crypto.nomMonnaieCrypto + "</td><td>" + crypto.price + "</td></tr>");
        }
        writer.println("</tbody></div></body></html>");
    }

    public void generateSimpleElement(PrintWriter out) {
        out.println();
    }
}
