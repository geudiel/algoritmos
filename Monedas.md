##Algoritmo de las Monedas

Se necesita saber el número de veces que una moneda caerá  Águila

##Descripción del Algoritmo

   1. Lanzamientos(n)
   2. Para i=1 hasta n
   3. Lanzar aleatoria mente la moneda
   4. Si  Lanzamiento = águila 
   5. regresar águila
   6. Si no 
   7. regresar sol

##Análisis del Algoritmo

Definimos nuestro espacio muestra 

+ **S= {a,s}**  
+ **Pr{a}= Pr{s} =1/2**

Sea X la variable aleatoria asociada con el evento

X= {1 si cae Aguila, 0 si cae Sol}

+ [Ecuación 1 =](http://latex.codecogs.com/gif.latex?E\left&space;[&space;X_{H}&space;\right&space;]\left&space;=&space;E\left&space;[&space;I\left&space;\{&space;H&space;\right&space;\}&space;\right&space;])
+ [Ecuación 2 =](http://latex.codecogs.com/gif.latex?\inline&space;=1*Pr\left&space;\{&space;a&space;\right&space;\}&plus;0*Pr\left&space;\{&space;s&space;\right&space;\}&space;=&space;1*\left&space;(&space;1/2&space;\right&space;)&space;&plus;&space;0*\left&space;(&space;1/2&space;\right&space;)&space;=&space;1/2)

 **Xi**  es el indicador de la variable aleatoria asociada con el evento del lanzamiento i-esimo de una moneda donde es aguila

Xi = I {el i-esimo lanzamiento de una moneda resulta en el evento H}

Sea X el numero variable de Aguilas que aparece despues de **n**  lanzamientos de la moneda

+ [Ecuación 3 =](http://latex.codecogs.com/gif.latex?\inline&space;X=&space;\sum_{i=1}^{n}&space;X_{i})

Calculamos el número de veces que cayó águila

+ [Ecuación 4 =](http://latex.codecogs.com/gif.latex?\inline&space;E\left&space;[&space;X&space;\right&space;]=E\left&space;[&space;\sum_{i=1}^{n}&space;X_{i}\right&space;])
+ [Ecuación 5](http://latex.codecogs.com/gif.latex?\inline&space;=\sum_{i=1}^{n}E\left&space;[&space;X_{i}&space;\right&space;]&space;=\sum_{i=1}^{n}&space;1/2&space;=&space;n/2)

