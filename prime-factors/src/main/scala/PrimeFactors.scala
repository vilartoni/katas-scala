import scala.annotation.tailrec

object PrimeFactors {
  def generateFor(number: Int): List[Int] = {

    @tailrec
    def generate(n: Int, lastCandidate: Int, list: List[Int]): List[Int] = {
      lastCandidate to number find { n % _ == 0 } match {
        case None => list
        case Some(candidate) => generate(n / candidate, candidate, list :+ candidate)
      }
    }

    generate(number, 2, Nil)
  }
}
