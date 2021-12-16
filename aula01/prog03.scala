import io.StdIn.readLine

case class Musica (nome: String, ano: Int, artista: String, duração: Double):
  override def toString =
    s"${nome}\t${ano}\t${artista}\t${duração.formatted("%.2f")}"

case class PlayList(titulo: String, musicas: List[Musica] = List()):
  def inserir(musica: Musica): PlayList = this.copy(musicas = musica :: musicas)
  def remover(musica: Musica): PlayList = this.copy(musicas = musicas.diff(List(musica)))
  def ordenar(criterio: (Musica, Musica) => Boolean) = musicas.sortWith(criterio)
  def tempoTotal = musicas.map(m => m.duração).foldRight(0.0)((a, b) => a + b)

@main def main() =
  val m1 = Musica("Let it be", 1970, "The Beatles", 3.14)
  val m2 = Musica("Rocketman", 1975, "Elton John", 3.59)
  val p1 = PlayList("Minhas Favoritas")
             .inserir(m1)
             .inserir(m2)

  println("Musicas ordenadas por ano: ")
  println(p1.ordenar((a,b) => a.ano < b.ano).mkString("\n"))
  println("Musicas em ordem alfabética: ")
  println(p1.ordenar((a,b) => a.nome < b.nome).mkString("\n"))

  val p2 = p1.remover(m2)
  println(s"Musicas:\n${p2}")
