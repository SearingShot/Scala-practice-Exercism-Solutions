import scala.math.pow

object Darts {

  // distance between two coordinates - dis^2 = (x2 - x1)^2 + (y2 - y1)^2
  
  def score(a:Double,b:Double) : Int = {
    val dis = pow((a*a + b*b), 0.5)
    
    if (dis <=1){
      10
    } else if (dis>1 & dis<=5){
      5
    } else if (dis>5 & dis<=10){
      1
    } else {0}
  }
}