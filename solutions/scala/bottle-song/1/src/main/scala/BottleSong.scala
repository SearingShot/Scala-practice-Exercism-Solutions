object BottleSong:

  def recite(a: Int, b: Int): String = {

    val map = Map(0 -> "no", 1 -> "one", 2 -> "two", 3-> "three",4->"four",5->"five",6->"six",7->"seven",8->"eight",9->"nine", 10->"ten")
    val map1 = Map(1 -> "bottle")
    var str = ""
    for (i <- 0 until b){
      if (i == b-1){
      str += s"""${map(a-i).capitalize} green ${map1.getOrElse(a-i,"bottles")} hanging on the wall,
                |${map(a-i).capitalize} green ${map1.getOrElse(a-i,"bottles")} hanging on the wall,
                |And if one green bottle should accidentally fall,
                |There'll be ${map(a-i-1)} green ${map1.getOrElse(a-i-1,"bottles")} hanging on the wall.
                """
      } else {
      str += s"""|${map(a-i).capitalize} green ${map1.getOrElse(a-i,"bottles")} hanging on the wall,
                 |${map(a-i).capitalize} green ${map1.getOrElse(a-i,"bottles")} hanging on the wall,
                 |And if one green bottle should accidentally fall,
                 |There'll be ${map(a-i-1)} green ${map1.getOrElse(a-i-1,"bottles")} hanging on the wall.\n\n"""
      }
    }
    str.stripMargin.trim + "\n"
  }

