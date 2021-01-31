package com.vikas.foo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CocoBean implements Serializable
{
    private String name;

    private CoffeeBean coffeeBean;

    private LocalDateTime time;

    public CoffeeBean getCoffeeBean() {
        return coffeeBean;
    }

    public void setCoffeeBean(CoffeeBean coffeeBean) {
        this.coffeeBean = coffeeBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CocoBean(String name, CoffeeBean coffeeBean) {
        this.name = name;
        this.coffeeBean = coffeeBean;
    }

    public CocoBean(String name) {
        this.name = name;
        this.coffeeBean = null;
    }

    public CocoBean( String name, LocalDateTime time )
    {
        this.name = name;
        this.time = time;
    }

    public LocalDateTime getTime()
    {
        return time;
    }

    public void setTime( LocalDateTime time )
    {
        this.time = time;
    }
}
