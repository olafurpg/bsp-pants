package nested.inner;

import nested.inner.inner2.FooInner2;

public class FooInner {
  @org.junit.Test public void testFooInner() {
    System.out.println("FOO" + new nested.testing.Helper());
  }
}
