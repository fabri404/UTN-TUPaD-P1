#Proyecto Integrador Programacion I
# Adriel Lopez
# Gastón Lell

import time
import random
from FuncionesTpIntegradorI import *

# Crear listado con 1 millón de productos ordenados
productos = sorted([f"ProdNum:{i}" for i in range(1000000)])
# sorted es una funcion que te devuelve un lista ordenada

tiempos_for = []
tiempos_binaria = []

print("\nComparacion de tiempo de busqueda\n")

# Realizar 10 búsquedas con cada método
for i in range(10):
    producto_buscado = random.choice(productos)
    print(f"Búsqueda N°{i+1} de:{producto_buscado}")

    # Búsqueda con FOR
    inicio_for = time.time()
    for j in range(len(productos)):
        if productos[j] == producto_buscado:
            break
    fin_for = time.time()
    tiempos_for.append(fin_for - inicio_for)

    # Búsqueda BINARIA
    inicio_bin = time.time()
    pos_bin = busqueda_binaria(productos, producto_buscado)
    fin_bin = time.time()
    tiempos_binaria.append(fin_bin - inicio_bin)

# Calcular promedios
promedio_for = sum(tiempos_for) / len(tiempos_for)
promedio_bin = sum(tiempos_binaria) / len(tiempos_binaria)

# Mostrar resultados
print("\nRESULTADOS PROMEDIO DE TIEMPO:\n")
print(f"Busqueda lineal FOR → {promedio_for:.10f} segundos")
print(f"Busqueda BINARIA → {promedio_bin:.10f} segundos\n")
