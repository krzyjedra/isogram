import org.scalatest._
import flatspec._
import matchers._

class IsogramSpec extends AnyFlatSpec with should.Matchers {

  import Isogram._

  "isIsogram" should "be false when there is repeating letter in a word" in {
    isIsogram("paralelizm") shouldBe false
  }

  it should "be true when there is no repeating letter in a word" in {
    isIsogram("egzamin") shouldBe true
  }

  it should "be true when we have no word" in {
    isIsogram("") shouldBe true
  }
}
