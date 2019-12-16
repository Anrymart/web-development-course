package com.anrymart;

import lombok.Data;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import java.util.Arrays;
import java.util.List;

/**
 * This is just an example how to do HTTP requests from Java
 */
public class RequestExample {

    private static final String QUOTE_BASE = "http://quotes.stormconsultancy.co.uk";

    private static final String RANDOM_QUOTE = "/random.json";
    private static final String ALL_QUOTES = "/quotes.json";

    public static void main(String[] args) {
        WebTarget target = ClientBuilder.newClient().target(QUOTE_BASE);

        String quote = target
                .path(RANDOM_QUOTE)
                .request()
                .get()
                .readEntity(String.class);

        System.out.println(quote);

        Quote quoteObj = target
                .path(RANDOM_QUOTE)
                .request()
                .get()
                .readEntity(Quote.class);

        System.out.println(quoteObj);

        List<Quote> quoteList = target
                .path(ALL_QUOTES)
                .request()
                .get()
                .readEntity(new GenericType<List<Quote>>() {
                });

        System.out.println(Arrays.toString(quoteList.toArray()));
    }


    @Data
    private static class Quote {
        private int id;
        private String author;
        private String quote;
        private String permalink;
    }
}
