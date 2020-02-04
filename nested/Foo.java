package nested;

public class Foo {
  @org.junit.Test public void testFoo() {
    System.out.println("FOO" + new nested.testing.Helper());
  }
}
