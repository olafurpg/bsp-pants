./coursier launch \
  org.scalameta:metals_2.12:0.8.0+305-60af6828-SNAPSHOT \
  -r sonatype:snapshots \
  --main scala.meta.internal.pantsbuild.BloopPants -- \
  create --name package-filename --intellij src::
