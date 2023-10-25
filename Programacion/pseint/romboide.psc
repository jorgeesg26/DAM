Algoritmo EjercicioRomboide
	Escribir "Dime la altura de la pirámide"
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		Para espacio<-1 Hasta n-i Con Paso 1 Hacer
			Escribir Sin Saltar "  "
		Fin Para
		Para asterisco = 1 Hasta (2*i)-1 Con Paso 1 Hacer
			Escribir Sin Saltar "* "
		Fin Para
		Para ast<-1 Hasta 2*(n-i)+1 Con Paso 1 Hacer
			Escribir Sin Saltar"* "
		FinPara
		Para espacio<-1 Hasta 2*i Con Paso 1 Hacer
			Escribir Sin Saltar " "
		FinPara
		Escribir " "
	Fin Para	
FinAlgoritmo