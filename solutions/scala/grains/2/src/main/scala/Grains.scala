object Grains{
  // def total = {
  //   var s = BigInt(0)
  //   var prod = BigInt(1)
  //   for (i <- 1 to 64){ // running loop to include all 64 blocks
  //     s = s + prod // adding prod of current block then multiplying by 2 for the next block
  //     prod = prod * BigInt(2)
  //   }
  //   s
  // }

  
  // def square(n : Int) = {
  //   var prod = BigInt(1)
  //   if (n > 64 || n <= 0) {
  //     None
  //   } else {
  //     for (_ <- 1 until n){ // loops work like Iterable in sequence ( which will come after <-) so basically sequence of 1 to n is created, and over that sequence you will be able to iterate
  //       prod = prod*BigInt(2)
  //     }
  //     Some(prod)
  //   }
  // }

  // or 

  // EXPLAINATION - the total number of grains on the chessboard -- AND IT DOUBLES ON each block meaning product of 2 on each block from start, 
  // so it becomes geometric series of 64 blocks which would go like 2^0 + 2^1 + 2^2 + 2^3 + 2^4 + ...... + 2^63 
  
  // which basically becomes 2^64 - 1

  val total = (BigInt(1) << 64) - 1 // geometric formula for sum of n terms is , 2^n = (2)^n - 1
  
  // << shifts the bit of number to the left by given amount, and each shift is equal to multiplying by 2

  def square(n:Int) : Option[BigInt] = {
    n match {
      case num if num>64 || num<1 => {None}
      case _ => { Some( BigInt(1) << (n-1) )} // left shift for n-1 because we need the double of current square in next square not in current one
      // BigInt is done for only 1, because that is the digit whose bits we are left shifting
    }
  }
  
}