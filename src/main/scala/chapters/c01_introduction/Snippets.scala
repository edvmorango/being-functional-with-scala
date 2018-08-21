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

// First-class and High-order functions
object Snippet_04 {

  def double(a: Int, fun: Int => Int): Int = fun(a)

  double(2, (a: Int) => 2 * a ) // 4

  def multiplyFor(a: Int): Int => Int = { b: Int =>  a * b}

  val triple = multiplyFor(3)

  triple(2) // 6

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

//Referential transparency
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
  anotherFunction("!QAZ@SX#EDC")
  oneMoreFunction("!QAZ@SX#EDC")

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

//Memoization
object Snippet_08 {


  def doubleSlow(a: Int): Int = {
    Thread.sleep(10000)
    a * 2
  }

  doubleSlow(1) // 2 after 10 seconds
  doubleSlow(1) // 2 after 10 seconds



  def doubleMemoized(a: Int, cache: Map[Int, Int]): (Int, Map[Int, Int]) = {

    val output: Option[Int] = cache.get(a)

    if(output.isDefined) {
      (output.get, cache)
    } else {
      val result = doubleSlow(a)
      val tuple = (a, result)
      (result, memo + tuple )
    }

  }

  val memo: Map[Int, Int] = Map()

  val result: (Int, Map[Int, Int]) = doubleMemoized(1, memo) // 2 after 10 seconds

  doubleMemoized(1, result._2) // 2 fast

}





