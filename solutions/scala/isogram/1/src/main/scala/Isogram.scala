object Isogram{
  def isIsogram(str : String): Boolean = {
    var str1 : String = str.replace("-","").replace(" ","")
    var s : Set[Char] = str1.toLowerCase.toSet
    s match {
      case s if s.size == str1.toLowerCase.length => true
      case _ => false
    }
  }
}