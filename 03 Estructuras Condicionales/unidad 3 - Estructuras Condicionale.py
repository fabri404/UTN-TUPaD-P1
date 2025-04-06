from statistics import mode, median, mean
import random
#Actividades
#1) Escribir un programa que solicite la edad del usuario. Si el usuario es mayor de 18 años,
#deberá mostrar un mensaje en pantalla que diga “Es mayor de edad”.


edad1= int(input("Ingrese su edad:"))

if edad1 > 18: 
    print("Usted es mayor de edad")
else:
    print("Usted NO es mayor de edad")


#2) Escribir un programa que solicite su nota al usuario. Si la nota es mayor o igual a 6, deberá
#mostrar por pantalla un mensaje que diga “Aprobado”; en caso contrario deberá mostrar el
#mensaje “Desaprobado”


nota= int(input("Ingrese su edad:"))

if nota >= 6:
    print('Aprobado')
else:
    print('Desaprobado')

#3) Escribir un programa que permita ingresar solo números pares. Si el usuario ingresa un
#número par, imprimir por en pantalla el mensaje "Ha ingresado un número par"; en caso
#contrario, imprimir por pantalla "Por favor, ingrese un número par". Nota: investigar el uso del
#operador de módulo (%) en Python para evaluar si un número es par o impar.

num= int(input("Ingrese un numero par:"))

if num % 2 == 0: 
    print("Usted ingreso un numero par")
else:
    print("Usted NO ingreso un numero par, intente de nuevo")

#4) Escribir un programa que solicite al usuario su edad e imprima por pantalla a cuál de las
#siguientes categorías pertenece:
#● Niño/a: menor de 12 años.
#● Adolescente: mayor o igual que 12 años y menor que 18 años.
#● Adulto/a joven: mayor o igual que 18 años y menor que 30 años.
#● Adulto/a: mayor o igual que 30 años.

edad2 = int(input("Ingrese edad:"))

if edad2 < 12:
    print ("CATEGORIA: NIÑO") 
elif edad2 >= 12 and edad2 < 18:
    print ("CATEGORIA: ADOLESCENTE") 
elif edad2 >= 18 and edad2 < 30:
    print ("CATEGORIA: ADULTO/JOVEN") 
elif edad2 >= 30:
    print ("CATEGORIA: ADULTO") 
else:
    print("Ingrese un numero valido")

#5) Escribir un programa que permita introducir contraseñas de entre 8 y 14 caracteres
#(incluyendo 8 y 14). Si el usuario ingresa una contraseña de longitud adecuada, imprimir por en
#pantalla el mensaje "Ha ingresado una contraseña correcta"; en caso contrario, imprimir por
#pantalla "Por favor, ingrese una contraseña de entre 8 y 14 caracteres". Nota: investigue el uso
#de la función len() en Python para evaluar la cantidad de elementos que tiene un iterable tal
#como una lista o un string.

contra = input("Ingrese su contraseña:")
cant = len(contra)
if 8 <= cant <= 14:
    print("Ha ingresado una contraseña correcta")
else:   
    print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres")

# ACTIVIDAD 6)

numeros_aleatorios = [random.randint(1, 100) for i in range(50)]

media = mean(numeros_aleatorios)
mediana = median(numeros_aleatorios)
moda = mode(numeros_aleatorios)

print("Números:", numeros_aleatorios)
print(f"Media: {media}")
print(f"Mediana: {mediana}")
print(f"Moda: {moda}")

if media > mediana > moda:
    print("Distribución con SESGO POSITIVO (a la derecha)")
elif media < mediana < moda:
    print("Distribución con SESGO NEGATIVO (a la izquierda)")
else:
    if media == mediana == moda:
        print("Distribución SIN SESGO")

#7) Escribir un programa que solicite una frase o palabra al usuario. Si el string ingresado
#termina con vocal, añadir un signo de exclamación al final e imprimir el string resultante por
#pantalla; en caso contrario, dejar el string tal cual lo ingresó el usuario e imprimirlo por
#pantalla.

