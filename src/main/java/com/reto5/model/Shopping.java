package com.reto5.model;

public class Shopping {
    private int idPurchase;
    private String constructor;
    private String linkedBank;

    public Shopping() {
    }

    public Shopping(int idPurchase, String constructor, String linkedBank) {
        this.idPurchase = idPurchase;
        this.constructor = constructor;
        this.linkedBank = linkedBank;
    }

    public String getConstructor() {
        return constructor;
    }

    public void setConstructor(String constructor) {
        this.constructor = constructor;
    }

    public String getLinkedBank() {
        return linkedBank;
    }

    public void setLinkedBank(String linkedBank) {
        this.linkedBank = linkedBank;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }
}
