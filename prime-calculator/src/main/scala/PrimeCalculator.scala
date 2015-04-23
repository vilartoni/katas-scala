object PrimeCalculator {
  def generatePrimesUpTo(number: Int): List[Int] = {
    def isPrime(x: Int): Boolean = 2 until x forall { x % _ != 0 }
    (2 to number filter isPrime).toList
  }
}
