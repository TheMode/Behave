package io.behave;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

public interface Listener {
    @NotNull String name();

    @Unmodifiable
    @NotNull List<@NotNull Transaction> transactions();
}
