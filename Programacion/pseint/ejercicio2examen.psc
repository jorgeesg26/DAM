Algoritmo NumerosAmigos
    Escribir "Introduzca un número:"
    Leer numero1
    Escribir "Introduzca otro número:"
    Leer numero2
    suma1 <- 0
    suma2 <- 0
	
    Escribir "Los divisores propios de " numero1 " son:"
	
    Para divisor <- 1 Hasta numero1 - 1 Con Paso 1 Hacer
        Si numero1 MOD divisor = 0 Entonces
            suma1 <-suma1+divisor
            Escribir divisor
        Fin Si
    Fin Para
	
    Escribir "La suma de los mismos es:", suma1
	
    Escribir "Los divisores propios de " numero2 " son:"
	
    Para divisor <- 1 Hasta numero2 - 1 Con Paso 1 Hacer
        Si numero2 MOD divisor = 0 Entonces
            suma2 <- suma2 + divisor
            Escribir divisor
        Fin Si
    Fin Para
	
    Escribir "La suma de los mismos es: " suma2
	
    Si (numero1=suma2) Y (numero2 = suma1) Entonces
        Escribir "Los dos números SI son amigos"
    Sino
        Escribir "Los dos números NO son amigos"
    Fin Si
FinAlgoritmo
