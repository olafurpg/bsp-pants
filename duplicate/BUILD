scala_library(
  name = 'a',
  sources=globs('A.scala'),
  dependencies=['core:core']
)
junit_tests(
    name = 'b',
    sources = globs("B.scala"),
    dependencies = [
        "3rdparty/jvm/junit",
        "3rdparty/jvm/org/scalatest",
        ":a",
    ],
)
