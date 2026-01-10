object CollatzConjecture {
  def steps(n : Int) = {
    var v : Int = n
    var Count: Int = 0
    if (n < 1){
      None
    } else {
    while (v!=1){
      if (v%2 ==0) {
        v = v/2
        Count += 1
      } else {
        v = v*3 + 1
        Count += 1
      }
    }
    Some(Count)
    }
  }
}