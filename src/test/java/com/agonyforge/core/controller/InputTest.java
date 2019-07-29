package com.agonyforge.core.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputTest {
    @Test
    public void testSetInput() {
        Input input = new Input();
        input.setInput("Testing");

        assertEquals("Testing", input.getInput());
        assertEquals("Testing", input.toString());
    }

    @Test
    public void testEquality() {
        Input input = new Input();
        Input match = new Input();

        input.setInput("Testing");
        match.setInput("Testing");

        assertEquals(match, input);
        assertEquals(match.hashCode(), input.hashCode());
    }
}
