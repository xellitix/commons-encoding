package com.xellitix.commons.encoding.base64;

/**
 * {@link Base64} implemented using the Java.Util libraries.
 *
 * @author Grayson Kuhns
 */
public class JavaUtilBase64 implements Base64 {

  // Dependencies
  private final java.util.Base64.Encoder encoder;
  private final java.util.Base64.Decoder decoder;

  /**
   * Constructor.
   */
  JavaUtilBase64() {
    encoder = java.util.Base64.getEncoder();
    decoder = java.util.Base64.getDecoder();
  }

  /**
   * Encodes text using base64.
   *
   * @param text The text to encode.
   * @return The encoded text.
   */
  @Override
  public String encode(final String text) {
    final byte[] data = text.getBytes();
    return encoder.encodeToString(data);
  }

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The encoded text.
   * @return The decoded text.
   */
  @Override
  public String decode(final String encodedText) {
    final byte[] data = decoder.decode(encodedText);
    return new String(data);
  }
}
