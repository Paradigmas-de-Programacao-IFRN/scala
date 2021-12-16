import io.StdIn.readInt

@main def main() =
  val a, b = readInt()
  val maior = if a > b then a else b
  val x = println(maior)
