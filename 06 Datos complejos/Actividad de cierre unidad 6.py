#Tp Practico 6: Recursividad
#Adriel lopez

#1) Crea una función recursiva que calcule el factorial de un número. Luego, utiliza esa
#función para calcular y mostrar en pantalla el factorial de todos los números enteros
#entre 1 y el número que indique el usuario


def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num-1)
        
print(factorial(8))

#2) Crea una función recursiva que calcule el valor de la serie de Fibonacci en la posición
#indicada. Posteriormente, muestra la serie completa hasta la posición que el usuario
#especifique.


def fibo(num1):
    if num1 ==0:
        return 0
    elif num1 ==1:
        return 1
    else:
        return fibo(num1-1) + fibo(num1-2) 
    
num1= int(input("ingrese un numero aplicar la serie de Fibonacci: "))


print(fibo(num1))
print("sucesion de Fibonacci:")
for i in range(num1 + 1):  
    print(fibo(i), end="\n")

#3) Crea una función recursiva que calcule la potencia de un número base elevado a un
#exponente, utilizando la fórmula 𝑛𝑚 = 𝑛 ∗ 𝑛(𝑚−1). Prueba esta función en un
#algoritmo general.

def potencia(base, expo):
    if expo == 0:
        return 1
    elif expo==1:
        return base
    else:
        return base * potencia(base, expo - 1)

base =int(input("Ingrese la base: "))
expo= int(input("Ingrese el exponente: "))

result=(potencia(base,expo))
print(f"{base} elevado a la {expo} es: {result}")

#Crear una función recursiva en Python que reciba un número entero positivo en base
#decimal y devuelva su representación en binario como una cadena de texto.

def pasar_bianrio(num):
    if num == 0:
        return "0"
    elif num == 1:
        return "1"
    else:
        return pasar_bianrio(num // 2) + str(num % 2)


num = int(input("Ingrese un número entero positivo para convertir a binario: "))

if num >= 0:
    resultado = pasar_bianrio(num)
    print(f"{num} en binario es: {resultado}")
else:
    print("Por favor, ingrese un número entero positivo.")

#Implementá una función recursiva llamada es_palindromo(palabra) que reciba una
#cadena de texto sin espacios ni tildes, y devuelva True si es un palíndromo o False si no
#lo es.
#Requisitos:
#La solución debe ser recursiva.
#No se debe usar [::-1] ni la función reversed().

def es_palindromo(palabra):
    if len(palabra) <= 1:
        return True
    if palabra[0] != palabra[-1]:
        return False
    return es_palindromo(palabra[1:-1])

texto = input("Ingrese una palabra \npara determianr si es o no palindromo: ").lower()

if es_palindromo(texto):
    print(True)
else:
    print(False)

#6) Escribí una función recursiva en Python llamada suma_digitos(n) que reciba un
#número entero positivo y devuelva la suma de todos sus dígitos.
#Restricciones:
#No se puede convertir el número a string.
#Usá operaciones matemáticas (%, //) y recursión.

def suma_digitos(n):
    if n < 10:
        return n
    else:
        return n % 10 + suma_digitos(n // 10)

numero = int(input("Ingrese un número: "))
resultado = suma_digitos(numero)
print(f"La suma de los dígitos de {numero} es: {resultado}")

#7) Un niño está construyendo una pirámide con bloques. En el nivel más bajo coloca n
#bloques, en el siguiente nivel uno menos (n - 1), y así sucesivamente hasta llegar al
#Escribí una función recursiva contar_bloques(n) que reciba el número de bloques en el
#nivel más bajo y devuelva el total de bloques que necesita para construir toda la
#pirámide.

def contar_bloques(n):
    if n == 1:
        return 1
    else:
        return n + contar_bloques(n - 1)

nivel_base = int(input("Ingrese el número de bloques del nivel más bajo: "))
total = contar_bloques(nivel_base)
print(f"Total de bloques necesarios: {total}")

#Escribí una función recursiva llamada contar_digito(numero, digito) que reciba un
#número entero positivo (numero) y un dígito (entre 0 y 9), y devuelva cuántas veces
#aparece ese dígito dentro del número.

def contar_digito(numero, digito):
    if numero == 0:
        return 0
    else:
        ultimo = numero % 10
        coincidencia = 1 if ultimo == digito else 0
        return coincidencia + contar_digito(numero // 10, digito)
#ejemplos
print(contar_digito(12233421, 2))  
print(contar_digito(5555, 5))    
print(contar_digito(123456, 7))


