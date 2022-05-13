package io.behave;

import org.jetbrains.annotations.NotNull;

public interface Tag {
    @NotNull String path();

    @NotNull Type type();

    boolean serialized();

    enum Type {
        BYTE,
        SHORT,
        INT,
        LONG,
        FLOAT,
        DOUBLE,
        BYTE_ARRAY,
        STRING,
        INT_ARRAY,
        LONG_ARRAY
    }
}
