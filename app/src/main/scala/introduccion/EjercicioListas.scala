package introduccion

import javax.naming.OperationNotSupportedException

class EjercicioListas {
  /*
  * Punto 2 repetir lista
  * @param lista Lista a repetir
  * @param n Número de veces a repetir la lista
  * @return Lista repetida n veces
  * @example repetirLista(List(1, 2, 3), 2) = List(List(1,1),List(2,2),List(3,3))
  * @throws IllegalArgumentException si n es negativo
  */
  def repetirListas(lista: List[Int], n: Int): List[List[Int]] = {
    var listaRepetida : List[List[Int]] = List()
    //Complete el código
    if (n>=0) {
      var listaInterna = List()
      for (elm <- lista) {
        var listaInterna: List[Int] = List()
        for (i <- 1 to n) {
          listaInterna = listaInterna :+ elm
        }
        listaRepetida = listaRepetida :+ listaInterna
      }
      return listaRepetida
    }
    else {
      throw new IllegalArgumentException("n debe ser positivo")
    }

  }
  /*
  * Punto 3: Filtrar listas
  * @param criterioIn Criterio de filtrado que puede ser "mayor", "menor", "mayoroigual", "igual", "diferente" o "menoroigual"
  * @param n Número a comparar
  * @param lista Lista a filtrar
  * @return Lista filtrada de acuerdo al criterio y n
  * @throws IllegalArgumentException si el criterio no es uno de los valores válidos
  */

  def filtrarListas(criterioIn: String, n: Int, lista: List[Int]) : List[Int] = {
    var criterio : String = criterioIn.toLowerCase()
    var listaFiltrada : List[Int] = List()
    //Complete el código
    var funcion = (x:Int, y:Int) => x>y

    if (criterio == "menor") {
      funcion = (x: Int, y: Int) => x<y
    }
    else {
      if (criterio == "mayoroigual") {
        funcion = (x: Int, y: Int) => x>=y
      }
      else {
         if (criterio == "menoroigual") {
            funcion = (x: Int, y: Int) => x<=y
          }
          else {
            if (criterio == "igual") {
              funcion = (x: Int, y: Int) => x==y
            }
            else {
              if (criterio == "diferente") {
                funcion = (x: Int, y: Int) => x!=y
              }
              else {
                if (criterio == "mayor") {
                  funcion = (x: Int, y: Int) => x>y
                }
                else {
                  throw new IllegalArgumentException("El criterio no es válido")
                }
              }
            }
         }
      }
    }

    for (elm <- lista) {
      if (funcion(elm, n)) {
        listaFiltrada = listaFiltrada :+ elm
      }
    }

    return listaFiltrada

  }
}
