package org.vadym.demo.repository;

import org.vadym.demo.WatchType;
import org.vadym.demo.model.Watch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WatchRepository {
    private List<Watch> watches;

    public WatchRepository(){
        this.watches = new ArrayList<Watch>();
        initializeStore();
    }

    private void initializeStore(){
        watches.add(new Watch(WatchType.QUARTZ, "Casio", 1500, "Black",
                LocalDate.of(2024, 2,12), "Plastic", true));

        watches.add(new Watch(WatchType.MECHANICAL, "Seiko", 8500, "Silver",
                LocalDate.of(2025, 1, 20), "Steel", false));

        watches.add(new Watch(WatchType.SOLAR, "Casio Solar", 2800.00, "Green",
                LocalDate.of(2024, 12, 5), "Plastic", true));

        watches.add(new Watch(WatchType.SMART, "Samsung Galaxy Watch", 8500.00, "Gray",
                LocalDate.of(2024, 11, 30), "Steel", true));
    }

    public List<Watch> getWatches(){
        return new ArrayList<>(watches);
    }

    public void addWatch(Watch watch){
        watches.add(watch);
    }

    public double getTotalValue(){
        return watches.stream()
                .mapToDouble(Watch::getPrice)
                .sum();
    }

    public List<Watch> getSortedByPrice(){
        List<Watch> sorted = new ArrayList<>(watches);
        sorted.sort(Comparator.comparing(Watch::getPrice));
        return sorted;
    }

    public List<Watch> getSortedByColor(){
        List<Watch> sorted = new ArrayList<>(watches);
        sorted.sort(Comparator.comparing(Watch::getColor));
        return sorted;
    }

    public List<Watch> getSortedByArrivalDate(){
        List<Watch> sorted = new ArrayList<>(watches);
        sorted.sort(Comparator.comparing(Watch::getArrivalDate));
        return sorted;
    }
}
