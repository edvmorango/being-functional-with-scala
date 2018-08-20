package chapters.c01_introduction

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random


// Functional Programming(FP) vs Imperative Programming(IP)
object Snippet_01{

  // List
  val namesList: List[String] = List("Eduardo", "Morango")


  var upperList: ListBuffer[String] = new ListBuffer[String]()

  namesList.foreach { e =>
    upperList += e.toUpperCase
  }

  upperList.toList


  namesList.map(e => e.toUpperCase)

  def upperCaseFP(list: List[String]): List[String] = list.map(e => e.toUpperCase)


}


// Expression
object Snippet_02 {

  def fun(a: Int, b: Int): Int = (2 * b) + (1 + a) + (a + b)

}

// Lazy val
object Snippet_03 {

  lazy val two = 1 + 1

  println(two)

}

// High-order functions
object Snippet_04 {

  def double(a: Int): Int = a * 2

  def sum(a: Int, b: Int): Int = a + b

  sum(10, double(5))

  def doubleSum(a: Int, b: Int): Int = double(sum(a, b))

  doubleSum(5, 5)
}



// Closure
object Snippet_05 {

  def someFunction: Unit = {

    val x = 10

    def sumWithX(a: Int): Int = x + a

    sumWithX(5)

  }

}

// Pure Functions

object Snippet_06 {

  def succ(a: Int): Int = a + 1

  succ(1) // 2
  succ(1) // 2
  succ(1) // 2

  def sumWith(a: Int): Int = a + Random.nextInt(10)

  sumWith(1) // 9
  sumWith(1) // 4
  sumWith(1) // 7

  def succImpure(a: Int): Int = {
    println(a) // IO
    a + 1
  }

  succImpure(1) // 2
  succImpure(1) // 2
  succImpure(1) // 2

}

object Snippet_07 {

  def encrypt(password: String): String = {
    // Witchcraft
    // Magic
    // Weirdness
    // Spring-boot annotations
    ???
  }

  def someFunction(encryptedPassword: String): Unit = ???

  def anotherFunction(encryptedPassword: String): Unit = ???

  def oneMoreFunction(encryptedPassword: String): Unit = ???

  encrypt("password123") // !QAZ@SX#EDC
  encrypt("password123") // !QAZ@SX#EDC
  encrypt("password123") // !QAZ@SX#EDC

  someFunction(encrypt("password123"))
  anotherFunction(encrypt("password123"))
  oneMoreFunction(encrypt("password123"))

  someFunction("!QAZ@SX#EDC")
  anotherFunction(encrypt("!QAZ@SX#EDC"))
  oneMoreFunction(encrypt("!QAZ@SX#EDC"))

  encrypt("password123") == "!QAZ@SX#EDC"


  // Black box

  def succ(a: Int): Int = a + 1
  def double(a: Int): Int = a * 2
  def ant(a: Int): Int = a - 1

  def manyOperations(a: Int): Int = {
    val suc = succ(a)
    val doubleSuc = doubleSuc(suc)
    ant(doubleSuc)
  }



}