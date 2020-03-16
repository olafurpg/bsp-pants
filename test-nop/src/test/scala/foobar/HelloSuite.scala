package foobar

import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloSuite extends org.scalatest.FunSuite with Foobar {
  test("hello") {
    println("HELLO!")
  }
}
