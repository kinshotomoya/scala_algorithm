package AtCoderBegginerContest43

class ChildrenAndCandies {
  def main(args: Array[String]): Unit = {
    val countOfChildren = new java.util.Scanner(System.in).toString.toInt
    val result = for{
      i <- 1 to countOfChildren
    } yield i
    // 以下で良い
    // (1 to countOfChildren).sum
    result.toList.sum
  }

}
