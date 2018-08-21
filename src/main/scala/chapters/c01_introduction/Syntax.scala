package chapters.c01_introduction



// Val
object Syntax_01 {

  // val is a keyword to constants
  // constName is the constant name
  // : String is the function type
  // "value" is the constant value
  val constName: String = "Value"

  // A constant is a expression
  val expression: Int = {
     val a: Int = 10
     val b: Int = 10
     a + b
   }

  // The compiler have inference capability
  val inference = 10

}

// Var
object Syntax_02 {

  // var is a keyword to variables
  // varName is the variable name
  // : String is the function type
  // "Mutable value" is the variable value
  val varName: String = "Mutable value"

  // A var is a expression
  var expression: Int = {
    val a: Int = 10
    val b: Int = 10
    a + b
  }

  // The compiler have inference capability
  var inference = 10

}

//functions
object Syntax_03 {

  // def is a keyword to a function
  // someFunction is the function name
  // : String is the function return
  // "Return" is the result of the function
  def someFunction(): String = "Return"

  // In scala, a function always return some value
  // A "procedure" in Scala will return a Unit
  def procedure(): Unit = Unit

  // Functions accept parameters
  def funcWithParams(arg: Int, arg2: Int): Int = arg + arg2

  // The compiler can infer functions results too
  def inferFunction(a: Int) = a

  var inference = 10

}