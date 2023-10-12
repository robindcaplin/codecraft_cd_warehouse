package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class WarehouseTest {
    @Test
    void searchFindsAbsoluteMatch() {
        Warehouse warehouse = new Warehouse();
        assertIterableEquals(List.of(new CD()), warehouse.search("The Beatles - Revolver"));
    }
}