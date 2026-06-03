
## Universidad Politénica Salesiana
### Nombre: Paola Pintado 

### NRO de Práctica: 4
### Carrera: Computación

### Título de práctica: Comparación situacional de algoritmos de ordenamiento


## Tabla 1. Escenario 1: arreglo completamente desordenado

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.000 | 84.44393 |  0.82138| quick Sort  | Es mas rapido que el metodo de ordenamiento isertion |
| 50.000 | 2393.75278 | 3.06179 | quick Sort | varia el tiempo |
| 100.000 |11401.04533  | 6.83686 |  quick Sort| A mayor  tamaño de escenario  mas tiempo de salida|

## Tabla 2. Escenario 2: arreglo ordenado más una nueva persona

| Tamaño de muestra | Tiempo Inserción | Tiempo QuickSort | Algoritmo más rápido | Observación |
|---|---|---|---|---|
| 10.001 |0.16077  | 0.35289 |insertion  |  no  hay mucha diferencia entre el Esta casi ordenado y casi ordenado con respecto al tiempo|
| 50.001 | 0.85577 |2.55357  | insertion|  en este caso es mas notable el cambio  de tiempo.|
| 100.001 | 2.27578 |6.59821  |insertion  | igual que al anterior caso la didferencia de tiempo es mucho mas notorio.  |

## Análisis requerido

Después de completar las tablas, se debe responder:

- ¿Qué algoritmo fue más rápido en el escenario desordenado?

El algoritmo mas rapido fue el metodo de quick Sort, pues es notable la variacion de tiempo entre este metodo y el metodo de insertion.
- ¿Qué algoritmo fue más rápido en el escenario casi ordenado?

El algoritmo mas rapido fue el metodo de insertion a comparación  del metodo de ordenamiento quick sort en los tres tamaños de muestra.
- ¿El crecimiento del tamaño de muestra afectó por igual a los dos algoritmos?

No afecto, porque  los tiempos de insertion  se elevaron de forma acelerada en el esenario desordenado, por lo contraio los tiempos de QuickSort tambien  aumentaron, pero más lento.
- ¿Por qué Inserción puede mejorar cuando el arreglo ya está casi ordenado?

Este arreglo  mejora porque  realiza pocos movimientos  para colocar cada elemento en su posición correcta.
- ¿Por qué QuickSort suele ser mejor cuando los datos están muy desordenados?

Por que QuickSort puede dividir el arreglo en partes más pequeñas y las ordena de manera eficiente mediante particiones.

*Nota:* Los resultados, observaciones y análisis deben ser escritos por cada uno con base en su ejecución. No se permite presentar análisis generados por IA.

## Conclusiones

Se debe redactar al menos tres conclusiones propias. Las conclusiones deben estar relacionadas directamente con los tiempos obtenidos.

- Conclusión 1: En conclusion en el escenario desordenado  con el metodo de Ordenamiento QuickSort se registro los tiempos con menor tiempo de ejecución.
- Conclusión 2: En el escenario casi ordenado, el tiempo que se ilustra con el metodo de insertion feuron menores que los de QuickSort
- Conclusión 3: Al aumentar  el tamaño en los escenarios, el tiempo de insertiom creció más rápido que el otro método QuickSort en el escenario desordenado.

*Importante:* Las conclusiones no pueden ser generadas con IA. Deben reflejar su análisis a partir de los resultados reales de la práctica.