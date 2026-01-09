import scala.math.pow // for exponents, only pow is used in scala, it doesn't have any ** operator - pow(base,exponent)

object ArmstrongNumbers {
  def isArmstrongNumber(n : Int) : Boolean = {
    var strn = n.toString()
    var Summ = 0
    for (i <- strn) {
      Summ += pow(i.toString.toInt,strn.length).toInt // looping on a string gives char (datatype of i or letter)
    }
    Summ == n
  }
}

// char and String are two separate data types, applying toInt on char will give its ascii code, whereas toInt on string will give its number value. char is represented by '' (single quotes)