package foo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MySuite extends FunSuite {
  test("auto-test works") {
    println("Auto-test!")
  }
}
