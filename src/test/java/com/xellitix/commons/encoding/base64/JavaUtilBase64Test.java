package com.xellitix.commons.encoding.base64;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * {@link JavaUtilBase64} test case.
 *
 * @author Grayson Kuhns
 */
public class JavaUtilBase64Test {

  // Constants
  private static final String PLAIN_TEXT = "Hello, world!";
  private static final String ENCODED_TEXT = "SGVsbG8sIHdvcmxkIQ==";

  // Fixtures
  private JavaUtilBase64 base64;

  @Test
  public void encodeText__Test() {
    assertThat(base64
        .encode(PLAIN_TEXT))
        .isNotNull()
        .isEqualTo(ENCODED_TEXT);
  }

  @Test
  public void decodeText__Test() {
    assertThat(base64
        .decode(ENCODED_TEXT))
        .isNotNull()
        .isEqualTo(PLAIN_TEXT);
  }

  @Before
  public void setUp() {
    base64 = new JavaUtilBase64();
  }
}
