junit_tests(
    sources = "HelloSuite.scala",
    dependencies = [
        "3rdparty/jvm/org/scalatest",
        ":test-deps",
    ],
)

scala_library(
    name = "test-deps",
    sources = "Foobar.scala",
    dependencies = [
        "3rdparty/jvm/org/scala-lang:scala-library",
    ],
)

