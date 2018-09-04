package exercisess

import chaptes.c02_types_and_collections.Exercises
import org.scalatest.{MustMatchers, WordSpec}

import scala.util.{Failure, Success}

class C02A_Exercises extends WordSpec with MustMatchers {


  "Chapter 02 A" should {


    "Should cashIn 5 splits of R$ 20.0 to  'Hughs' " in {


      Exercises.processOrders(5, "Hughs") mustBe ("Hughs", 100.0)


    }

    "Should return optional uppercase char when his ascii code is even" in {
      val xd = Exercises.evenUpperOpt('a')

      Exercises.evenUpperOpt('a') mustBe Some('a')

      Exercises.evenUpperOpt('b') mustBe Some('B')

      Exercises.evenUpperOpt('A') mustBe None

    }


    "Should return uppercase char wrapped in Try when his ascii code is even" in {

      Exercises.evenUpperTry('a') mustBe Success('a')
      Exercises.evenUpperTry('b') mustBe Success('B')

      Exercises.evenUpperTry('d').isSuccess mustBe true

      Exercises.evenUpperTry('A').isFailure mustBe true

    }



  }

}
