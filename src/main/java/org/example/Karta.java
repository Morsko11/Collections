package org.example;

public class Karta {
    private String name ;

    public String getName() {
        return name;
    }

    public Karta(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "name='" + name + '\'' +
                '}';
    }


}
