package org.learning;

public class Car {

    // Defining the fields of car which are final to maintain immutability.
    private final String engine;
    private final String color;

    // Private constructor for car, shows the pattern of taking a builder object
    private Car(Builder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
    }

    // Getter methods for the fields

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    // Static Builder class
    public static class Builder {

        private String engine;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
