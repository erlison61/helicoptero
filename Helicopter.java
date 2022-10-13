package com.mycompany.airforce;

public class Helicopter{

    private boolean ligado;
    private float altitude;
    private int capacidade, quantidadePessoa;

    // construtor
    public Helicopter(int capacidade) {
        this.ligado = false;
        this.capacidade = capacidade;
        this.altitude = 0;
        this.quantidadePessoa=0;
    }

    //metodo para visualização do objeto
    public String toString() {
        return "esta ligado:" +(getLigado()==true?"sim":"não")+"\ncapacidade:" + getCapacidade()+"\naltitude:" + getAltitude() + "metro(s)"+"\nquantidade:"+getQuantidade();
    }
    
    //metodos especiais
    public boolean getLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public float getAltitude() {
        return altitude;
    }
    
    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
    public int getQuantidade(){
        return quantidadePessoa;
    }
    
     public void setQuantidade(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
    }

    //metodos
    public void ligar() {
       setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void entrar() {
        if (getQuantidade() <= getCapacidade()) {
            setQuantidade(getQuantidade() + 1);
        }else{
            System.out.println("capacidade excedida");
        }
    }

    public void sair() {
        if (getQuantidade() > 0) {
            setQuantidade(getQuantidade() - 1);
        }else{
            System.out.println("já não existem mais passageiros");
        }

    }

    public void decolar(int metros) {
        if (getLigado() == true && getAltitude() == 0) {
            System.out.println("levantando voo..");
            setAltitude(metros);
        } else  {
            System.out.println("[erro] o helicoptero só pode decolar se estiver ligado");
        }
    }

    public void aterrissar() {
        if (getLigado() == true && getAltitude() > 0) {
            System.out.println("aterrissado com sucesso");
        } else {
            System.out.println("[erro] 402");
        }
    }

}

