package test.java;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class HelloTest {
  @Test
  public void test() {
    assertEquals("is it equal", 2, 2);
  }

  @Test
  public void anotherTest() {
    assertNotEquals(12, 12);
  }
}