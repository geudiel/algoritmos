##Algoritmo de Inserción 


<p style="text-align: justify;">

Este método consiste en insertar un elemento en una parte ya ordenada del vector y comenzar de nuevo con los elementos restantes.
</p>


<p style="text-align: justify;">

Requiere O(n²) operaciones para ordenar una lista de n elementos.

</p>

##Descripción


<p style="text-align: justify;">

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha) o cuando ya no se encuentran elementos (todos los elementos fueron desplazados y este es el más pequeño). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos

</p>

##Pseudocódigo

 ALGORITMO INSERCIÓN

 	INICIO

 	ENTERO X, Z, AUX, ARREGLO[N]

 	LOGICO B

 	PARA(X <- 1, HASTA N, X <- X + 1)

 	{

	 AUX <- ARRAY[X]

	 Z <- X - 1

	 B <- FALSO

	 MIENTRAS(B = FALSO Y Z >= 0)
	 {
		 SI(AUX < ARREGLO[Z])
		 {
			ARREGLO[Z + 1] <- ARREGLO[Z]
			Z <- Z – 1
		 }
		 SI NO
		 {
			B <- VERDAD
		 }
	 }
	 ARREGLO[Z + 1] <- AUX
	}
	FIN

##Tiempo de Ejecución


<p style="text-align: justify;">

Para una lista de n elementos el ciclo externo se ejecuta n-1 veces. El ciclo interno se ejecuta como máximo 1, 2, 3 veces a la tercera iteración, etc., esto tratándose del peor caso posible. Esto produce una complejidad O(n2).

</p>