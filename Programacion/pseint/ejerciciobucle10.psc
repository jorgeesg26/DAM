Algoritmo ejerciciobucle10
	Definir num, i, cont Como Entero
    
    Escribir "Ingresa un número: "
    Leer num
    
    cont <- 0
    
    Para i <- 1 Hasta num Hacer
        Si num % i = 0 Entonces
            cont <- cont + 1
        Fin Si
    Fin Para
    
    Si cont = 2 Entonces
        Escribir "El número ", num, "es primo."
    Sino
        Escribir "El número ", num, "no es primo."
    Fin Si
FinAlgoritmo
