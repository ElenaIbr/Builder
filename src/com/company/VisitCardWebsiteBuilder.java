package com.company;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void createName() {
        website.setName("Visit Card Website");
    }

    @Override
    void createSmc() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void createPrice() {
        website.setPrice(500);
    }
}
