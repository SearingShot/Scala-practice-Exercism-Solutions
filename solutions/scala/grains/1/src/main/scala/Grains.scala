object Grains{
  def total = {
    var s = BigInt(0)
    var prod = BigInt(1)
    for (i <- 1 to 64){ // running loop to include all 64 blocks
      s = s + prod // adding prod of current block then multiplying by 2 for the next block
      prod = prod * BigInt(2)
    }
    s
  }

  
  def square(n : Int) = {
    var prod = BigInt(1)
    if (n > 64 || n <= 0) {
      None
    } else {
      for (_ <- 1 until n){ // loops work like Iterable in sequence ( which will come after <-) so basically sequence of 1 to n is created, and over that sequence you will be able to iterate
        prod = prod*BigInt(2)
      }
      Some(prod)
    }
  }
}