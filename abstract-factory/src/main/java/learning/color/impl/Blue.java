package learning.color.impl;

import learning.color.Color;

/**
 * The Blue class is an implementation of the Color interface.
 * It represents the color blue and provides a method to fill with blue color.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with blue color...");
    }
}