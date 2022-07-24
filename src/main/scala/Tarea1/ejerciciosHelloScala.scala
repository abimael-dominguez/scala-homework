package Tarea1

object ejerciciosHelloScala extends App {

/**
 * Ejercicios Abimael Domínguez Pérez
 *
 * 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
 * 2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
 * Por ejemplo, el producto de todas las cadenas en "Hola" (corrección "Hello") es 9415087488L
 * 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
 * 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
 * 5. Escribe una funcion que reciba una lista de objetos de tipo "Persona" y que al iterar la lista imprima a que tipo de persona
 * corresponde, deben de existir al menos estas tres:
 * Alumno(nombre, edad, materias), Profesor(nombre, edad, departamentoId), Oyente(nombre, edad) y Otro (Director, Suplente).
 *
 */

  // Ejercicio 1
  val cadena:String = "Holas"
  println(cadena.charAt(0))
  println(cadena.charAt(cadena.length-1))

  // Ejercicio 2
  def unicode_product_recursive(s: String): Long = {
    if (s.length == 1)
      s.head.toLong
    else
      s.head.toLong * unicode_product_recursive(s.tail)
  }
  println(unicode_product_recursive("Hello"))

  // Ejercicio 3
  def wordCount(my_string:String): Int = {
    my_string.split(' ').length
  }
  println(wordCount("Hola me llamo Abimael"))

  // Ejercicio 4
  def minMax(valores: Array [Int]): (Int, Int) = {
    val my_tuple: (Int, Int) = (valores.min, valores.max)
    my_tuple
  }
  println( minMax( Array(100,2,3,4,5) ) )

  // Ejercicio 5
  sealed trait Persona
  case class Alumno(nombre: String, edad: Int, materias: String) extends Persona
  case class Profesor(nombre: String, edad: Int, departamentoId: String) extends Persona
  case class Oyente(nombre: String, edad: Int) extends Persona


  val Abimael: Persona = Alumno("Abimael", 33, "Matemáticas, Historia")
  val Susana: Persona = Oyente("Susana", 45)
  val Juan: Persona = Profesor("Juan", 25, "Humanidades")
  val Cecilia: Persona = Alumno("Cecilia", 18, "Biología, Ciencias")
  val arreglo_personas = Array(Abimael, Susana, Juan, Cecilia)

  //println(arreglo_personas.mkString("Array(", ", ", ")"))
  //println(Abimael)

  def printObjectTypes(my_array: Array[Persona]) = {

    def whoIS(x: Persona) = {
      x match {
        case Alumno(nombre, edad, materias) => println(s"$nombre es un Alumno")
        case Profesor(nombre, edad, departamentoId) => println(s"$nombre es un Profesor")
        case Oyente(nombre, edad) => println(s"$nombre es un Oyente")
        case _ => "No existe"
      }
    }

    for {
      my_object <- my_array
    } whoIS(my_object)
  }
  printObjectTypes(arreglo_personas)

}

/** Output: **/

/*
H
s
9415087488
4
(2,100)
Abimael es un Alumno
Susana es un Oyente
Juan es un Profesor
Cecilia es un Alumno
*/
