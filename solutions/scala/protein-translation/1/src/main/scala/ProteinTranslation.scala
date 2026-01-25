import scala.collection.mutable.ArrayBuffer
object ProteinTranslation{
  var map = Map("AUG" -> "Methionine", 
                "UUU"  -> "Phenylalanine",
                "UUC" -> "Phenylalanine",
                "UUA" -> "Leucine",
                "UUG" -> "Leucine",
                "UCU"  -> "Serine",
                "UCC"  -> "Serine",
                "UCA"  -> "Serine",
                "UCG" -> "Serine",
               "UAU" -> "Tyrosine",
               "UAC" -> "Tyrosine",
               "UGU" -> "Cysteine",
               "UGC" -> "Cysteine",
               "UGG" -> "Tryptophan")
  
  def proteins(s:String) = {
    var str1 = ""
    var t = ArrayBuffer[String]()
    var Count = 0
    var Cond = true
    while (Cond){
      str1 = s.slice(Count,Count+3).toString
      if ((List("UAA","UAG","UGA") contains str1) || (Count >= s.length)){
        Cond = false
      } else {
      t += map(str1)
      Count += 3
      }
    }
    t.toSeq
  }
}