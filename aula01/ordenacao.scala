import scala.util.Random

@main def main() = 
  val lista = List(3, 7, 1, 9, 2)
  val lista3 = 4 :: lista
  println(lista.sorted)
  val lista2 = lista.sortBy(a => Random.nextInt())
  println(lista2)


 // println(pessoas.sortBy(p => p.idade))
  println(lista.sortWith((a, b) => a > b))
  