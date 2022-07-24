package ejercicios.readme

object Ej2 extends App {

/**
  Abimael DP

  Ejercicio 2:
    Una hamburguesería famosa tiene un sistema que le permite establecer un ingrediente principal en un producto
    y generar N subproductos basados en el primero, por ejemplo:

  Establecer el ingrediente carne para una hamburguesa
    Crear una hamburguesa de carne con queso
    Crear una hamburguesa de carne con cebolla
    Crear una hamburguesa de carne con cebolla, queso y pepinillo

  Establecer el ingrediente champiñón para una hamburguesa
    Crear una hamburguesa de champiñones y queso
    Crear una hamburguesa de champiñones, queso y papas

  Ejercicio: Utilizando el concepto de funciones de orden superior implementa un método que dé soporte al flujo previamente descrito.
  Nota: Considera los ingredientes con un tipo de dato String
*/


  def recipeBuilder(product: String): (String, List[String]) => String = {

    (main_ingredient: String, auxiliar_ingredients: List[String]) =>
      List(main_ingredient)
        .flatMap(
          main_ingredient_ => auxiliar_ingredients.map(
            aux_ingredient => s"Crear una $product de $main_ingredient_ con $aux_ingredient"
          )
        ).toString
  }

  val product = "Hamburguesa"
  def getRecipes = recipeBuilder(product)
  val main_ingredient = "carne"
  val auxiliar_ingredients = List("cebolla", "queso", "queso y pepinillo")
  val my_recipes = getRecipes(main_ingredient, auxiliar_ingredients)
  println(my_recipes)

  val product_2 = "Hamburguesa"
  def getRecipes_2 = recipeBuilder(product)
  val main_ingredient_2 = "champiñones"
  val auxiliar_ingredients_ = List("queso", "queso y papas")
  val my_recipes_2 = getRecipes_2(main_ingredient_2, auxiliar_ingredients_)
  println(my_recipes_2)

}


/*
Output:
List(Crear una Hamburguesa de carne con cebolla, Crear una Hamburguesa de carne con queso, Crear una Hamburguesa de carne con queso y pepinillo)
List(Crear una Hamburguesa de champiñones con queso, Crear una Hamburguesa de champiñones con queso y papas)
 */