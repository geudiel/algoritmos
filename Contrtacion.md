##Algoritmo de Contratación 


Supongamos se necesita contratar un nuevo empleado, esta contratación la realizará una empresa.

El solicitante será contratado solo si es el mejor.

##Descripción del Algoritmo 

1. Contratar-asistente(n)
2. best=0
3. Para i=1 hasta n
4. Entrevistar candidato i
5. Si candidato es mejor que candidato best
6. best=i
7. Contratar candidato i

##Análisis

**x** es el número de veces que se contrata a un nuevo asistente.

**E[x]** se calculará  definiendo **n** variables que indiquen si un candidato se contrató

Sea *Xi* la  variable aleatoria asociada con el evento en el que el solicitante i es contratado.

Entonces *Xi* = {1 si el solicitante i es contratado y 0 si no es contratado}

E[Xi]= 1/i

Calculando 
[E[x]](http://latex.codecogs.com/gif.latex?E\left&space;[&space;x&space;\right&space;]=E\left&space;[&space;\sum_{x=1}^{n}&space;=_{i}\right&space;])
[](http://latex.codecogs.com/gif.latex?=\sum_{x=1}^{n}E[X_{_{i}}])
[](http://latex.codecogs.com/gif.latex?=\sum_{x=1}^{n}1/i)

*Obtendremos:* 

In n + O(1)
