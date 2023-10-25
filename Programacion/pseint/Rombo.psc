Funcion  piramide ( altura )
    para fila <- 1 hasta altura Con Paso 1 Hacer
        Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
            escribir " " Sin Saltar
        Fin Para
        Para asteriscos<-1 Hasta 2*fila - 1 Con Paso 1 Hacer
            escribir "*" Sin Saltar
        Fin Para
        escribir ""
    FinPara
Fin Funcion

Funcion  piramide_invertida ( altura )
	para fila <- altura hasta 1 Con Paso -1 Hacer
		Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
			escribir " " Sin Saltar
		Fin Para
		Para asteriscos<-1 Hasta 2*fila - 1 Con Paso 1 Hacer
			escribir "*" Sin Saltar
		Fin Para
		escribir ""
	FinPara
Fin Funcion

Algoritmo Rombo
    
    Leer altura
    
    piramide(altura)
    piramide_invertida(altura)
    
FinAlgoritmo
