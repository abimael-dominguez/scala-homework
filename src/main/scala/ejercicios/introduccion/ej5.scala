package ejercicios.introduccion

/**
 *  Abimael Domínguez Pérez
 * 5. Escribe una funcion que reciba una lista de objetos de tipo "Persona" y que al iterar la lista imprima a que tipo de persona
 * corresponde, deben de existir al menos estas tres:
 * Alumno(nombre, edad, materias), Profesor(nombre, edad, departamentoId), Oyente(nombre, edad) y Otro (Director, Suplente).
 */

object ej5 extends App {

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

/*
output:
Abimael es un Alumno
Susana es un Oyente
Juan es un Profesor
Cecilia es un Alumno
 */