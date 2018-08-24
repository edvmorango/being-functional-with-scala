package chaptes.c02_types_and_collections


//Bottom type
object Snippet_01 extends App{


  // Compile time error
  // val someNumber: Int = null

  // Null extends everyone under AnyRef
  def throwNull(msg: String): Null = throw new Exception(msg)

  // Compile time error, throwNull breaks the type
  // def throwableInt(a: Int): Int = if (a > 10) a else throwNull("null")


  // Nothing is under every type
  def throwNothing(msg: String): Nothing = throw new Exception(msg)

  // Nothing is a Int and a Exception at same time
  def intOrNothing(a: Int): Int = if (a > 10) a else throwNothing("Nothing")




}
