/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private List<String> contents;

    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    /**
     * Creates a new Bag object with given color and capacity.
     * @param color the color of this bag.
     * @param capacity the capacity of this bag.
     */
    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }

    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    /**
     * Returns the color of this bag.
     * @return the color of this bag.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Returns the number of contents in this bag.
     * @return the number of contents in this bag.
     */
    public int getNumberOfContents() {
        return this.numberOfContents;
    }

    /**
     * Returns the capacity of this bag.
     * @return the capacity of this bag.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
    /**
     * Sets the color of this bag.
     * @param color the color to be set this bag to.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    /**
     * Adds a String representation of an item to this bag.
     * @param item a String representation of an item to be added to this bag.
     * @return true if the item was added and false otherwise.
     */
    public boolean addItem(String item) {
        if (this.numberOfContents < this.capacity) {
            this.contents.add(item);
            this.numberOfContents++;
            return true;
        } else {
            return false;
        }
    }

    /*
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     */
    /**
     * Removes and returns the String representation of the last item added to this bag.
     * @return the String representation of the last item added to this bag; null if there are no items in this bag.
     */
    public String popItem() {
        if (this.contents.isEmpty()) {
            return null;
        }

        this.numberOfContents--;
        String item = this.contents.remove(this.numberOfContents);
        return item;
    }

    /**
     * Increases this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by.
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;
    }

    /**
     * Returns the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return the string representation of the details of this bag.
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}