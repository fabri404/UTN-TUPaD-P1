#Adriel Lopez

def imprimir_hola_mundo():
    
    print("Hola Mundo")
    
    return

#--------------------------------

def saludar_usuario():
    nombre = input("Ingrese su nombre: ")
    print(f'Hola {nombre}!')
    return

#--------------------------------

def informacion_personal(nombre,apellido,edad,residencia):    
    print(f'Soy {nombre} {apellido}, tengo {edad} años y vivo en {residencia}')
    return

#--------------------------------
pi= 3.14159

def calcular_area_circulo(radio):
    area= pi * radio ** 2
    print(f'El area del circulo es {area} ')
    return
    

def calcular_perimetro_circulo(radio):
    peri= 2* pi* radio
    print(f'El perimetro del circulo es {peri} ')
    return

#--------------------------------

def segundos_a_horas(seg):
    
    horas = seg // 3600
    print(f'La cantidad de horas equivalentes son: {horas}') 

#--------------------------------

def tabla_multiplicar(numero):
    
    for i in range(1,11):
        
        tabla = numero * i
        
        print(f'{i} x {numero} = {tabla}')
        
    return
    
#--------------------------------

def operaciones_basicas(a, b):
    
    suma = a + b
    resta = a - b
    mult = a * b
    if b != 0:
        div = a // b  
    else:
        div = "Error: división por cero"
    
    print(f'-- OPERACIONES: --\n Suma = {suma} \n Resta = {resta} \n Multiplicacion = {mult} \n Dividicion= {div}')
   
    return 

#--------------------------------

def calcular_imc(peso, altura):
    
    imc= peso / (altura ** 2)
    
    print(f'Tu indice de masa corporal (IMC)  es: {imc}')     
    return

#--------------------------------

def celsius_a_fahrenheit(celsius):
    
    fahrenheit = (celsius * 9 / 5) + 32
    
    print(f'El equivalente en grados Fahrenheit es {fahrenheit}')
    
celsius_a_fahrenheit(25)

#--------------------------------

def calcular_promedio(a, b, c):
    prom= (a+b+c) / 3
    
    print(f'El promedio de tus 3 notas es: {prom}')


