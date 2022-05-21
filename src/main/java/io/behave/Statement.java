package io.behave;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;
import java.util.Map;

sealed interface Statement
        permits Statement.UpdateTag, Statement.Command, Statement.RemoteRequest {
    non-sealed interface Command extends Statement {
        @NotNull String name();

        @NotNull List<@NotNull Expression> arguments();
    }

    non-sealed interface RemoteRequest extends Statement {
        @NotNull String name();

        @Unmodifiable
        @NotNull Map<String, Expression> data();
    }

    non-sealed interface UpdateTag extends Statement {
        @NotNull BehaveObject object();

        @NotNull Tag tag();

        @NotNull Expression expression();
    }
}
