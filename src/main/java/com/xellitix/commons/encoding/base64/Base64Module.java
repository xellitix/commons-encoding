package com.xellitix.commons.encoding.base64;

import com.google.inject.AbstractModule;

/**
 * {@link Base64} module.
 *
 * @author Grayson Kuhns
 */
public class Base64Module extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  public void configure() {
    bind(Base64.class).to(JavaUtilBase64.class);
  }
}
