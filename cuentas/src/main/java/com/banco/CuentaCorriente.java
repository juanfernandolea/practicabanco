package com.banco;
public class CuentaCorriente extends Cuenta {

private float sobregiro;
public CuentaCorriente(float saldo, float tasaAnual) {
super(saldo, tasaAnual);
this.sobregiro = 0;
}
@Override
public void retirar(float cantidad) {
if (cantidad <= saldo) {
    saldo -= cantidad;
} else {
    sobregiro += (cantidad - saldo);
    saldo = 0;
}
numeroRetiros++;
}
@Override
public void consignar(float cantidad) {
if (sobregiro > 0) {
    if (cantidad >= sobregiro) {
        cantidad -= sobregiro;
        sobregiro = 0;
        saldo += cantidad;
    } else {
        sobregiro -= cantidad;
    }
} else {
    saldo += cantidad;
}
numeroConsignaciones++;
}
@Override
public void imprimir() {
int totalTransacciones = numeroConsignaciones + numeroRetiros;
System.out.println("Saldo: " + saldo);
System.out.println("Comisión mensual: " + comisionMensual);
System.out.println("Número de transacciones: " + totalTransacciones);
System.out.println("Valor de sobregiro: " + sobregiro);
}
}
