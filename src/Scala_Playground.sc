import math._

object Scala_Playground {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  println("Hello,World!")                         //> Hello,World!
  
  8*5+2                                           //> res0: Int = 42
  "Hello".toUpperCase()                           //> res1: String = HELLO
  
  "99.44".toDouble                                //> res2: Double = 99.44
  
  99.44.toInt                                     //> res3: Int = 99
  
  65.toChar                                       //> res4: Char = A
  
  'A'.toInt                                       //> res5: Int = 65
  
  val x:BigInt = 9                                //> x  : scala.math.BigInt = 9
  val y:BigInt = 4                                //> y  : scala.math.BigInt = 4
  val tuple = x /% y                              //> tuple  : (scala.math.BigInt, scala.math.BigInt) = (2,1)
  
  //divident
  tuple._1                                        //> res6: scala.math.BigInt = 2
  //remainder
  tuple._2                                        //> res7: scala.math.BigInt = 1
 
 "Bonjour".sorted                                 //> res8: String = Bjnooru


//3 * 3 * 3 * 3
	pow(3, 4)                                 //> res9: Double = 81.0
	
	sqrt(2)                                   //> res10: Double = 1.4142135623730951
	
	Pi                                        //> res11: Double(3.141592653589793) = 3.141592653589793
}