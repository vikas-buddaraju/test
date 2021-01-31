package com.vikas.foo;

public class CoffeeBean {
    private String name;
    private String doc;

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public CoffeeBean(String name, String doc) {
        this.name = name;
        this.doc = doc;
    }

    public CoffeeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
