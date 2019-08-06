package com.xellitix.commons.encoding.base64;

/**
 * Base64 utility.
 *
 * @author Grayson Kuhns
 */
public interface Base64 {

  /**
   * Encodes text using base64.
   *
   * @param text The text to encode.
   * @return The encoded text as a {@link String}.
   */
  String encodeToString(String text);

  /**
   * Encodes bytes using base64.
   *
   * @param data The bytes to encode.
   * @return The encoded bytes as a {@link String}.
   */
  String encodeToString(byte[] data);

  /**
   * Encodes text using base64.
   *
   * @param text The text to encode.
   * @return The encoded text as bytes.
   */
  byte[] encodeToBytes(String text);

  /**
   * Encodes bytes using base64.
   *
   * @param data The bytes to encode.
   * @return The encoded bytes as bytes.
   */
  byte[] encodeToBytes(byte[] data);

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The text to decode.
   * @return The decoded text as a {@link String}.
   */
  String decodeToString(String encodedText);

  /**
   * Decodes base64 encoded bytes.
   *
   * @param encodedData The bytes to decode.
   * @return The decoded bytes as a {@link String}.
   */
  String decodeToString(byte[] encodedData);

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The text to decode.
   * @return The decoded text as bytes.
   */
  byte[] decodeToBytes(String encodedText);

  /**
   * Decodes base64 encoded bytes.
   *
   * @param encodedData The bytes to decode.
   * @return The decoded bytes as bytes.
   */
  byte[] decodeToBytes(byte[] encodedData);
}
