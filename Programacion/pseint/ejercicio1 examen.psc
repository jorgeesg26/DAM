Algoritmo Divisorysuma
    Definir n, divisor, suma Como Entero
	
    Escribir "Introduzca un número: "
    Leer n
	
    Si n <= 0 Entonces
        Escribir "El número debe ser mayor que 0."
    Sino
        suma <- 0
        Escribir "Los divisores propios de " n " son: "
        Para divisor <- 1 Hasta n - 1
            Si n mod divisor = 0 Entonces
                Escribir divisor;
                suma<- suma + divisor
            FinSi
        FinPara
        Escribir ""
        Escribir "La suma de los mismos es ", suma
    FinSi
FinAlgoritmo

