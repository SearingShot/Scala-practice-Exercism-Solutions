object Raindrops {
  def convert(n: Int): String = {
    var res = ""
    if (n%3 == 0){
      res += "Pling"
    }
    if (n%5 == 0){
      res += "Plang"
    }
    if (n%7 == 0){
      res += "Plong"
    }
    if (n%5!=0 & n%7!=0 & n%3!=0){
      res = s"${n}"
    }
    res
  }
}

