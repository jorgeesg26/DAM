
	Algoritmo �rbol_navidad
		Escribir "�de qu� altura quieres el arbol?"
		Leer n
		Para i<-1 Hasta n Con Paso 1 Hacer
			Para espacio<-1 Hasta n-i Con Paso 1 Hacer
				Escribir Sin Saltar "  "
			Fin Para
			Para asterisco<-1 Hasta 2*i-1 Con Paso 1 Hacer
				Escribir Sin Saltar "* "
			Fin Para
			Escribir " "
		Fin Para
		Para i<-n+1 Hasta n+1 Con Paso 1 Hacer
			Para espacio<-1 Hasta n-1 Con Paso 1 Hacer
				Escribir Sin Saltar "  "
			Fin Para
			Escribir "* "
		Fin Para
FinAlgoritmo

