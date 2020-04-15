./coursier launch org.scalameta:metals_2.12:0.8.3+160-b025f2d4-SNAPSHOT \
  -r sonatype:snapshots \
  --main scala.meta.internal.pantsbuild.BloopPants -- \
  create \
  --name amend \
  --intellij src/test::
