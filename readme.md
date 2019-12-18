# Steps to reproduce bug

First, export the Pants build to Bloop:
```
git clone https://github.com/olafurpg/intellij-bsp-pants.git
cd intellij-bsp-pants
./setup-bsp.sh                 # takes a while to complete
bloop compile `bloop projects` # validate that Bloop compilation works
```

Next, import the build into IntelliJ using "bsp".

## Testing from terminal

```
$ bloop test src/test/scala/foo:foo
MySuite:
Auto-test!
- auto-test works
Execution took 12ms
1 tests, 1 passed
All tests in foo.MySuite passed

===============================================
Total duration: 12ms
All 1 test suites passed.
===============================================
```

## Testing from IntelliJ
