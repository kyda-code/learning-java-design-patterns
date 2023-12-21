package learning.color.impl;

import learning.color.Color;

/**
 * The Red class is an implementation of the Color interface.
 * It represents the color red and provides a method to fill with red color.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color...");
    }
}