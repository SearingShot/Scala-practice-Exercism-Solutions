import scala.collection.mutable.{ArrayBuffer,Set}

object Sieve {
  def primes(n :Int) = {
    if (n == 1) {
      List[Int]()
    } else {
    var arr = (2 to n).to(ArrayBuffer) // array consisting of all numbers 
    var marked = Set[Int]() // set containing marked composite numbers
    var res = List[Int]() // list containing unmarked prime numbers
    var i = 2
    for (j <- arr){
      if (j != 0){
          i = 2
          while ((i*j)<=n){ // conditions to check multiples with in limits (less than n)
            marked += arr(arr.indexOf(j*i)) // finding index of multiples and adding elements at that index to marked set
            i+=1
          }
        }
    }
    for (k <- arr){
      if (!(marked contains k)){ // condition to check if k is not present in marked set
        res = res :+ k
      }
    }
    res
    }
  } 
}