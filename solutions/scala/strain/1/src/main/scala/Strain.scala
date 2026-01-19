import scala.reflect.ClassTag  // Using ClassTag so that it saves Class of type at runtime
import scala.collection.mutable.ArrayBuffer

// In general JVM erases the runtime class information of generic values, classtags helps us carry the Class of That Type to Runtime
// typetags are different from classtags, as classtags only stores class of the types, where as type tags carry the whole type details to runtime, including their arguments as well
// array of generic type can be created at runtime using classtag, but not with typetag, typetag enables reflection not allocation

object Strain{
  def keep[T:ClassTag](a:Seq[T], b: T => Boolean) :Seq[T] = {
    var arr = ArrayBuffer[T]() // Initializing Empty Array
    for (i <- a){
        if (b(i)) {
            arr += i
        }
    }
    arr.toSeq // List, Vector, Seq are all Sequence
  }
  
  def discard[T:ClassTag](a:Seq[T],b:T => Boolean) : Seq[T] = {
    var arr = ArrayBuffer.empty[T] // Also Initializing Empty Array
    for (i <- a){
        if (!(b(i))) {
            arr += i
        }
    }
    arr.toSeq
  }
}