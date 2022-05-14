package io.behave;

import org.jetbrains.annotations.NotNull;

import java.util.List;

sealed interface Operation
        permits Operation.ChangeTag, Operation.Command, Operation.Request {
    non-sealed interface Command extends Operation {
        @NotNull String name();

        @NotNull List<@NotNull Expression> arguments();
    }

    non-sealed interface Request extends Operation {
        @NotNull String input();
    }

    non-sealed interface ChangeTag extends Operation {
        @NotNull Entity entity();

        @NotNull Tag tag();

        @NotNull Expression expression();
    }
}
