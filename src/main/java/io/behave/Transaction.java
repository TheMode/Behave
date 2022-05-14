package io.behave;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Represents a synchronized set of statements.
 * <p>
 * Operations between transactions cannot be reordered.
 */
public interface Transaction {

    /**
     * Condition for the transaction to be executed.
     */
    @NotNull Condition condition();

    /**
     * Statements to execute.
     * They can be reordered/optimized as long as behavior is conserved.
     */
    @NotNull List<@NotNull Statement> statements();

    interface Condition {
    }
}
