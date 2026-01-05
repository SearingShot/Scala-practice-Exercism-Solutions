import scala.collection.mutable

class School {
  type DB = mutable.Map[Int, Seq[String]]
  var DB : DB = mutable.Map.empty

  def add(name: String, g: Int) = {
    // we can add multiple elements using ++ and single using +
    if (DB contains g) {
      DB(g) = DB(g) :+ name  // for appending :+ and for prepending +: or :: and for adding two lists ::: or ++
    } else {
      DB(g) = Seq(name)
    }
  }

  def db: DB = {
    DB
  }

  def grade(g: Int): Seq[String] = {
    if (!(DB contains g)){
      Seq()
    }else{
    DB(g)
    }
  }

  def sorted: DB = { // will iterate over keys, otherwise i will take both keys and values in loop
    for (i <- DB.keys) {  // for iterating over a sequence or list we use "ele <- lists" , for range we use: "firstval <- to(exclusive) lastval", "firstval <- until(inclusive) lastval", "firstval <- to lastval by skipstep(skipping indexes)"   
      var l1 = mutable.ArrayBuffer.from(DB(i)) // using ArrayBuffer as mutable sequence 
      // from - creates a new collection of this type, using the elements of another collection
      l1.sortInPlace()
      DB(i) = l1.toSeq  // converting array buffer to sequence
    }
    mutable.TreeMap(DB.toSeq*) // sorting treemap by key - DB.toSeq:_* 
  }
}

// dictionary uses -> for key values, for loop uses <- for iterating

