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

  val infered = inferFunction(10)

  // Scala functions accepts default arguments
  def funcWithDefaults(arg1: Int, arg2: Int = 10): Int = arg1 + arg2

  val res1 = funcWithDefaults(10) // 20
  val res2 = funcWithDefaults(10, 20) // 30


}

//ifs
object Syntax_04 {

  // "Ifs" have the same characteristics of any programming language
  if(1 == 1) {
    println("1 equals 1")
  }

  // If the statements have just one line, the brackets can be skipped
  if(1 == 2)
    println("1 equals 2")
  else
    println("1 is not 2")

  // Scala do not have a syntax for ternaries, but they're simply unnecessary
  if(true) println("1 equals 2") else println("1 is not 2")

  /* The relational operators of Scala are:
   == (Equals)
   != (Not equals)
   >  (Greater than)
   <  (Less than)
   >= (Greater or equals than)
   <= (Lesser or equals than)
  */


  /* The logical operators of Scala are:
    && (And)
    || (Or)
    ! (Not)
   */

}

// Loops
object Syntax_05 {

  // Scala supports repetition structures: for, while and do while

  //while
  var a = 0
  while(a < 3){
    println(a)
    a += 1
  }

  //do while
  var b = 3

  do {
    println(b)
    b -= 1
  } while (b != 0)

  // for
  for (x <- 1 to 5){
    println(x)
  }

}

// Executing a application
object Syntax_06 extends App {

  println("If a object extends \"App\", he becomes executable")

}

// Imports


