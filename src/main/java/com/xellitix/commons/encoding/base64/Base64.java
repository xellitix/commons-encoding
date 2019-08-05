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
   * @return The encoded text.
   */
  String encode(String text);

  /**
   * Decodes base64 encoded text.
   *
   * @param encodedText The encoded text.
   * @return The decoded text.
   */
  String decode(String encodedText);
}
