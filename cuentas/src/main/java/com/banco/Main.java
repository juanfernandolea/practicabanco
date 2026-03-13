package com.banco;
import java.util.Scanner;

public class Main {
    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Ingrese saldo inicial:");
float saldo = sc.nextFloat();
System.out.println("Ingrese tasa anual:");
float tasa = sc.nextFloat();
CuentaAhorros cuenta = new CuentaAhorros(saldo, tasa);
System.out.println("Ingrese cantidad a consignar:");
float consignacion = sc.nextFloat();
cuenta.consignar(consignacion);
System.out.println("Ingrese cantidad a retirar:");
float retiro = sc.nextFloat();
cuenta.retirar(retiro);
cuenta.extractoMensual();
cuenta.imprimir();
sc.close();
}}
