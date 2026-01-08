object ReverseString {
  def reverse(str: String): String = {
    // str.reverse  // inbuilt method

    // or 

    // using for loop to iterate on the string indexes in reverse and yielding them on by one to create a sequence, then converting the sequence to string by using .mkString
    val ru = (for ( i <- str.length - 1 to 0 by -1 ) yield str(i))
    ru.mkString
  }
}
