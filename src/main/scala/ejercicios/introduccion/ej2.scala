package ejercicios.introduccion
/**
 * Abimael Domínguez Pérez
 * 2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
 * Por ejemplo, el producto de todas las cadenas en "Hello" es 9415087488L
 */

object ej2 extends App {

  def unicode_product_recursive(s: String): Long = {
    if (s.length == 1)
      s.head.toLong
    else
      s.head.toLong * unicode_product_recursive(s.tail)
  }
  println(unicode_product_recursive("Hello"))
}

/*
output: 9415087488
 */