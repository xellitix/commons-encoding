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
  private static final byte[] PLAIN_BYTES = PLAIN_TEXT.getBytes();

  private static final String ENCODED_TEXT = "SGVsbG8sIHdvcmxkIQ==";
  private static final byte[] ENCODED_BYTES = ENCODED_TEXT.getBytes();

  // Fixtures
  private JavaUtilBase64 base64;

  @Test
  public void encode__StringToString__Test() {
    assertThat(base64
        .encodeToString(PLAIN_TEXT))
        .isNotNull()
        .isEqualTo(ENCODED_TEXT);
  }

  @Test
  public void encode__BytesToString__Test() {
    assertThat(base64
        .encodeToString(PLAIN_BYTES))
        .isNotNull()
        .isEqualTo(ENCODED_TEXT);
  }

  @Test
  public void encode__StringToBytes__Test() {
    assertThat(base64
        .encodeToBytes(PLAIN_TEXT))
        .isNotNull()
        .isEqualTo(ENCODED_BYTES);
  }

  @Test
  public void encode_BytesToBytes__Test() {
    assertThat(base64
        .encodeToBytes(PLAIN_BYTES))
        .isNotNull()
        .isEqualTo(ENCODED_BYTES);
  }

  @Test
  public void decode__StringToString__Test() {
    assertThat(base64
        .decodeToString(ENCODED_TEXT))
        .isNotNull()
        .isEqualTo(PLAIN_TEXT);
  }

  @Test
  public void decode__BytesToString__Test() {
    assertThat(base64
        .decodeToString(ENCODED_BYTES))
        .isNotNull()
        .isEqualTo(PLAIN_TEXT);
  }

  @Test
  public void decode__StringToBytes__Test() {
    assertThat(base64
        .decodeToBytes(ENCODED_TEXT))
        .isNotNull()
        .isEqualTo(PLAIN_BYTES);
  }

  @Test
  public void decode_BytesToBytes__Test() {
    assertThat(base64
        .decodeToBytes(ENCODED_BYTES))
        .isNotNull()
        .isEqualTo(PLAIN_BYTES);
  }

  @Before
  public void setUp() {
    base64 = new JavaUtilBase64();
  }
}
