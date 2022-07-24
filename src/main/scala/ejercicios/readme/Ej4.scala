package ejercicios.readme

object Ej4 extends App {

  /**
  Ejercicio 4:

    El triángulo de Pascal es una representación de los coeficientes binomiales ordenados en forma de triángulo.
    Es llamado así en honor al filósofo y matemático francés Blaise Pascal.
    Te mostramos una representación del triángulo de Pascal:

                   1

                 1    1

              1    2    1

           1    3    3    1

       1     4     6     4     1

    1     5    10    10     5     1
    ...

  Este triángulo puede crecer en renglones tanto como nosotros queramos
  (o la memoria de la computadora lo permita), te explicamos brevemente su funcionamiento:

  El renglón 1 del triángulo contiene los elementos [1]
  El renglón 2 del triángulo contiene los elementos [1, 1]
  El renglón 3 del triángulo contiene los elementos [1, 2, 1]
    Nótese que el dos es la suma de los dos elementos que tiene encima de él en el renglón pasado [1, 1] -> 1 + 1 = 2
  El renglón 4 del triángulo contiene los elementos [1, 3, 3, 1]
    Nótese que el primer tres resaltado en negritas [1, 3, 3, 1] es la suma de los elementos que tiene encima de él en el triángulo [1,2,1] -> 1 + 2 = 3
    Nótese que el segundo tres resaltado en negritas [1, 3, 3, 1] es la suma de los elementos que tiene encima de él en el triángulo [1,2,1] -> 2 + 1 = 3

  Podemos seguir la iteración hasta el renglón que queramos y el comportamiento será el mismo
  (Nota que el primer elemento y el último de todos los renglones es 1)

  No consideramos como válido el renglón cero o negativos.
  El renglón N del triángulo de Pascal está definido por el renglón N-1 del mismo triángulo que a su vez está definido por el renglón N-2.

  Ejercicio: Implementa una solución recursiva para obtener el renglón N del triángulo.
  Utiliza la siguiente firma como base para tu ejercicio.

  def pascalTriangle(rowNumber: Int): List[Int] = ???

  En caso de entrar en un flujo no permitido deberá propagarse una custom Exception llamada PascalRowException

  Ejemplo de uso y salida:
    pascalTriangle(-1) => PascalRowException
    pascalTriangle(0) => PascalRowException
    pascalTriangle(1) => List(1)
    pascalTriangle(2) => List(1,1)
    pascalTriangle(3) => List(1,2,1)
    pascalTriangle(4) => List(1,3,3,1)

  * */

}
