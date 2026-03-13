package com.banco;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones;
    protected int numeroRetiros;
    protected float tasaAnual;
    protected float comisionMensual;
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numeroConsignaciones = 0;
        this.numeroRetiros = 0;
        this.comisionMensual = 0;
    }
    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones++;
    }
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
        }
    }
    public void calcularInteres() {
        float tasaMensual = tasaAnual / 12 / 100;
        saldo += saldo * tasaMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Consignaciones: " + numeroConsignaciones);
        System.out.println("Retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}