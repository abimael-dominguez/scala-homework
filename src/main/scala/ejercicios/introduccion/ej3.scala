package ejercicios.introduccion
/**
 *  Abimael Domínguez Pérez
 * 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
 */

object ej3 extends App {

  def wordCount(my_string:String): Int = {
      my_string.split(' ').length
    }
    println(wordCount("Hola me llamo Abimael"))
}

// output: 4