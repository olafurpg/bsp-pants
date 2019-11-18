# Steps to reproduce bug

First, validate that the Pants build compiles successfully with Bloop
```
git clone https://github.com/olafurpg/intellij-bsp-pants.git
cd intellij-bsp-pants
./setup-bsp.sh                 # takes a while to complete
bloop compile `bloop projects` # validate that Bloop compilation works as expected
```

Next,
* import the build into IntelliJ using "bsp"
* open "Main.scala"
* run the main method
* it fails with 'Error: Could not find or load main class src.Main'
