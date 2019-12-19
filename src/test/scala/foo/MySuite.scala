package foo

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MySuite extends FunSuite {
  test("user-dir") {
    println(s"Working directory: ${System.getProperty("user.dir")}")
  }
}
