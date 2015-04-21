import org.scalatest.{Matchers, FlatSpec}

class PrimeFactorsSpec extends FlatSpec with Matchers {

  it should "return a list of the prime factors for the given integer" in {
    PrimeFactors.generateFor(1) should be (List())
    PrimeFactors.generateFor(2) should be (List(2))
    PrimeFactors.generateFor(3) should be (List(3))
    PrimeFactors.generateFor(4) should be (List(2, 2))
    PrimeFactors.generateFor(5) should be (List(5))
    PrimeFactors.generateFor(6) should be (List(2, 3))
    PrimeFactors.generateFor(7) should be (List(7))
    PrimeFactors.generateFor(8) should be (List(2, 2, 2))
    PrimeFactors.generateFor(9) should be (List(3, 3))
    PrimeFactors.generateFor(864) should be (List(2, 2, 2, 2, 2, 3, 3, 3))
  }
}
