object mergeS  {

  def main(args: Array[String])
  {
  
    def merge(a:List[Int], b:List[Int]):List[Int]=(a,b) match 
    {
      case (Nil , _ ) =>b
      case (_  , Nil) =>a
      case (x::xs,y::ys) =>
        if(x <= y)
        {
           x :: merge(xs,b)
        }
        else
        {
          y :: merge(a,ys)
        }
            
    }
  
  
    def mergesort(list:List[Int]):List[Int] = {
      if(list.length < 2)
      {
        list
      }
      else
      {
        val (first,second)=list.splitAt(list.length/2)
        merge(mergesort(first),mergesort(second))
      }
      
      
    }
    
    val nums = List.fill(10)(util.Random.nextInt(100))
    println(nums.mkString(" , "))
    println(mergesort(nums).mkString(" , "))
  }
}