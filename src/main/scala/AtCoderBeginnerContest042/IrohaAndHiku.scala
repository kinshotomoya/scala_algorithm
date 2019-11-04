package AtCoderBeginnerContest042

class IrohaAndHiku {
  def main(args: Array[String]): Unit = {
    val input = new java.util.Scanner(System.in)
    // NOTE: readLine.split(" ").map{_.toInt}.toListでかける
    val list = input.toString.split(" ").toList.map(_.toInt)
    // [5, 5, 7]
    // [7, 7, 5]
    def loop(restList: List[Int], acc: List[Int]): Unit = {
      restList match {
        case Nil => println("YES")
        case head :: tail if head == 7 => {
          if(acc.contains(7)) println("NO") else loop(tail, acc :+ head)
        }
        case head :: tail if head == 5 => {
          if(acc.count(x => x == 5) < 2 ) loop(tail, acc :+ head) else println("NO")
        }
        case _ => println("NO")
      }
    }
    loop(list, List.empty)
  }

  def test: Unit = {
    val input = new java.util.Scanner(System.in)
    val Sortedlist = input.toString.split(" ").toList.map(_.toInt).sorted
    // sameElementsで、同じ要素かどうかを確認できる。
    if(Sortedlist.sameElements(List(5, 5, 7))) println("YES") else println("NO")
  }
}
