import scala.math._
import scala.collection.mutable.ListBuffer

object AllYourBase{
  def rebase(a :Int, list:List[Int], b:Int) = {
      //pass
    if (a > 1 & b >1 & list.forall(a > _ ) & list.forall(_ >= 0)){ // edge cases
      var acc = 0
  
      for (i <- 0 to list.length-1){ 
        acc += list(list.length-(i+1)) * pow(a, i).toInt
      }
  
      var list1 = ListBuffer[Int]()
      var j = 0
      var rem = 0
      var cond = true

      if (acc == 0){
        list1 = ListBuffer(0)
      } else {
      while (acc>0){
        rem = acc % b
        acc = acc/b
        list1 += rem
        rem = 0
        }
      }
      Some(list1.toList.reverse)
    } else {
      None
    }
  }
}