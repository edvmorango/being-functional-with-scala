package chaptes.c02_types_and_collections

import scala.util.Try

object Exercises {



  def cashIn(acc: Double, structure: (String, Double)): (String, Double) = ???

  def processOrders(n: Int, clientName: String): (String, Double) = ???

  //-------------------------------------------------------------------------------------

  def evenUpper(a: Char): Char = {
    if('a' >= a && a <= 'z') {
      if(a.toInt % 2 == 0) a.toUpper else a
    } else
        throw new Exception("Input out of range")
  }

  def evenUpperOpt(a: Char): Option[Char] = ???

  def evenUpperTry(a: Char): Try[Char] = ???

  // ---------------------------------------------------------------------------------------




}
