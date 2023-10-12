package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CDTest {

    private String usedArtist;
    private Chart mockChart = new Chart() {
        @Override
        public void notifySale(String artist) {
            usedArtist = artist;
        }
    };

    @Test
    void buysSuccessfully() {
        CD cd = new CD("", mockChart);
        cd.addStock(1);
        assertEquals(true, cd.buy());
    }

    @Test
    void buyFailsNoStock() {
        CD cd = new CD("", mockChart);
        assertEquals(false, cd.buy());
    }

    @Test
    void notifiesChartsOnBuy() {
        usedArtist = null;
        CD cd = new CD("The Beatles", mockChart);
        cd.addStock(1);
        cd.buy();
        assertEquals("The Beatles", usedArtist);
    }
}