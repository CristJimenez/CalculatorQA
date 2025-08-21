**Proyecto:** Calculadora
**Fecha:** 16/08/2005
**Responsable:** Cristian Jimenez
**Entorno:** IntelliJ IDEA 2025, JDK 23, JUnit 5.10.2, Maven 3.9.11

**Casos de prueba:**

**ID:** TC01
**Método de prueba:** testSum
**Descripción:** Verificar suma de enteros
**Entrada:** 3 + 2
**Esperado:** 5
**Resultado:** Pasó

**ID:** TC02
**Método de prueba:** testSubtract
**Descripción:** Verificar resta de enteros
**Entrada:** 7 - 3
**Esperado:** 4
**Resultado:** Pasó

**ID:** TC03
**Método de prueba:** testMultiply
**Descripción:** Verificar multiplicación
**Entrada:**  6 * 2
**Esperado:** 12
**Resultado:** Pasó

**ID:** TC04
**Método de prueba:** testDivide
**Descripción:** Verificar división normal
**Entrada:** 12 / 4
**Esperado:** 3
**Resultado:** Pasó

**ID:** TC05
**Método de prueba:** testDivideByZero
**Descripción:** Manejo de división por cero
**Entrada:** 12 / 0
**Esperado:** Excepción
**Resultado:** Pasó

**ID:** TC06
**Método de prueba:** testSumException
**Descripción:** Manejo letras o simbolos
**Entrada:** 2 + s
**Esperado:** Excepción
**Resultado:** Pasó

**ID:** TC07
**Método de prueba:** testSubtractException
**Descripción:** Manejo letras o simbolos
**Entrada:** 2 - r
**Esperado:** Excepción
**Resultado:** Pasó

**ID:** TC08
**Método de prueba:** testMultiplyException
**Descripción:** Manejo letras o simbolos
**Entrada:** 2 * m
**Esperado:** Excepción
**Resultado:** Pasó

**ID:** TC09
**Método de prueba:** testDivideException
**Descripción:** Manejo letras o simbolos
**Entrada:** 2 / d
**Esperado:** Excepción
**Resultado:** Pasó

**Total Pruebas:** 9
**Pasaron:** 9
**Fallaron:** 0
**Bugs:** 0
**Estado:** Todas las operaciones básicas de Calculator funcionan correctamente