package co.edu.uniquindio.trabajos.javafx.trabajosjavafx.util;

import java.util.function.Supplier;

public class AssertionUtil {

    public static void assertion(boolean condition, Supplier<RuntimeException> exceptionSupplier) {
        if (!condition) {
            throw exceptionSupplier.get();
        }
    }

    public static void assertion(boolean condition, String message) {
        assertion(condition, () -> new RuntimeException(message));
    }

    public static void assertion(boolean condition) {
        assertion(condition, ()->new RuntimeException("ERROR: Condición no cumplida"));
    }
}
