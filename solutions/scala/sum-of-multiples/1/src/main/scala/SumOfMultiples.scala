import scala.collection.mutable

object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    var unqSet = mutable.Set[Int]()
    var Sum = 0
    for (i <- factors) {
      if (i < limit) {
      var j = 0
      while (i*j < limit){
          unqSet += i*j
          j+=1
      }
      }
    }
    for (i <- unqSet){
      Sum += i
    } 
    Sum
  }
}

