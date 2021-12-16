import io.StdIn.readLine

@main def main() =
  val numeros = readLine().split(" ").map(_.toInt)

  val a = numeros.sorted.drop(1).dropRight(1)
  println(a.mkString(", "))

  val b = numeros.foldRight(0)((x, y) => x + y)
  println(s"Soma = ${b}")

  val c = numeros.filter(x => x % 2 == 0).length
  println(s"Numeros pares: ${c}")
