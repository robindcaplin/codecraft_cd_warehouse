package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class WarehouseTest {
    private Chart mockChart = new Chart() {
        @Override
        public void notifySale(String artist) {}
    };
    @Test
    void searchFindsAbsoluteMatch() {
        Warehouse warehouse = new Warehouse();
        warehouse.addStock(List.of(new CD("The Beatles - Revolver", mockChart)));
        assertIterableEquals(List.of(new CD("The Beatles - Revolver", mockChart)), warehouse.search("The Beatles - Revolver"));
    }

    @Test
    void searchFindsMultipleCDs() {
        Warehouse warehouse = new Warehouse();
        warehouse.addStock(List.of(
                new CD("The Beatles - Revolver", mockChart),
                new CD("The Beatles - Pistol", mockChart),
                new CD("The Beatles - Rifle", mockChart)));
        assertIterableEquals(List.of(new CD("The Beatles - Revolver", mockChart),
                new CD("The Beatles - Pistol", mockChart),
                new CD("The Beatles - Rifle", mockChart)
        ), warehouse.search("The Beatles"));
    }
}