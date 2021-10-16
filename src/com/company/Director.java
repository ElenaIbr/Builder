package com.company;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.createName();
        builder.createSmc();
        builder.createPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
