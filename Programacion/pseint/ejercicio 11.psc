
	Algoritmo compra_zapatos
		precio_zapato=80
		Escribir "¿Cuántos zapatos va a comprar la tienda?"
		Leer zapatos
		Si zapatos<10 Entonces
			Escribir "No se aplica ningún descuento a tu compra. El precio a pagar es " zapatos*precio_zapato
		SiNo 
			Si zapatos>=10 y zapatos<=20 Entonces
				Escribir "Se aplica un descuento del 10% a tu compra. El precio a pagar es " ((precio_zapato*0.9)*zapatos)
			SiNo
				Si zapatos>20 y zapatos<=30 Entonces
					Escribir "Se aplica un descuento del 20% a tu compra. El precio a pagar es " ((precio_zapato*0.8)*zapatos)
				SiNo
					Escribir "Se aplica un descuento del 40% a tu compra. El precio a pagar es " ((precio_zapato*0.6)*zapatos)
				Fin Si
			Fin Si
		FinSi	

	FinAlgoritmo
