package io.behave;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.Map;

sealed interface Statement
        permits Statement.UpdateTag, Statement.RemoteRequest {
    non-sealed interface UpdateTag extends Statement {
        @NotNull BehaveObject object();

        @NotNull Tag tag();

        @NotNull Expression expression();
    }

    non-sealed interface RemoteRequest extends Statement {
        @NotNull String name();

        @Unmodifiable
        @NotNull Map<String, Expression> data();
    }
}
