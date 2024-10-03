# Linked-List-y-Array

## OrdenarMergeSort
El algoritmo implementa el método de ordenamiento MergeSort para una lista de estudiantes. Comienza dividiendo la lista en mitades de forma recursiva hasta llegar a sublistas de un solo elemento. Luego, cada mitad se ordena independientemente usando la misma técnica. El proceso clave es la combinación (merge) de las sublistas ordenadas, donde se comparan los elementos de ambas sublistas y se colocan en el orden correcto según el criterio especificado por el parámetro booleano 'ascendente'. Durante la fusión, se van seleccionando los estudiantes comparando sus índices académicos y añadiéndolos a una nueva lista resultado. Una vez que se agota una de las sublistas, los elementos restantes de la otra se añaden directamente al final, ya que están en orden. Este proceso asegura que la lista final quede completamente ordenada según el índice académico de los estudiantes, ya sea de forma ascendente o descendente.

### Para usar el algoritmo
Debe ingresar un valor en la variable n.

```java
public static void main(String[] args) {
        int n = 20;
        List<Estudiante> estudiantes = genEstudiante(n);
```
### Ejemplo de salida

Estudiantes sin organizar: 

10150001 - Estudiante No.1 - 43.87
10150002 - Estudiante No.2 - 1.65
10150003 - Estudiante No.3 - 45.06
10150004 - Estudiante No.4 - 81.57
10150005 - Estudiante No.5 - 94.85
10150006 - Estudiante No.6 - 46.76
10150007 - Estudiante No.7 - 92.02
10150008 - Estudiante No.8 - 14.18
10150009 - Estudiante No.9 - 18.31
10150010 - Estudiante No.10 - 64.13
10150011 - Estudiante No.11 - 8.62
10150012 - Estudiante No.12 - 36.7
10150013 - Estudiante No.13 - 41.36
10150014 - Estudiante No.14 - 0.66
10150015 - Estudiante No.15 - 22.3
10150016 - Estudiante No.16 - 11.33
10150017 - Estudiante No.17 - 68.12
10150018 - Estudiante No.18 - 63.9
10150019 - Estudiante No.19 - 19.72
10150020 - Estudiante No.20 - 14.81
Estudiantes organizados: 

10150005 - Estudiante No.5 - 94.85
10150007 - Estudiante No.7 - 92.02
10150004 - Estudiante No.4 - 81.57
10150017 - Estudiante No.17 - 68.12
10150010 - Estudiante No.10 - 64.13
10150018 - Estudiante No.18 - 63.9
10150006 - Estudiante No.6 - 46.76
10150003 - Estudiante No.3 - 45.06
10150001 - Estudiante No.1 - 43.87
10150013 - Estudiante No.13 - 41.36
10150012 - Estudiante No.12 - 36.7
10150015 - Estudiante No.15 - 22.3
10150019 - Estudiante No.19 - 19.72
10150009 - Estudiante No.9 - 18.31
10150020 - Estudiante No.20 - 14.81
10150008 - Estudiante No.8 - 14.18
10150016 - Estudiante No.16 - 11.33
10150011 - Estudiante No.11 - 8.62
10150002 - Estudiante No.2 - 1.65
10150014 - Estudiante No.14 - 0.66

### Complejidad
#### Complejidad temporal:
El algoritmo MergeSort tiene una complejidad de O(n log n) en todos los casos.
La generación de estudiantes es O(n).
#### Eficiencia:
MergeSort es eficiente para grandes conjuntos de datos.
El uso de List<Estudiante> permite flexibilidad pero puede ser menos eficiente que un array para el ordenamiento.
#### Memoria:
MergeSort requiere espacio adicional O(n) para las sublistas durante la recursión.
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
  
