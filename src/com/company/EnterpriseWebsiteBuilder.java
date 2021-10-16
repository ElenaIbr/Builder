package com.company;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void createName() {
        website.setName("Enterprise Website");
    }

    @Override
    void createSmc() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void createPrice() {
        website.setPrice(10000);
    }
}
