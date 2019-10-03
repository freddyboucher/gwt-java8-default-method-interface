package io.github.freddyboucher.client;

import javax.annotation.Nonnull;

public class Person implements HasGender {
  @Nonnull
  public String getName() {
    return "Paul";
  }
}
