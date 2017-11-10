object Scala_Playground {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet");$skip(29); 
  
  println("Hello,World!");$skip(11); val res$0 = 
  
  8*5+2;System.out.println("""res0: Int = """ + $show(res$0));$skip(24); val res$1 = 
  "Hello".toUpperCase();System.out.println("""res1: String = """ + $show(res$1));$skip(22); val res$2 = 
  
  "99.44".toDouble;System.out.println("""res2: Double = """ + $show(res$2));$skip(17); val res$3 = 
  
  99.44.toInt;System.out.println("""res3: Int = """ + $show(res$3));$skip(15); val res$4 = 
  
  65.toChar;System.out.println("""res4: Char = """ + $show(res$4));$skip(15); val res$5 = 
  
  'A'.toInt;System.out.println("""res5: Int = """ + $show(res$5));$skip(22); 
  
  val x:BigInt = 9;System.out.println("""x  : BigInt = """ + $show(x ));$skip(19); 
  val y:BigInt = 4;System.out.println("""y  : BigInt = """ + $show(y ));$skip(21); 
  val tuple = x /% y;System.out.println("""tuple  : (scala.math.BigInt, scala.math.BigInt) = """ + $show(tuple ));$skip(27); val res$6 = 
  
  //divident
  tuple._1;System.out.println("""res6: scala.math.BigInt = """ + $show(res$6));$skip(25); val res$7 = 
  //remainder
  tuple._2;System.out.println("""res7: scala.math.BigInt = """ + $show(res$7));$skip(20); val res$8 = 
 
 "Bonjour".sorted;System.out.println("""res8: String = """ + $show(res$8))}
 
}
