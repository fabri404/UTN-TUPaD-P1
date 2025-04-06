#ACTIVIDADES DE ADRIEL LOPEZ

#1) Crear un programa que imprima por pantalla el mensaje: “Hola Mundo!”.

print("Hola Mundo!")

#2) Crear un programa que pida al usuario su nombre e imprima por pantalla un saludo usando
# el nombre ingresado. Por ejemplo: si el usuario ingresa “Marcos”, el programa debe imprimir
# por pantalla “Hola Marcos!”. Consejo: esto será más sencillo si utilizas print(f…) para
# realizar la impresión por pantalla.

salud= input("Ingrese su nombre:")

print(f'Hola', salud +'!')

#3) Crear un programa que pida al usuario su nombre, apellido, edad y lugar de residencia e
#imprima por pantalla una oración con los datos ingresados. Por ejemplo: si el usuario ingresa
#“Marcos”, “Pérez”, “30” y “Argentina”, el programa debe imprimir “Soy Marcos Pérez, tengo 30
#años y vivo en Argentina”. Consejo: esto será más sencillo si utilizas print(f…) para realizar
#la impresión por pantalla.

info1= input("Ingrese su nombre:")
info2= input("Ingrese su apellido:")
info3= int(input("Ingrese su edad:"))
info4= input("Ingrese su pais de recidencia:")

print(f"Soy", info1, info2 + ", tengo", info3, "años y vivo en "+ info4 )

#4) Crear un programa que pida al usuario el radio de un círculo e imprima por pantalla su área y
#su perímetro.

pi = 3.1416  

radio = float(input("Ingrese el radio del círculo: "))

area = pi * radio * radio
perimetro = 2 * pi * radio

print(f"El area del círculo es: {area} y el perimetro es {perimetro}")

#5) Crear un programa que pida al usuario una cantidad de segundos e imprima por pantalla a
#cuántas horas equivale.

seg= int(input("Ingrese la cantidad de segundos para saber a cuantas horas equivale:"))

x= seg / 3600

print(seg, "segundos equivalen a", x, "horas")

#6) Crear un programa que pida al usuario un número e imprima por pantalla la tabla de
#multiplicar de dicho número.

num= int(input("Ingese un numero para mostrar su tabla de multipplicar:"))

for i in range(1,11):
    mult= num * i
    print(f"{num} x {i} = {mult}")

#7) Crear un programa que pida al usuario dos números enteros distintos del 0 y muestre por
#pantalla el resultado de sumarlos, dividirlos, multiplicarlos y restarlos.

num1= float(input("Ingrese el primer numero para saber el resultado de su suma, resta, div y multiplicacion:"))
num2= float(input("Ahora ingrese el segundo numero para ver los resultados:"))

op1=  num1+num2
op2= num1-num2
op3= num1*num2
op4= num1/num2

print(f"Sus resultados:\nSuma: {op1}\nResta: {op2}\nMultiplicación: {op3}\nDivisión: {op4}")


#8) Crear un programa que pida al usuario su altura y su peso e imprima por pantalla su índice
#de masa corporal. Tener en cuenta que el índice de masa corporal se calcula del siguiente
#modo:

dato1= float(input("Ingrese su altura:"))
dato2= float(input("ingrese su peso:"))

masa= dato2/(dato1**2)

print("su indice de masa de masa corportal es de:", masa)


#Crear un programa que pida al usuario una temperatura en grados Celsius e imprima por
#pantalla su equivalente en grados Fahrenheit. Tener en cuenta la siguiente equivalencia:

gradoc= float(input("Ingrese la temperatura en Celsius para convertirlo en Fahrenheit:"))

gradof=(gradoc * 9/5) + 32

print(f"{gradoc}°C equivalen a {gradof}°F")

#10) Crear un programa que pida al usuario 3 números e imprima por pantalla el promedio de
#dichos números.

nota1=float(input("Ingrese el primer numero:"))
nota2=float(input("Ingrese el segundo numero:"))
nota3=float(input("Ingrese el tercer numero para saber su promedio:"))

sum= nota1+nota2+nota3
prom = sum /3

print("El promedio de los 3 numeros es:", prom)