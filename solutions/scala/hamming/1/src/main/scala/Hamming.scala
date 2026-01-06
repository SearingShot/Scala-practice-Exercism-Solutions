object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {
    var c = 0
    val l1 = dnaStrandOne.length() // length of string
    val l2 = dnaStrandTwo.length()
    if (l1==l2) {
        dnaStrandOne.lazyZip(dnaStrandTwo).map((i,j) => {
          // using lazyzip to combine characters of both two strings then using function which maps those zipped characters pairs to match the condition given in the function and then increase the length of hamming distance by 1 if condition matches
          if (i!=j) then {c+=1}
        })
        Some(c)
      }
      else {None}
  }
}
