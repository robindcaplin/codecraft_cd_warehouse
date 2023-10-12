package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class WarehouseTest {
    @Test
    void searchFindsAbsoluteMatch() {
        Warehouse warehouse = new Warehouse();
        warehouse.addStock(List.of(new CD("The Beatles - Revolver")));
        assertIterableEquals(List.of(new CD("The Beatles - Revolver")), warehouse.search("The Beatles - Revolver"));
    }

    @Test
    void searchFindsMultipleCDs() {
        Warehouse warehouse = new Warehouse();
        warehouse.addStock(List.of(new CD("The Beatles - Revolver"), new CD("The Beatles - Pistol"), new CD("The Beatles - Rifle")));
        assertIterableEquals(List.of(new CD("The Beatles - Revolver"), new CD("The Beatles - Pistol"), new CD("The Beatles - Rifle")), warehouse.search("The Beatles"));
    }
}