package caseobjtest

class Book

object Book:
  case class TitledBook(title: String) extends Book
  case object AnonymousBook extends Book
  case object UnwrittenBook extends Book

  @main
  def write =
    val bk = TitledBook("The Jungle Book")
    val anon = AnonymousBook
    val unwb = UnwrittenBook

    println(s"bk: $bk")
    println(s"anon: $anon")
    println(s"unwb: $unwb")
