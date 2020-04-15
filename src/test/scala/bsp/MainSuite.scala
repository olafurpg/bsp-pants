package bsp

import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

//@RunWith(classOf[JUnitRunner])
class MainSuite extends org.scalatest.FunSuite {
  test("bsp") {
    println(new Main().greeting)
  }
}
