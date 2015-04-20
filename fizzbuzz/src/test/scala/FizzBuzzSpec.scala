import org.scalatest.{Matchers, FlatSpec}

class FizzBuzzSpec extends FlatSpec with Matchers {

  it should "return FizzBuzz for numbers both divisible by 3 and 5" in {
    FizzBuzz(15) should be ("FizzBuzz")
    FizzBuzz(30) should be ("FizzBuzz")
    FizzBuzz(45) should be ("FizzBuzz")
    FizzBuzz(2250) should be ("FizzBuzz")
  }

  it should "return Fizz for numbers divisible by 3" in {
    FizzBuzz(3) should be ("Fizz")
    FizzBuzz(6) should be ("Fizz")
    FizzBuzz(66) should be ("Fizz")
    FizzBuzz(117) should be ("Fizz")
  }

  it should "return Buzz for numbers divisible by 5" in {
    FizzBuzz(5) should be ("Buzz")
    FizzBuzz(25) should be ("Buzz")
    FizzBuzz(500) should be ("Buzz")
    FizzBuzz(215) should be ("Buzz")
  }

  it should "return the same number for number not divisible neither by 3 nor 5" in {
    FizzBuzz(2) should be ("2")
    FizzBuzz(7) should be ("7")
    FizzBuzz(14) should be ("14")
    FizzBuzz(122) should be ("122")
  }
}
