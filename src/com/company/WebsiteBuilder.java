package com.company;

public abstract class WebsiteBuilder {

    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void createName();
    abstract void createSmc();
    abstract void createPrice();

    Website getWebsite(){
        return website;
    }
}
