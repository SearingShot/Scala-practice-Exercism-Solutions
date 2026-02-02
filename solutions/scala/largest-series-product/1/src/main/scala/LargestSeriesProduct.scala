import scala.math._
object Series{
  def largestProduct(n:Int, str: String) ={
    var Max = 0
    var prod = 1

    var Count = 0
    if (isAllDigits(str) & (n<=str.length) & n>0){
    while (Count+n <= str.length){
      for (i <- Count until Count+n){
          prod *= str(i).toString.toInt
      }
      Max = max(Max,prod)
      Count += 1
      prod = 1
    }
    Some(Max)
    } else {
      None
    }
  }

  def isAllDigits(s:String)={
    s.forall(_.isDigit)
  }
}