package com.drafael.cursojava.SpringCore.Inyection.Atributo;

public class Messi {

    private IEquipo equipo;

    public Messi(IEquipo equipo){
        this.equipo = equipo;

    }
    public void mostar(){
        equipo.mostrar();
    }


}
