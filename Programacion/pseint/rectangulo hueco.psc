Algoritmo Rectangulo
    Escribir "Ingresa el ancho del rect�ngulo:"
    Leer ancho
    Escribir "Ingresa la altura del rect�ngulo:"
    Leer altura
	
    Para fila <- 1 Hasta altura Con Paso 1 Hacer
        Para columna <- 1 Hasta ancho Con Paso 1 Hacer
            Si fila = 1 O fila = altura O columna = 1 O columna = ancho Entonces
                Escribir Sin Saltar "* "
            Sino
                Escribir Sin Saltar "  "
            Fin Si
        Fin Para
        Escribir " "
    Fin Para
FinAlgoritmo
