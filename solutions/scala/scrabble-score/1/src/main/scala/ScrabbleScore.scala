object ScrabbleScore{
  def score(s:String) = {
    var map1 = List("a","e","i","o","u","l","n","r","s","t")
    var map2 = List("d","g")
    var map3 = List("b","c","m","p")
    var map4 = List("f","h","v","w","y")
    var map5 = List("k")
    var map6 = List("j","x")
    var map7 = List("q","z")
    var dict : Map[List[String],Int] = Map( map1 -> 1, map2 -> 2, map3 -> 3, map4 -> 4, map5 -> 5,  map6 -> 8, map7 ->10)
    var sum1 = 0
    for (i<-s){
      if(map1 contains i.toString.toLowerCase){
        sum1 += dict(map1)
      } else if(map2 contains i.toString.toLowerCase){
        sum1 += dict(map2)
      } else if(map3 contains i.toString.toLowerCase){
        sum1 += dict(map3)
      } else if(map4 contains i.toString.toLowerCase){
        sum1 += dict(map4)
      } else if(map5 contains i.toString.toLowerCase){
        sum1 += dict(map5)
      } else if(map6 contains i.toString.toLowerCase){
        sum1 += dict(map6)
      } else {sum1 += dict(map7)}
    }
    sum1
  }
}