import scala.collection.mutable.{Map,ArrayBuffer}

object Anagram{
  def findAnagrams(a:String, b:List[String]):List[String] = {
    var arr = ArrayBuffer[String]()
    for (i <- b){
      if (isAnagram(a,i)){
        arr += i
      }
    }
    arr.toList
  }

  def isAnagram(a:String,i:String): Boolean = {
    var map = Map[String,Int]()
    
    for (k <- a){
      if (map.keys.toList contains (k.toString).toLowerCase()){
        map((k.toString).toLowerCase()) += 1
      } else {
      map((k.toString).toLowerCase()) = 1
      }
    }
    if (i.length != a.length){
        false
    } else {
      var Condi = true
      for (j <- i){
        if (map.keys.toList contains j.toString.toLowerCase()){
          map(j.toString.toLowerCase()) -= 1
        } else {
          Condi = false 
        }
      }
      if (!(Condi) || (a.toLowerCase() == i.toLowerCase())){ // Checking for words themselves and extra letters in words
        false
      }  else if ((map.values.forall(_ == 0))){ // Checking if all values in map have become 0
        true
      } else {
        false
      }
    }  
  }
}