texto = input("Ingrese una frase o palabra: ")

if texto[-1].lower() in "aeiou":
    texto += "!"  

print("Resultado:", texto)

#8) Escribir un programa que solicite al usuario que ingrese su nombre y el número 1, 2 o 3
#dependiendo de la opción que desee:
#1. Si quiere su nombre en mayúsculas. Por ejemplo: PEDRO.
#2. Si quiere su nombre en minúsculas. Por ejemplo: pedro.
#3. Si quiere su nombre con la primera letra mayúscula. Por ejemplo: Pedro.
#El programa debe transformar el nombre ingresado de acuerdo a la opción seleccionada por el
#usuario e imprimir el resultado por pantalla. Nota: investigue uso de las funciones upper(),
#lower() y title() de Python para convertir entre mayúsculas y minúsculas.

nombre3 = input("Ingrese su nombre: ")
print("1. Si quiere su nombre en mayúsculas /n " \
"2. Si quiere su nombre en minúsculas./n" \
"3. Si quiere su nombre con la primera letra mayúscula.")
opc= int(input("Ingrese una opcion:"))

if opc == 1:
    print("Resultado:", nombre3.upper())
elif opc == 2:
    print("Resultado:", nombre3.lower())
elif opc == 3:
    print("Resultado:", nombre3.title())
else:
    print("Ingrese una opcion valida")

#9) Escribir un programa que pida al usuario la magnitud de un terremoto, clasifique la
#magnitud en una de las siguientes categorías según la escala de Richter e imprima el resultado
#por pantalla:
#● Menor que 3: "Muy leve" (imperceptible).
#● Mayor o igual que 3 y menor que 4: "Leve" (ligeramente perceptible).
#● Mayor o igual que 4 y menor que 5: "Moderado" (sentido por personas, pero
#generalmente no causa daños).
#● Mayor o igual que 5 y menor que 6: "Fuerte" (puede causar daños en estructuras
#débiles).
#● Mayor o igual que 6 y menor que 7: "Muy Fuerte" (puede causar daños significativos).
#● Mayor o igual que 7: "Extremo" (puede causar graves daños a gran escala).

mag= float(input("Ingrese la magnitud del terremoto"))

if mag < 3:
    print("Muy leve")
elif mag >= 3 and mag < 4:
    print("Leve")
elif mag >= 4 and mag < 5:
    print("moderado")
elif mag >= 5 and mag < 6:
    print("Fuerte")
elif mag >= 6 and mag < 7:
    print("Muy fuerte")
elif mag >= 7:
    print("Extremo")
else:
    print(" ingrese un magnitud valida")

#Actividad 10)

emi= input("Ingrese en que hemisferio se encuentra (N/S)")
mes = int(input("¿Qué mes es? (1-12): "))
dia = int(input("¿Qué día es? (1-31): "))

if emi not in ['N', 'S'] or not (1 <= mes <= 12) or not (1 <= dia <= 31):
    print("Entrada inválida. Verifique los datos.")
else:
    fecha = (mes, dia)
    if (mes == 12 and dia >= 21) or (mes in [1, 2]) or (mes == 3 and dia <= 20):
        estacion_norte = "Invierno"
        estacion_sur = "Verano"
    elif (mes == 3 and dia >= 21) or (mes in [4, 5]) or (mes == 6 and dia <= 20):
        estacion_norte = "Primavera"
        estacion_sur = "Otoño"
    elif (mes == 6 and dia >= 21) or (mes in [7, 8]) or (mes == 9 and dia <= 20):
        estacion_norte = "Verano"
        estacion_sur = "Invierno"
    elif (mes == 9 and dia >= 21) or (mes in [10, 11]) or (mes == 12 and dia <= 20):
        estacion_norte = "Otoño"
        estacion_sur = "Primavera"
    if emi == "N":
        print("Estás en:", estacion_norte)
    else:
        print("Estás en:", estacion_sur)







































