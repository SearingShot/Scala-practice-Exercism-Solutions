class Triangle(val a: Float, val b: Float, val c: Float) {
  // we can give parameterless functions using def :- def funcname = { func body }
  def isTriangle = {
    if (a>0 || b>0 || c>0){
      if (a+b >= c & a+c >= b & b+c >= a) {
        true
      } else {false}
    } else {false}
  }
  
  def equilateral = {
    if (isTriangle & a==b & a==c & b==c){
      true
    } else {
      false
    }
  }

  def isosceles = {
    if (isTriangle & (a==b || b==c || a==c)){
      true
    } else {
      false
    }
  }

  def scalene = {
    if (isTriangle & a!=b & a!=c & b!=c ){
      true
    } else {
      false
    }
  }
}