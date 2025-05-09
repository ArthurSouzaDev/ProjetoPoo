/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoduplapoo;

/**
 *
 * @author Arthur
 */


public class Conta {
    private int mes, ano;
    private boolean paga;
    private double kw, valorKw;
    
    public Conta () {
        
    }
    public Conta (int mes, int ano, boolean paga, double kw, double valorKw) {
        this.mes = mes;
        this.ano = ano;
        this.paga = paga;
        this.kw = kw;
        this.valorKw = valorKw;
                
    }

    //Get e Set do mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    //Get e Set do ano
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Get e Set do paga
    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    //Get e Set do getKw
    public double getKw() {
        return kw;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    //Get e Set do valorKw
    public double getValorKw() {
        return valorKw;
    }

    public void setValorKw(double valorKw) {
        this.valorKw = valorKw;
    }

    //toString
    @Override
    public String toString() {
        return "Conta{" + "mes=" + mes + ", ano=" + ano + ", paga=" + paga + ", kw=" + kw + ", valorKw=" + valorKw + '}';
    }

    //Retorna o valor total do Kw
    private double getValorTotalKw(double kw, double valorKw) {
        return kw * valorKw;
    }

    //GetInfo
    public String getInfo(int mes, int ano, boolean paga) {
        if (paga == true) {
            return mes + "/" + ano + " - R$ " + getValorTotalKw(kw, valorKw) + " - Está paga" ;
        }
        return mes + "/" + ano + " - R$ " + getValorTotalKw(kw, valorKw) + " - Não está paga" ;
    }

    String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}