package chaptes.c02_types_and_collections

import scala.util.Try


//Bottom type
object Snippet_01 {


  // Compile time error
  // val someNumber: Int = null

  // Null extends everyone under AnyRef
  // new is a keyword to instance new objects
  def throwNull(msg: String): Null = throw new Exception(msg)

  // Compile time error, throwNull breaks the type
  // def throwableInt(a: Int): Int = if (a > 10) a else throwNull("null")


  // Nothing is under every type
  def throwNothing(msg: String): Nothing = throw new Exception(msg)

  // Nothing is a Int and a Exception at same time
  def intOrNothing(a: Int): Int = if (a > 10) a else throwNothing("Nothing")

}

// Tuples
object Snippet_02 {

  // A tuple is a composition of values
  // (Type, Type, ...)
  val tuple: (Int, Int) = (10,10)

  // It's possible compose different types
  val tuple2: (Int, String) = (1, "Tuple")

  // The compiler have the capability of infer the types
  val tupleIntDouble = (10, 10.0)

  // A tuple may have up to 22 elements
  val tuple22 = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22)

  // Compile time error
  //  val tuple23 = (1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23)

  // This way of create tuples is a example of syntax sugar

  // Desugared tuple
  val desugaredTuple = Tuple2("_1", "_2")

  /* Tuples, Collections are examples of types who depends other types to exists
   * ... : IncompleteType[Type, Type2, Type3] = ...
   * And of course, the compiler can help us with that           */
  val explicitTuple: Tuple3[String, Int, Char] =  Tuple3("_1", 2 , '3')

  // The infix syntactic sugar operates normally with the desugared syntax
  val mixedTuple: Tuple3[String, Int, Char] =  ("_1", 2 , '3')

  // The values wrapped in tuples are accessibles
  val t1: String = mixedTuple._1 // "_1"
  val t2 = mixedTuple._2 // 2: Int
  val t3 =  mixedTuple._3 // '3': Char

}

// Syntax sugar
object Snippet_03 {

  /*
  * Programming languages are a wide studies area, one of his topics is about
  * Syntax and Semantics, those concepts exist into a infinitude of study areas,
  * explaining them in a shallow way:
  * While syntax is about "express something"(symbol), semantics is the "something"(content)
  *
  * The same number(content) can be expressed in many forms(symbols): Three, 3, III, ...
  * And of course in certain contexts some symbols express better some ideas, brings
  * the possibility of new operations and sometimes new branches of study.
  *
  * Example: When using "III" we cannot use division, one of the most basic operations
  * is simply useless when we don't use "supported" symbols.
  *
  * Functional programming loves the idea of a declarative syntax. So, in programming(generally)
  * we can change some syntax for other more expressive without change the semantics, the programmers
  * named it "Syntactic sugar", and by using this idea cautiously we can say much more writing less
  *
  * */

  // Example 1: Tuples

  // Semantics  =   "(1,2)"

  //          syntax
  val tuple = Tuple2(1, 2)

  //            syntax
  val tuple2  = (1, 2)

  // Example 2: Instances

  // Semantics = "Some string"

  //                      syntax
  val desugaredInstance = new String("Some string")

  //                    syntax
  val sugaredInstance = "Some string"

  // Many parts of the Scala API and several other programming languages use this artifice.

}

// Total functions
object Snippet_04 {


  // Total function
  def sum(a: Int, b: Int): Int = a + b

  def convertToString(a: Int): String = a.toString

  // Partial function unhandled
  def division(a: Double , b: Double): Double = a / b

  def convertToInt(a: String): Int = a.toInt

  // Partial functions handled

  def divisionHandled(a: Double , b: Double): Double = {
    if(b == 0)
      throw new ArithmeticException("Divisor cannot be 0")
    else
      a / b
  }

  // Partial functions handled
  def convertStringToInt(a: String): Int = {
    val isNumeric = a.forall(_.isDigit)

    if(isNumeric)
      a.toInt
    else
      throw new NumberFormatException("Couldn't format")
  }

  /* But we gotta a problem,
   * we can't handle the exception inside the functions
   * and retain the function generality at same time.
   * Sometimes a failure could be replaced with 0 or -1 or ...
   * If we have various calls of the same function in different parts
   * but at same scope handle differently every case will mess our code.
   * And of course this partial functions will harm the local reasoning and composition
   * in the caller scope, the failures isn't obvious in more complex functions.
   */

  //  runtime error
  //println(convertStringToInt("abc"))
  //  will never be reached
  //println(convertStringToInt("123"))


  // Converting partial functions to total functions

  // Containers/Wrappers (at least for now)

  // Option: contains a value or nothing  -- Some(value) | None
  // Try: contains a value or a exception -- Success(value) | Failure(Exception)


  def divisionTotalOpt(a: Double, b: Double): Option[Double] =
    if(b == 0) None else Some(a/b)

  def divisionTotalTry(a: Double, b: Double): Try[Double] = Try(a/b)

  // We recovered local reasoning, we explicitly know about the possible failures
  // and we can handle them individually with less verbosity, but now, our code
  // will be attached to containers at certain degree

  val div: Option[Double] = divisionTotalOpt(10, 0)

  div.getOrElse(0) // A default value
  //  div.get  -- The unwrapper function, should only be used when the value is filled
  div.isDefined

  val divT: Try[Double] = divisionTotalTry(10, 0)

  divT.isFailure
  divT.isSuccess
  divT.getOrElse(0) // A default value
  //divT.get    -- The unwrapper function, should only be used when the value is filled

}