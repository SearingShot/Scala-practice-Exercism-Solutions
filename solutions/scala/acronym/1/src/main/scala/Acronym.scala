object Acronym {
  def abbreviate(phrase: String): String = {
    var list = phrase.split("[ -]+").toList
    list.foldLeft("")((runningRes, currEle) => {runningRes+currEle(0).toString.toUpperCase})
  }
}
