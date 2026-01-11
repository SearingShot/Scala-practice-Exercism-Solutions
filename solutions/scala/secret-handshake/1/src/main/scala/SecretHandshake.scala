object SecretHandshake {
  def commands(n : Int) = {
    var bnum = n.toBinaryString // converting to binary string
    var mymap = Map(
      "00001" -> "wink",
      "00010" -> "double blink",
      "00100" -> "close your eyes",
      "01000" -> "jump"
    )
    
    var l1 = List[String]()
    if (bnum.length < 5) {
      bnum = bnum.reverse.padTo(5, '0').reverse // filling leading 0s in binary string to make it of length 5, padTo is used to add values to the given position
    }

    if (bnum(4).toString == "1") {
      l1 = l1 :+ mymap("00001")
    }
    if (bnum(3).toString=="1") {
      l1 = l1 :+ mymap("00010")
    }
    if (bnum(2).toString=="1") {
      l1 = l1 :+ mymap("00100")
    }
    if (bnum(1).toString=="1") {
      l1 = l1 :+ mymap("01000")
    }
    if (bnum(0).toString=="1") {
      l1 = l1.reverse
    }
    l1
  }
}