package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CDTest {
    @Test
    void buysSuccessfully() {
        CD cd = new CD("");
        cd.addStock(1);
        assertEquals(true, cd.buy());
    }

    @Test
    void buyFailsNoStock() {
        CD cd = new CD("");
        assertEquals(false, cd.buy());
    }
}