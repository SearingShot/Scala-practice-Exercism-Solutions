object BinarySearch{
  def find(a:List[Int],b:Int) = {
    var low = 0
    var high = a.length - 1
    var mid = (high-low)/2  
    if (!(a contains b)){
          None
      } else if (a(mid) == b){
        Some(mid) 
      }
      else{
    while (low <= high){
      mid = low + (high-low)/2
      if (a(mid) == b){
        mid = mid 
        low = high + 1
      }
      else if (b > a(mid)){
            low = mid+1     
      } else if (b < a(mid)){
            high = mid-1
      }
    }
      Some(mid)
    }
  }
}