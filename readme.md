# Steps to reproduce bug

First, export the Pants build to Bloop:
```
git clone https://github.com/olafurpg/intellij-bsp-pants.git
cd intellij-bsp-pants
./setup-bsp.sh                 # takes a while to complete
bloop compile `bloop projects` # validate that Bloop compilation works
```

Next, import the build into IntelliJ using "bsp".

To reproduce the red highlighting, open `Inner.scala`.
![](https://user-images.githubusercontent.com/1408093/69877060-12b01200-12b9-11ea-99e4-4b45729dfd1a.png)
