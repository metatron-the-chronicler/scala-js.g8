package $packageName$

import scala.scalajs.js
import js.Dynamic.{ global => g }
import scala.scalajs.test.JasmineTest

object $className$Test extends JasmineTest {

  describe("$className$") {

    it("should implement square()") {
      import $className$._

      expect(square(0)).toBe(0)
      expect(square(4)).toBe(16)
      expect(square(-5)).toBe(25)
    }
  }
}
