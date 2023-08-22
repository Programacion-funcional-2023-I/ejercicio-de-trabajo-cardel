# Fundamentos de programación funcional y concurrente

## Ejercicio de Scala

### Punto 1

Usando la clase Factorial, editar la funcion generarFactoriales de la clase ListaFactoriales para crear una lista de factoriales desde 0 hasta n

```
val objListaFactoriales: ListaFactoriales = new ListaFactoriales()
objListaFactoriales.generarFactoriales(5)
```

Debe retornar

```
List(1,1,2,6,24,120)
```

## Punto 2: Punto 2

Editar la funcion repetirListas de la clase EjercicioListas para crear una lista de listas, cada una de estas son los elementos de la lista inicial repetidos de acuerdo a un valor de entrada mayor o igual 0, en caso de que se ingrese un valor menor a 0 se debe lanzar una excepción. En caso de 0 cada lista interna es una lista vacia.

```
val objEjercicioListas: EjercicioListas = new EjercicioListas()
objEjercicioListas.repetirListas(List(1,2,3),0)
```
Debe retornar
```
List(List(),List(),List())
```
```
val objEjercicioListas: EjercicioListas = new EjercicioListas()
objEjercicioListas.repetirListas(List(1,2,3),3)
```
Debe retornar
```
List(List(1,1,1),List(2,2,2),List(3,3,3))
```

## Punto 3:

Editar la función filtrarListas la cual recibe un string el cual puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual", un número y una lista de enteros, este retorna la lista únicamente los elementos que cumplan la condición, en caso que ninguno cumpla se retorna la lista vacía. Si se ingresa un string diferente a los establecidos se lanza una excepción 


```
val objEjercicioListas: EjercicioListas = new EjercicioListas()
objEjercicioListas.repetirListas(List(1,2,3),0)
```
