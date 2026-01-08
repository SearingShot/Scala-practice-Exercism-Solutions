// Module 1 - Exercise

// prob 1
val age : Int = 24
var mood : String = "happy"

println(s"my age is $age")
println(s"my mood right now is $mood")

//val age = 23


// functions 
val add = (x:Int, y:Int) => x+y
println(add(27,97))

//// anonymous function 
(x:Int,y:Int) => 9*7


// methods
def addMethod(a:Int,b:Int): Int = 
  a+b

println(s"addMethod gives ${addMethod(27,67)}")

//// double parameters list method and multiple expression
def addAndSubtractAndString(a:Int, b:Int)(K:Int) : String = 
  val rem = (a+b)-K
  rem.toString()

println(addAndSubtractAndString(7,4)(5))

def Square(a:Int) : Int = 
  a * a

println(s"square of number 21 is ${Square(21)} ")


// classes
class Animal(name:String, sound:String):
  def greet(family: String) = 
    println(s"${name} Animal of ${family} Family greets everyone with sound of ${sound}")

val t = new Animal("Tiger","Roar!!!!")
t.greet("Cat")

//println(t.name) 
// the name can't be accessed outside the class as its not present in class argument with val declaration, only the ones with val declaration are accessible outside the class
// like for this - class Animal(val name:String, val sound:String):   - it would have been accessible


// case classes 
//// by default the instances of case class are in val, i.e., immutable
//// instances of case classes are compared by their values where as for our normal class, their instances are compared by their references
case class Animal_Case(retest:String)

val animal1 = Animal_Case("Tiger")
val animal2 = Animal_Case("Lion")
val animal3 = Animal_Case("Tiger")


if animal1 == animal2 then
  println(s"our animal1 and animal2 are same animal")
else
  println(s"our animal1 and animal2 are two different animal")

if animal2==animal3 then
  println(s"our animal2 and animal3 are same animal")
else
  println(s"our animal2 and animal3 are two different animal")

if animal1==animal3 then
  println(s"our animal1 and animal3 are same animal")
else
  println(s"our animal1 and animal3 are two different animal")


// Objects 
//// No instance is needed for object by default it is already created, u can just directly access its methods
object singleton:
  def say(greetings:String):Unit =
    println(s"This Singleton Object says ${greetings}")

singleton.say("hello!!!")

object IdFactory:
  private var Counter = 0
  def createId():Int =
    Counter += 1
    Counter

val id1 = IdFactory.createId()
println(s"Id1 is ${id1}")

val id2 = IdFactory.createId()
println(s"Id2 is ${id2}")


// Traits 

trait Greetings:
  def greetings(name:String):Unit  // traits having abstract method

class Man extends Greetings:
  override def greetings(name:String):Unit =
    println(s"${name} Extends his greetings to you!!")

val man = new Man()
man.greetings("Utsav")

trait Greet:
  def greet(name:String): Unit =
    println(s"Hello! ${name}")  // like this traits can have concrete methods as well

class Human extends Greet

val human = Human()
human.greet("Utsav")

//// Multiple traits
trait A:
  def foo():Unit =
    println("This belongs to A")

trait B:
  def foo(): Unit = 
    println("This belongs to B")

class Test extends A,B :
  override def foo(): Unit =
    super[A].foo()

val test = new Test()
test.foo()


// override 
trait Animal1:
  def speak(name: String): Unit =
    println(s"$name makes some sound")

class Tiger1 extends Animal1:
  override def speak(name:String):Unit = // overriding the func of parent class using override keyword
    println(s"${name} makes sound of Roar!!!")

val tiger = Tiger1()
tiger.speak("Tiger")


// overloading
class Calculator:
  def add(a:Int, b:Int):Int =
    a+b
  
  def add(a:Double, b:Double): Double =
    a+b

  def add(a:Int, b:Int, c:Int) : Int =
   a+b+c

val calculator = new Calculator()
println(calculator.add(1,2))
println(calculator.add(1.5,9.5))
println(calculator.add(5,7,7))

//// override methods with different method signature than the one in parent class
trait Peak:
  def peaking(name:String):Unit =
    println(s"peaking name - ${name}")

class Flow extends Peak:
  override def peaking(name:String):Unit = // first override the method
    println(s"flow peaking peak name - ${name}")

  def peaking(name:String, flow:String): String =
    s"${name} has a ${flow} flow!!"       // after overriding, now overload the method

val flow = new Flow()
flow.peaking("Utsav")
println(flow.peaking("Utsav","Smooth"))


// program entry point
@main
def trying(): Unit =
  println("Go Do Something, The Code Should Start From Here")

//// in scala 2 we should do this - 
//////object Main{
//////  def main(args:Array[String]):Unit =
//////    println("or is the main one?")
//////}


