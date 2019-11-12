package NinetyNineScalaProblems

object NNP {

  // val list = List('a, 'b, 'c, 'c, 'd)
  // val expected =  List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  def duplicate(list: List[Symbol]): List[Symbol] = {
    list.flatMap(s => List(s, s))
  }

  // val num = 3
  // val list = List('a, 'b, 'c, 'c, 'd)
  // List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  def duplicateN(number: Int, list: List[Symbol]): List[Symbol] = {
    list.flatMap(s => for(_ <- 1 to number) yield s)
  }

  // val num = 3
  // List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
  // List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  def drop(number: Int, list: List[Symbol]): List[Symbol] = {
//    list.filterNot(s => ((list.indexOf(s) + 1) % number) == 0)
    list.zipWithIndex.filterNot(v => (v._2 + 1) % number == 0).map(_._1)
  }
}
