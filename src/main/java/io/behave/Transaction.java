package io.behave;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface Transaction {
    @NotNull Condition condition();

    @NotNull List<@NotNull Operation> operations();

    interface Condition {
    }

    interface Operation {
    }
}
