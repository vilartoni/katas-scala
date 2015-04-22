import org.scalatest.{Matchers, FlatSpec}

class PrimeCalculatorSpec extends FlatSpec with Matchers {

  it should "generate a list with all prime numbers up to the given number" in {
    PrimeCalculator.generatePrimesUpTo(1) should be (Nil)
    PrimeCalculator.generatePrimesUpTo(2) should be (List(2))
    PrimeCalculator.generatePrimesUpTo(3) should be (List(2, 3))
    PrimeCalculator.generatePrimesUpTo(5) should be (List(2, 3, 5))
    PrimeCalculator.generatePrimesUpTo(15) should be (List(2, 3, 5, 7, 11, 13))
  }
}
