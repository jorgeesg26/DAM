Algoritmo rectanguloexamen
    Definir base, altura Como Entero
    Definir opcion Como Entero
	
    Repetir
        Escribir "1. Introduzca la dimensi�n de la base del rect�ngulo."
        Escribir "2. Introduzca la dimensi�n de la altura del rect�ngulo."
        Escribir "3. Pinta el rect�ngulo."
        Escribir "4. Intercambia base por altura."
        Escribir "5. Salir"
        Escribir "Seleccione una opci�n: "
        Leer opc
		
        Segun opc Hacer
            Caso 1:
                Escribir "Introduzca la dimensi�n de la base del rect�ngulo: "
                Leer ancho
            Caso 2:
                Escribir "Introduzca la dimensi�n de la altura del rect�ngulo: "
                Leer altura
            Caso 3:
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
            Caso 4:
                Definir paco Como Entero
                paco <- ancho
                ancho<- altura
                altura <- paco
            Caso 5:
                Escribir "Saliendo del programa."
            De Otro Modo:
                Escribir "Opci�n no v�lida."
        FinSegun
    Hasta Que opc = 5
FinAlgoritmo

