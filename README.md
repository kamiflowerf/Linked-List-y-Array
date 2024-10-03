# Linked-List-y-Array

## OrdenarMergeSort
El algoritmo es encarga de dividir la lista de estudiantes para ordenar ambas mitades recursivamente, luego de ordenarlas la junta de la manera correcta, este compara y mezcla las dos sublistas dependiento del boolean ascendente. Y para finalizar agrega los elementos restantes.

### Para usar el algoritmo
Debe ingresar un valor en la variable n.

```java
public static void main(String[] args) {
        int n = 20;
        List<Estudiante> estudiantes = genEstudiante(n);
```

Luego de esto se imprimiran los estudiantes generados y luego los mismos estudiante organizados.

## Linked List and Array

**- Descripción del algoritmo -**
Este programa implementa un algoritmo que realiza desplazamientos circulares en un arreglo de objetos. El arreglo contiene elementos de diferentes tipos de datos (enteros y cadenas de texto). El usuario ingresa un valor 𝑡 que indica cuántos desplazamientos se deben realizar.

El desplazamiento se realiza de la siguiente manera:

Si el número de iteración es par (𝑖%2==0), se desplazan los elementos de la primera mitad del arreglo hacia la derecha. El último elemento de la primera mitad se mueve al inicio.
Si el número de iteración es impar (i%2!=0), se desplazan los elementos de la segunda mitad del arreglo hacia la derecha. El último elemento de la segunda mitad se mueve al inicio de esta mitad.

**- Ejemplo de entrada y salida -**
Para t = 2:

Ingrese el valor de t: 2
Arreglo original: 
df 23 45 34 33 h 5 2 
Ingrese el valor de t: 2
Arreglo desplazado: 
45 df 23 34 2 33 h 5 

- Análisis del rendimiento -
El tamaño del arreglo (n): A mayor tamaño del arreglo, mayor será el número de desplazamientos requeridos dentro de cada iteración. En el peor de los casos, cada desplazamiento requiere recorrer la mitad del arreglo, lo que resulta en un costo temporal lineal con respecto a n.
El valor de t: Cuantos más desplazamientos (t) se realicen, más iteraciones serán necesarias. Por cada iteración, el algoritmo realiza un desplazamiento sobre la mitad del arreglo.

Para cada iteración t, el algoritmo realiza desplazamientos dentro de la mitad del arreglo (de tamaño n/2). Por lo tanto, la complejidad por cada iteración es O(n). Como el algoritmo realiza t iteraciones, la complejidad temporal total es: O(t×n)
  
