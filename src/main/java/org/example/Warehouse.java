package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Warehouse {
    private List<CD> cds = new ArrayList<>();

    public List<CD> search(String searchTerm) {
        return cds.stream().filter(cd -> cd.name.contains(searchTerm)).toList();
    }

    public void addStock(List<CD> newCDs) {
        newCDs.forEach(newCD -> {
            Optional<CD> matchingCD = cds.stream().filter(warehouseCD -> warehouseCD.name == newCD.name).findFirst();
            if (matchingCD.isPresent()) {
                matchingCD.get().addStock(newCD.getQuantity());
            } else {
                cds.add(newCD);
            }
        });
    }
}
