package ejercicios.readme

object Ej1 extends App {

  /**
   *
    Ejercicio 1:

    Cierta persona encargada del cifrado de caracteres requiere de un programa que le permita pasar una vocal a otro carácter, las correspondencias son las siguientes:

    a = L
    e = 9
    i = $
    o = R
    u = 4

    Ejercicio: Implementa la lógica correspondiente para que la persona pueda terminar su día laboral.

    def encryptVowel(vowelsList: List[Char]): List[Char] = ???

    NOTA: La persona tiene estrictamente prohibido realizar la correspondencia a través de sentencias match,
    case o if puesto que estaría violando su contrato. No hagas que pierda su empleo :(

    Ejemplo de entrada y salida:

    encryptVowel(List('a', 'i', 'e', 'a')) => List(L, $, 9, L)
    encryptVowel(List('a')) => List(L)
    encryptVowel(List('i', 'e')) => List($, 9)
   * */

  def encryptVowel(vowelsList: List[Char]): List[Char] = {
    val diccionario = Map('a' -> 'L', 'e' -> 9, 'i' -> '$', 'd' -> 4, 'u' -> 4)
    List(vowelsList.map(diccionario).mkString).flatten
  }
  println(encryptVowel(List('a', 'i', 'e', 'a')))
  println(encryptVowel(List('a')))
  println(encryptVowel(List('i', 'e')))

}
