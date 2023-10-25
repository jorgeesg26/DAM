Algoritmo piramide_invertida
	Escribir "¿De qué altura quieres la pirámide invertida?"
	Leer n
	Para i <- n Hasta 1 Con Paso -1 Hacer
		Para espacio <- 1 Hasta n - i Con Paso 1 Hacer
			Escribir Sin Saltar "  "
		Fin Para
		Para asterisco <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir Sin Saltar "* "
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo

