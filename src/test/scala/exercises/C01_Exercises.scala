package exercises

import chapters.c01_introduction.Exercises
import org.scalatest.{MustMatchers, WordSpec}


class C01_Exercises extends WordSpec with MustMatchers {

  "Chapter 1" should {


    "2+2 should be 4" in {

      Exercises.sum(2, 2) mustBe 4

    }






  }






}
