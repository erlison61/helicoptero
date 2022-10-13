package com.mycompany.airforce;
public class AirForce {
    public static void main(String[] args) {
        Helicopter h1=new Helicopter(5); 
        h1.ligar();
        h1.decolar(10);
        h1.entrar();
        
        System.out.println(h1.toString());
        
        Helicopter h2=new Helicopter(4); 
        //h2.ligar();
        h2.decolar(10);
        h2.entrar();
        h2.entrar();
        System.out.println(h2.toString());
        
    }
}
