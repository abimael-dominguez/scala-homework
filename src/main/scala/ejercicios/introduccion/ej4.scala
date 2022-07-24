package ejercicios.introduccion

/**
 *  Abimael Domínguez Pérez
 * 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
 */

object ej4 extends App {

  def minMax(valores: Array [Int]): (Int, Int) = {
    val my_tuple: (Int, Int) = (valores.min, valores.max)
    my_tuple
  }
  println( minMax( Array(100,2,3,4,5) ) )

}

// output: (2,100)