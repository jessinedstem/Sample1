package com.edstem.learning;

public class Main {
    public static void main(String[] args){
        country c1 = new country();
        country c2 = new country();
        c1.countryName= "India";
        c1.countryCapital= "New Delhi";
        c1.printCapital();
        c2.countryName="Spain";
        c2.countryCapital="Madrid";
        c2.printCapital();

    }
}

