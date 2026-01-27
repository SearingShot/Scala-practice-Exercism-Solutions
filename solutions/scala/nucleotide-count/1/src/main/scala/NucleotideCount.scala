import scala.collection.mutable.HashMap
class DNA(val str:String){
  var map = HashMap('A'->0, 'C'->0, 'G' ->0, 'T'->0)
  def nucleotideCounts : Either[Boolean,Map[Char,Int]] = { // Using Either to deal with error case, when nucleotide is not of given types
    var Bool = true 
    for (i <- str){
      if (map.contains(i)){
        map(i) += 1
      } else{ Bool = false}
    }
    // return Either by explicitly wrapping your result in Left or Right
    // type of Left(...) will be the type mentioned in left arg in either and for Right(...), type will be right side argument mentioned in Either
    if (Bool){
      Right(map.toMap) 
    } else {Left(false)}
  }
}