package b

class B extends org.scalatest.FunSuite {
  test("foo") {
    println("FOO")
    println(new a.A())
  }
  test("bar") {
    println("BAR")
    println(new a.A())
  }
}
