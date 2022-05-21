package io.behave;

import org.jetbrains.annotations.NotNull;

import java.util.List;

sealed interface Statement
        permits Statement.ChangeTag, Statement.Command, Statement.Request {
    non-sealed interface Command extends Statement {
        @NotNull String name();

        @NotNull List<@NotNull Expression> arguments();
    }

    non-sealed interface Request extends Statement {
        @NotNull String input();
    }

    non-sealed interface ChangeTag extends Statement {
        @NotNull BehaveObject object();

        @NotNull Tag tag();

        @NotNull Expression expression();
    }
}
