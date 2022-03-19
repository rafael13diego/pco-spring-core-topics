package com.drafael.cursojava.SpringCore.Inyection.Atributo;

public class ExecuteClasses {

    private static Barcelona barcelona;

    public static void main(String[] args) {
        Messi m = new Messi(new Barcelona());
        m.mostar();
    }
}
