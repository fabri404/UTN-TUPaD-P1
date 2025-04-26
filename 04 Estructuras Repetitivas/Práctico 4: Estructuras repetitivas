# Adriel Lopez
# Práctico 4: Estructuras repetitivas
import random

#1) Crea un programa que imprima en pantalla todos los números enteros desde 0 hasta 100
#(incluyendo ambos extremos), en orden creciente, mostrando un número por línea.

contador = 0

for i in range (0,101):
    print(contador)
    contador= contador + 1
    
    
#2) Desarrolla un programa que solicite al usuario un número entero y determine la cantidad de
#dígitos que contiene.

num= input("Ingrese un munero entero para determine la cantidad determinar cuantos dígitos que contiene: ")
contador2 = len(num)
print ("El numero",num, "contiene", contador2, "caracteres")

#3) Escribe un programa que sume todos los números enteros comprendidos entre dos valores
#dados por el usuario, excluyendo esos dos valores.

num1= int(input("Ingrese el primer número: "))
num2= int(input("Ingrese el segundo número: "))

if num1 > num2:
    num1, num2 = num2, num1
    
contador3 = 0
for i in range (num1 +1, num2):
    contador3  += i

# Mostramos el resultado
print(f"La suma de los enteros entre {num1} y {num2}, excluyéndolos, es: {contador3}")

#4) Elabora un programa que permita al usuario ingresar números enteros y los sume en
#secuencia. El programa debe detenerse y mostrar el total acumulado cuando el usuario ingrese
#un 0.

vnumero = int(input("Ingrese los numeros enteros que desee para sumarlos:"))
print("para cortar la carga ingresar 0")
sum=0
while vnumero != 0:
    sum= sum+vnumero
    vnumero = int(input("Continue con la Carga:"))

print ("La Suma de todos los numeros que cargo es de: ", sum)
    
#5) Crea un juego en el que el usuario deba adivinar un número aleatorio entre 0 y 9. Al final, el
#programa debe mostrar cuántos intentos fueron necesarios para acertar el número.
 
alenum= random.randint(0, 9)
contador4= 1
intento = int(input("adivine el numero entre 0 y 9: "))

while intento != alenum:
    intento = int(input("Error, intenta nuevamente: "))
    contador4 += 1
print(f"Adivinaste el número {alenum} en {contador4} intentos.")

#6) Desarrolla un programa que imprima en pantalla todos los números pares comprendidos
#entre 0 y 100, en orden decreciente
contador5= 0
print("los números pares comprendidos entre 0 y 100, en orden decreciente son: ")
for i in range(100, -1, -2):
    contador5 = i
    print (contador5)
    
#7) Crea un programa que calcule la suma de todos los números comprendidos entre 0 y un
#número entero positivo indicado por el usuario.

number = int(input("Ingrese un numero: ")) 
contador6 = 0
if number <= 0:
    print("Invalido, ingrese un numero entero positivo")
else:
    if number > 0:
        for i in range(0,number+1):
            contador6 += i            
        print("La suma de los números entre 0 y",number," es:", contador6)
        
#8) Escribe un programa que permita al usuario ingresar 100 números enteros. Luego, el
#programa debe indicar cuántos de estos números son pares, cuántos son impares, cuántos son
#negativos y cuántos son positivos.     


contpar = 0
contimp = 0
contneg = 0
contpos = 0

for i in range(1,101):
    num3 = int(input(f"Ingrese el número : "))
    
    if num3 > 0:
        contpos += 1
    elif num3 < 0:
        contneg += 1
    
    if num3 % 2 == 0:
        contpar += 1
    else:
        contimp += 1

print(f"Pares: {contpar}")
print(f"Impares: {contimp}")
print(f"Negativos: {contneg}")
print(f"Positivos: {contpos}")

#9) Elabora un programa que permita al usuario ingresar 100 números enteros y luego calcule la
#media de esos valores. (Nota: puedes probar el programa con una cantidad menor, pero debe
#poder procesar 100 números cambiando solo un valor).

cont7 = 10
suma = 0

for i in range (cont7):
    valores= int(input("Ingrese un numero: "))
    suma += valores
    
result = suma / cont7 
print ("El promedio de los 100 numeros es de: ", result) 

#10) Escribe un programa que invierta el orden de los dígitos de un número ingresado por el
#usuario. Ejemplo: si el usuario ingresa 547, el programa debe mostrar 745.


while True:
    numero = input("Ingrese un número para invertirlo: ")
    print("Ponga n para finalizar")    
    
    if numero.lower() == "n":
        break
    
    numero_invertido = numero[::-1]
    print(f"El número invertido es: {numero_invertido}")








