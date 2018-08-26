package chaptes.c02_types_and_collections


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

// Tuples and Syntax sugar
object Snippet_02 extends App{

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
    ... : IncompleteType[Type, Type2, Type3] = ...
    And of course, the compiler can help us with that           */
  val explicitTuple: Tuple3[String, Int, Char] =  Tuple3("_1", 2 , '3')

  // The infix syntactic sugar operates normally with the desugared syntax
  val mixedTuple: Tuple3[String, Int, Char] =  ("_1", 2 , '3')

  // The values wrapped in tuples are accessibles
  val t1: String = mixedTuple._1 // "_1"
  val t2 = mixedTuple._2 // 2: Int
  val t3 =  mixedTuple._3 // '3': Char

}


