package ejercicios.introduccion

/**
 *  Abimael Domínguez Pérez
 *
 * 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
 */

object ej1 extends App {
  val cadena:String = "Hola"
  println(cadena.charAt(0))
  println(cadena.charAt(cadena.length-1))

}

/*
output:
H
a
* */