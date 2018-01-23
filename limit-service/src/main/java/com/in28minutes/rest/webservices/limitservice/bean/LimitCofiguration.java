package com.in28minutes.rest.webservices.limitservice.bean;

/**
 * Created by gijs on 1/23/18.
 */
public class LimitCofiguration {

    private final int minimum;
    private final int maximum;

    public LimitCofiguration(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaxium() {
        return maximum;
    }
}
