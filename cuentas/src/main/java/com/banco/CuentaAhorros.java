package com.banco;
public class CuentaAhorros extends Cuenta {

private boolean activa;
public CuentaAhorros(float saldo, float tasaAnual) {
super(saldo, tasaAnual);
activa = saldo >= 10000;
}
@Override
public void consignar(float cantidad) {
if (activa) {
    super.consignar(cantidad);
} else {
    System.out.println("La cuenta está inactiva");
}
}
@Override
public void retirar(float cantidad) {
if (activa) {
    super.retirar(cantidad);
} else {
    System.out.println("La cuenta está inactiva");
}
}
@Override
public void extractoMensual() {
if (numeroRetiros > 4) {
    int retirosExtra = numeroRetiros - 4;
    comisionMensual += retirosExtra * 1000;
}
super.extractoMensual();
activa = saldo >= 10000;
}
@Override
public void imprimir() {
int totalTransacciones = numeroConsignaciones + numeroRetiros;
System.out.println("Saldo: " + saldo);
System.out.println("Comisión mensual: " + comisionMensual);
System.out.println("Número de transacciones: " + totalTransacciones);
System.out.println("Cuenta activa: " + activa);
}
}