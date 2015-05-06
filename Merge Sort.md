##Algoritmo Merge 

<p style="text-align: justify;">

Se aplica la técnica divide-y-vencerás, dividiendo la secuencia de datos en dos subsecuencias hasta que las subsecuencias tengan un único elemento, luego se ordenan mezclando dos subsecuencias ordenadas en una secuencia
ordenada, en forma sucesiva hasta obtener una secuencia única ya ordenada.

</p>

<p style="text-align: justify;">

Si n = 1 solo hay un elemento por ordenar, sino se hace una ordenación de mezcla de la primera mitad del arreglo con la segunda mitad. Las dos mitades se ordenan de igual forma.

</p>

##Pseudocódigo

 ALGORITMO MERGE

	Inicio 
	
	S <- CreaVector( longitud(S1) + longitud(S2) )
	i <- 0
	j <- 0

	MIENTRAS (i < longitud(S1) o j < longitud(S2))
	{
		SI (j = longitud(S2) o (i < longitud(S1) y S1[i] <= S2[j]))
		{
			S[i+j] <- S1[i]
			i <- i+1
		}
		SI NO	
		{
			S[i+j] <- S2[j]
			j <- j+1
		}
	}
	
	RETURN S
	
	FIN
 
	
	

##Tiempo de Ejecucuión  

La relación de recurrencia del algoritmo es T(1) = 1, T(n = 2 T(n/2) + n, cuya solución es T(n) = n log n.