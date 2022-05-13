package io.behave;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Listener {
    @NotNull String name();

    @NotNull List<@NotNull Transaction> transactions();
}
