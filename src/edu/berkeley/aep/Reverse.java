package edu.berkeley.aep;

/**
 * Takes a string and returns the letters in reverse order, using recursion..
 */
public class Reverse {

    public Reverse () {}


    public String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}