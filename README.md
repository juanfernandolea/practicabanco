# PRÁCTICA DE BANCO
PROGRAMACIÓN II

# Sistema de Cuentas Bancarias

## Diagrama de clases

Cuenta
------
saldo : float
numeroConsignaciones : int
numeroRetiros : int
tasaAnual : float
comisionMensual : float
+ consignar()
+ retirar()
+ calcularInteres()
+ extractoMensual()

        ▲
        │
 ┌───────────────┐
 │               │

CuentaAhorros        CuentaCorriente
activa : boolean     sobregiro : float
