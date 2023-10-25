Funcion resultado <- suma (sumando1, sumando2)
	resultado<-sumando1+sumando2
Fin Funcion
Funcion resultado2 <- resta (restando1, restando2)
	resultado2<-restando1-restando2
Fin Funcion
Funcion resultado3 <- multiplicación (multiplicando1, multiplicando2)
	resultado3<-multiplicando1*multiplicando2
Fin Funcion
Funcion resultado4 <- division (div1, div2)
	resultado4<-div1/div2
Fin Funcion
Algoritmo sin_titulo
	Repetir 
		Escribir "bon dia president"
	
		Escribir "eliga una opcion"
		Escribir "1. + suma"
		Escribir "2. - resta"
		Escribir "3, *multiplicación"
		Escribir "4, /division"
		Leer elección 
		Segun elección Hacer
			1:
				Escribir "introduce primer sumando"
				leer suma1
				escribir "introduce segundo sumando"
				leer suma2
				resultado<-suma (suma1, suma2)
				escribir "la suma de " suma1 " y " suma2 "es igual a " resultado
			2:
				Escribir "introduce primer restando"
				leer resta1
				escribir "introduce segundo sumando"
				leer resta2
				resultado<-resta (resta1, resta2)
				escribir "la resta de " resta1 " y " resta2 "es igual a " resultado
			3:
				Escribir "introduce el primer multiplicando"
				leer multiplicado1
				Escribir "introduce el segundo multiplicando"
				leer multiplicado2
				resultado<-multiplicacion (multiplicado1, multiplicado2)
				escribir "la multiplicacion de " multiplicado1 " y " multiplicado2 "es igual a " resultado
			4:
				Escribir "introduce primer dividido"
					leer dividido1
					escribir "introduce segundo dividido"
					leer dividido2
					resultado<-division (dividido1, dividido2)
					si dividido2=0 Entonces
						escribir"no se puede dividir"
					
					sino escribir "la divison de " dividido1 " y " dividido2 "es igual a " resultado
					
				FinSi
				
			
			De Otro Modo:
				escribir "lee las opciones bien"
		FinSegun
	Hasta que elección=1 o elección=2 o elección=3 o elección=4
FinAlgoritmo
