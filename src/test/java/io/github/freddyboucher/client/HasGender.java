package io.github.freddyboucher.client;

import javax.annotation.Nonnull;

public interface HasGender {
  @Nonnull
  default String getGender() {
    return "male";
  }
}
