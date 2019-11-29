# Steps to reproduce bug

First, export the Pants build to Bloop:
```
git clone https://github.com/olafurpg/intellij-bsp-pants.git
cd intellij-bsp-pants
./setup-bsp.sh                 # takes a while to complete
bloop compile `bloop projects` # validate that Bloop compilation works
```

Next, import the build into IntelliJ using "bsp".
