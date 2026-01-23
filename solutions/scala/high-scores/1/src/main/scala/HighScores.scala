import scala.math._

object HighScores{
  def latest(l:List[Int]) : Int = {
    l(l.length-1)
  }

  def personalBest(l:List[Int]) : Int = {
    l.max
  }

  def personalTop(l:List[Int]) : List[Int] ={
    var s = l.sorted
    s.takeRight(3).reverse
  }

  def report(l:List[Int]) : String = {
    if (l(l.length - 1) == l.max){
      s"Your latest score was ${l(l.length - 1)}. That's your personal best!"
    } else {
      s"Your latest score was ${l(l.length - 1)}. That's ${l.max - l(l.length - 1)} short of your personal best!"
    }
  }
}