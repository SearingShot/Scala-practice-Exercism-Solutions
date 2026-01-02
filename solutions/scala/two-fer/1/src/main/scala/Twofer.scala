object Twofer {
  def twofer(name: String = null): String = 
  if (name != null) then {
    s"One for ${name}, one for me."
  } else {s"One for you, one for me."}
}
