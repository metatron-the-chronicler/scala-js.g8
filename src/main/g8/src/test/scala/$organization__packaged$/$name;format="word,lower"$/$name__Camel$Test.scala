package $organization$.$name;format="word,lower"$

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.test.JasmineTest

object $name;format="Camel"$Test extends JasmineTest {

  describe("$name;format="Camel"$") {

    it("should implement square()") {
      import $name;format="Camel"$._

      expect(square(0)).toBe(0)
      expect(square(4)).toBe(16)
      expect(square(-5)).toBe(25)
    }
  }
}
