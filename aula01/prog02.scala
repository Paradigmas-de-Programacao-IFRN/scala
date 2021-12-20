import io.StdIn.readLine

@main def main() =
  val numeros = readLine().split(" ").map(_.toInt)

  val a = numeros.sorted.drop(1).dropRight(1)
  println(a.mkString("[", ", ", "]"))


// [ 5, -2, 103]
  val b = numeros
           .filter(n => n >= 0 && n <= 100)
           .foldRight(0)((x, y) => x + y)  // [21]

  println(s"Soma = ${b}")

  val c = numeros.filter(x => x % 2 == 0).length
  println(s"Numeros pares: ${c}")
