object NthPrime{
  def prime(n:Int) = {
    var m = n
    m match {
      case num if num==0 => {None}
      case _ => {
        var i = 2
        var prime = 0
        while (m>0) {
          if (isPrime(i)) {
            m = m - 1
            prime = i
          }
          i = i + 1
        }
        Some(prime)
      }
    }
  }

  def isPrime(n:Int) = {
    n match {
      case num if num == 2 => {true}
      case num if num % 2 == 0 => {false}
      case _ => {
        var count = 0
        for (i <- 1 to n/2) {
            if (n%i == 0){
              count = count + 1
            }
        }
        if (count > 1){
            false
          } else {true}
      }
    }
  }
}