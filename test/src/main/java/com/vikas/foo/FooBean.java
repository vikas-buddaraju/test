package com.vikas.foo;


public class FooBean {

   private String name;
   private String doc;

    public FooBean() {
    }

    public FooBean(String name, String doc) {
        this.name = name;
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
