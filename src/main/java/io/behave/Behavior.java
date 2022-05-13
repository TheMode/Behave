package io.behave;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

public interface Behavior {
    @Unmodifiable
    @NotNull List<@NotNull Tag> tags();

    @Unmodifiable
    @NotNull Map<@NotNull String, @NotNull Listener> listeners();

    static @NotNull Behavior parse(@NotNull String behavior) {
        throw new UnsupportedOperationException();
    }
}
