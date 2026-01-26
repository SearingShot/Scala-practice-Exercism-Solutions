import scala.collection.mutable.ListBuffer

object FlattenArray{
  var list = ListBuffer[Int]() 
  
  def flatten1(l:List[Any]):Unit = {
    for (i <- l){ // flattening the nested lists by adding their elements in a global list
      i match {
        case null => ()
        case i:Int => list+=i
        case i:List[Any] => flatten1(i) // Calling recursion
      }
    }
  }

  def flatten(l:List[Any]) : List[Int] = {
    if (!(list.isEmpty) ){
      list.clear // Clearing the buffer cache
    }
    flatten1(l)
    list.toList
  }
}