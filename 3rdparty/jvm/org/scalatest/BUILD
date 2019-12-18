SCALATEST_REV = "3.0.8"

jar_library(
    jars = [
        scala_jar(
            org = "org.scalatest",
            name = "scalatest",
            rev = SCALATEST_REV,
            excludes = [
                exclude(org = "org.scala-lang"),
            ],
        ),
    ],
    dependencies = [
        "3rdparty/jvm/org/scala-lang:scala-library",
        "3rdparty/jvm/org/scala-lang:scala-reflect",
    ],
)
