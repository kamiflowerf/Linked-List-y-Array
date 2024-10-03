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
