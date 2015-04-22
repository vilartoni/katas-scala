object PrimeCalculator {
  def generatePrimesUpTo(number: Int): List[Int] = {
    def isPrime(x: Int): Boolean = 2 to x find { x % _ == 0 } equals Some(x)
    (2 to number filter isPrime).toList
  }
}
