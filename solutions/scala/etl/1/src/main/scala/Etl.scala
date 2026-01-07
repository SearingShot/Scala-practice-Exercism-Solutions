import scala.collection.mutable.SortedMap

object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    val mapper = SortedMap[String,Int]() // initializing empty sorted Map
    val great = scoreMap.map((a,b) => for (i <- b) {mapper(i.toLowerCase())=a})
    mapper.toMap
  }
}
