def member(e: Any, lizt: List[Any]): String = {
  if (lizt.isEmpty)
    return "false"
  else if (e.==(lizt.head))
    return "true"
  else
    member (e, lizt.drop(1)) // Drop the first element
}