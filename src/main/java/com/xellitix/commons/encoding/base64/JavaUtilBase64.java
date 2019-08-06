package com.xellitix.commons.encoding.base64;

import com.google.inject.Singleton;

/**
 * {@link Base64} implemented using the Java.Util libraries.
 *
 * @author Grayson Kuhns
 */
@Singleton
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
   * @return The encoded text as a {@link String}.
   */
  @Override
  public String encodeToString(final String text) {
    return encodeToString(text.getBytes());
  }

  /**
   * Encodes bytes using base64.
   *
   * @param data The bytes to encode.
   * @return The encoded bytes as a {@link String}.
   */
  @Override
  public String encodeToString(final byte[] data) {
    return new String(encodeToBytes(data));
  }

  /**
   * Encodes text using base64.
   *
   * @param text The text to encode.
   * @return The encoded text as bytes.
   */
  @Override
  public byte[] encodeToBytes(final String text) {
    return encodeToBytes(text.getBytes());
  }

  /**
   * Encodes bytes using base64.
   *
   * @param data The bytes to encode.
   * @return The encoded bytes as bytes.
   */
  @Override
  public byte[] encodeToBytes(final byte[] data) {
    return encoder.encode(data);
  }

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The text to decode.
   * @return The decoded text as a {@link String}.
   */
  @Override
  public String decodeToString(final String encodedText) {
    return decodeToString(encodedText.getBytes());
  }

  /**
   * Decodes base64 encoded bytes.
   *
   * @param encodedData The bytes to decode.
   * @return The decoded bytes as a {@link String}.
   */
  @Override
  public String decodeToString(final byte[] encodedData) {
    return new String(decodeToBytes(encodedData));
  }

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The text to decode.
   * @return The decoded text as bytes.
   */
  @Override
  public byte[] decodeToBytes(final String encodedText) {
    return decodeToBytes(encodedText.getBytes());
  }

  /**
   * Decodes base64 encoded bytes.
   *
   * @param encodedData The bytes to decode.
   * @return The decoded bytes as bytes.
   */
  @Override
  public byte[] decodeToBytes(final byte[] encodedData) {
    return decoder.decode(encodedData);
  }
}
