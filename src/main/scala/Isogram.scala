object Isogram extends App {
 def isIsogram(s: String): Boolean = {
   if(s.size == s.distinct.size) true
   else false
 }
  val x = "abecadlo"
 print(isIsogram(x))
}
