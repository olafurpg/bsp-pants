jvm_binary(
    name = "example",
    basename = "bsp",
    main = "bsp.Main",
    source = "Main.scala",
    dependencies = [
        ":bsp",
        "src/main/resources/bsp:bsp",
    ],
)


scala_library(
  sources = ["Lib.scala"],
    dependencies = [
        "3rdparty/jvm/org/scala-lang:scala-library"
    ],
)
