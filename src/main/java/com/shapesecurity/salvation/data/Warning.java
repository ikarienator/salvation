package com.shapesecurity.salvation.data;

import com.shapesecurity.salvation.interfaces.Show;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Warning implements Show {

    @Nonnull public final String message;
    @Nullable public Location startLocation;
    @Nullable public Location endLocation;

    public Warning(@Nonnull String message) {
        this.message = message;
    }

    @Override public String toString() {
        return "Warning: " + message;
    }

    @Nonnull @Override public String show() {
        if (startLocation == null) {
            return message;
        }
        return startLocation.show() + ": " + message;
    }
}

