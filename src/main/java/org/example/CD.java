package org.example;

public class CD {
    public String name;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public CD(String name) {
        this.name = name;
    }

    public boolean buy() {
        if (quantity < 1) {
            return false;
        }
        return true;
    }

    public void addStock(int amount) {
        quantity += amount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        CD cd = (CD) other;
        return quantity == cd.quantity;
    }
}
