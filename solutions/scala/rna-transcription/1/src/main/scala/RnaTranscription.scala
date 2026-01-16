object RnaTranscription {
  def toRna(dna : String) = {
    var dict = Map(
      "G" -> "C",
      "C" -> "G",
      "T" -> "A",
      "A" -> "U"
    )
    var rna = ""
    for (i <- dna){
      rna += dict(i.toString)
    }
    Some(rna)
  }
}