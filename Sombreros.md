##Algoritmo de los Sombreros

Supongamos que un número **n** de personas dejan su sombrero al entrar, a un encargado en x lugar, al retirarse el encargado devuelve el sombrero de manera aleatoria, ¿A cuántas personas le regreso el mismo sombrero?


##Descripción del Algoritmo

1.  Definir espacio de prueba
2.  Lo definimos como S = {sc, si} 
3.  Asignamos SC=Sombrero correcto  
4.  Y Si=sombrero incorrecto
5.  Calcular E[X] definiendo **i** variables que indiquen 	si una persona recibió el sombrero correcto

##Análisis del Algotimo 

+ **Psc={1/m}** 
+ **Psi{m-1/m}**
+ [Ecuación 1 =](http://latex.codecogs.com/gif.latex?\inline&space;E\left&space;[&space;X&space;\right&space;]=&space;E\left&space;[&space;\sum_{i=1}^{n}&space;X_{i}&space;\right&space;])
+ [Ecuación 2 =](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;E\left&space;[&space;X_{i}&space;\right&space;])
+ [Ecuación 3 =](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;\frac{1}{m-i&plus;1})
+ [Ecuación 4 =](http://latex.codecogs.com/gif.latex?\inline&space;=&space;\sum_{i=1}^{n}&space;\frac{1}{i})
+ In n + O(1)