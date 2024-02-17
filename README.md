# Pract1
Este programa en Java calcula una aproximación del número pi utilizando el método de Montecarlo.

El método de Montecarlo es una técnica estadística que se utiliza para aproximar el valor de una cantidad desconocida mediante la generación de números aleatorios. En el caso de calcular pi, se generan puntos aleatorios dentro de un cuadrado y se cuenta cuántos de estos puntos están dentro de un círculo inscrito en el cuadrado. La relación entre el área del círculo y el área del cuadrado nos proporciona una aproximación de pi.

El proyecto consta de dos clases Java:

1. Matematicas.java: Esta clase contiene la lógica para generar una aproximación de pi mediante el método de Montecarlo. La función `generarNumeroPiIterativo()` toma el número de pasos como parámetro y devuelve una aproximación de pi basada en el número de puntos generados.

2. Principal.java: Esta es la clase principal del programa. Lee el número de pasos desde los argumentos de línea de comandos, llama a la función `generarNumeroPiIterativo()` de la clase `Matematicas` para obtener la aproximación de pi y luego imprime el resultado en la consola.
