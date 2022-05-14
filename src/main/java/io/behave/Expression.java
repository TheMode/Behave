package io.behave;

import org.jetbrains.annotations.NotNull;

public sealed interface Expression
        permits Expression.Constant, Expression.TagValue {
    non-sealed interface Constant extends Expression {
        @NotNull Value value();
    }

    non-sealed interface TagValue extends Expression {
        @NotNull Entity entity();

        @NotNull Tag tag();
    }
}
