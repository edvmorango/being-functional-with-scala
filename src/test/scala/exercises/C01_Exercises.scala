package exercises

import chapters.c01_introduction.Exercises
import org.scalatest.{MustMatchers, WordSpec}


class C01_Exercises extends WordSpec with MustMatchers {

  "Chapter 1" should {


    "2+2 should be 4" in {

      Exercises.sum(2, 2) mustBe 4

    }

    "5! should be 120" in {

//      Exercises.factorial(-...) mustBe -1
      Exercises.factorial(-1) mustBe -1
      Exercises.factorial(0)  mustBe 1
      Exercises.factorial(1)  mustBe 1
      Exercises.factorial(5)  mustBe 120

    }

    "fibonnaci(10) should be 55" in {

//      Exercises.fibonacci(-...) mustBe -1
      Exercises.fibonacci(-1) mustBe -1
      Exercises.fibonacci(0)  mustBe 0

      Exercises.fibonacci(10)  mustBe 55

    }

    "pow(5,2) should be 25" in {

      Exercises.pow(5, -1) mustBe -1
      Exercises.pow(0, 0 ) mustBe 1
      Exercises.pow(5, 0) mustBe 1
      Exercises.pow(5, 2) mustBe 25

    }

    "25 should be multiple 5" in {

      Exercises.multipleNumber(5, 5)  mustBe true
      Exercises.multipleNumber(15, 5) mustBe true
      Exercises.multipleNumber(25, 5) mustBe true

    }

    "10 should't be greather than 11.5" in {


      Exercises.greaterThan(10, 11.5) mustBe false

    }

    "25 should be 10% of 250" in {

      Exercises.percentage(25.5, 250) mustBe 10
      Exercises.percentage(24.7, 250) mustBe 9
      Exercises.percentage(25.4, 250) mustBe 10
      Exercises.percentage(25.0, 250) mustBe 10

    }


    "fullName(\"Tyrion\", \"Lannister\") should be \"Tyrion Lannister\"" in {

      Exercises.fullName("Tyrion", "Lannister") mustBe "Tyrion Lannister"

    }

    "firstLetter(\"I love scala\") should be 'I'" in {

      Exercises.firstLetter("I love scala") mustBe 'I'

    }

    "isUpperCase('a') should be false " in {

      Exercises.isUppercase('a') mustBe false

    }

   "firstLetterIsUppercase(\"scala is nice\") should be false" in {

     Exercises.firstLetterIsUppercase(???, ??? , ??? ) mustBe true

   }


  }






}
