import scala.collection.mutable.HashMap
class WordCount(str : String){
  def countWords: Map[String, Int] = {
    var map = HashMap[String, Int]()
    // pass

    val reg = "[a-zA-Z0-9]+(?:'[a-zA-Z0-9]+)*".r
    var list = reg.findAllIn(str)  // strings given that are matching regex 
    for (i <- list){
      if (!(map contains i.toLowerCase)){
        map(i.toLowerCase) = 1
      } else {
        map(i.toLowerCase) += 1
      }}
    map.toMap
  }
}