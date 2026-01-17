object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = {
    var s = 0
    for (i <- 0 to n){
      s += (i*i)
    }
    s
  }

  def squareOfSum(n: Int): Int = {
    var s = 0
    for (i <- 0 to n){
      s += i
    }
    s*s
  }

  def differenceOfSquares(n: Int): Int = (
    squareOfSum(n)-sumOfSquares(n)
  )
}
