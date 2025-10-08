# Ejercicio Java: Algoritmos de Ordenación con Hilos

## Descripción

Este proyecto implementa tres algoritmos de ordenación en Java utilizando hilos para ejecutarlos en paralelo:

- **Merge Sort**
- **Selection Sort**
- **Bubble Sort**

Cada algoritmo se ejecuta en un hilo independiente y se mide su tiempo de ejecución usando `System.nanoTime()` para determinar cuál termina primero.

## Cómo funciona

1. Se crea un arreglo de números aleatorios.
2. Cada algoritmo se ejecuta en su propio hilo.
3. Se utiliza `nanoTime()` antes y después de cada ejecución para calcular la duración.
4. Se muestra en consola el tiempo que tardó cada algoritmo en promedio.
