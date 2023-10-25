Algoritmo palíndromo
	Repetir
		Escribir "introduzca una frase para comprobar"
		Leer frase
	Hasta Que Longitud(frase)>1
	izquierda<-1
	derecha<-Longitud(frase)
	es_palindromo<-Verdadero
	Repetir
		Mientras Subcadena(frase,izquierda,izquierda) = " " Hacer
			izquierda<-izquierda+1
		FinMientras
		Mientras Subcadena(frase,derecha,derecha) = " " Hacer
			derecha<-derecha-1
		Fin Mientras
		Si Subcadena(frase, izquierda, izquierda) <> Subcadena(frase, derecha,derecha) Entonces
			es_palindromo<-Falso
		FinSi
	Hasta Que izquierda>=derecha o es_palindromoSubcadena = Falso
	Si es_palindromo Entonces
		Escribir "La frase introducida es un palíndromo"
	SiNo
		Escribir "La frase introducida no es un palíndromo"
	FinSi
FinAlgoritmo
