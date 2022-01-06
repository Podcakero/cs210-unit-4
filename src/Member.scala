object Member extends App {

  val numbers = List(1, 2, 3, 4, 5)
  println("0 exists in [1, 2, 3, 4, 5]: " + member(0, numbers))
  println("7 exists in [1, 2, 3, 4, 5]: " + member(7, numbers))

  def member(e: Any, lizt: List[Any]): String = {
    if (lizt.isEmpty)
      return "false"
    else if (e.==(lizt.head))
      return "true"
    else
      member (e, lizt.drop(1)) // Drop the first element
  }
}