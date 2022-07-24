package ejercicios.readme

/**
  Abimael DP
  Ejercicio 3:
  Utilizando el concepto de funciones de orden superior implementa un método que pueda recibir un String,
  ejecutar alguna operación con este String (el consumidor establece el comportamiento) y retornar un String,
  en caso de que la ejecución falle se deberá propagar una custom exception llamada HigherOrderFunctionException.
 */

object Ej3 extends App {

  final case class HigherOrderFunctionException(private val message: String = "Intente de nuevo")
    extends Exception(message)

  def selecciona_accion(my_function: String => String, my_string:String): String = {

    try {
      my_function(my_string)
    }

    catch {
      case e: HigherOrderFunctionException => "ERROR: " + e
    }

  }

  /* some custom functions for strings */
  def upper(s: String): String = s.toUpperCase
  def lower(s: String): String = s.toLowerCase

  println(selecciona_accion(upper,"Hola me llamo Abimael"))
  println(selecciona_accion(lower,"HOLA ME LLAMO ABIMAEL"))


}

/*
Output:
HOLA ME LLAMO ABIMAEL
hola me llamo abimael
* */