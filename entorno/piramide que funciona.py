# -*- coding: cp1252 -*-
num = int(input("Ingrese un n�mero entero impar: "))
while num%2==0:
    num = int(input("Incorrecto. Ingrese un n�mero entero impar: "))

# N�mero de filas en la matriz
n = (num//2)+1
# N�mero de columnas en la matriz
num

for i in range(n):
  for j in range(num):
    if ((j>=(num//2)-i) and (j<=(num//2)+i)):
      print("*",end='')
    elif (j==num-1):
      print("")
    else:
      print(' ',end='')      
        



print(" ")