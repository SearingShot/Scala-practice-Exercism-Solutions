import scala.collection.mutable.ArrayBuffer
object Pangrams {
  def isPangram(input: String): Boolean = {
    val reg = List('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
    var const : ArrayBuffer[Boolean] = ArrayBuffer[Boolean]()
    for (i <- reg){
      i match {
        case i if input.toLowerCase contains i.toString.toLowerCase => const += true
        case _ => const += false
      }
    }
    !(const contains false)
  }
}

