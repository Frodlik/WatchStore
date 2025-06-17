package org.vadym.demo.controller;

import org.vadym.demo.model.Watch;
import org.vadym.demo.repository.WatchRepository;
import org.vadym.demo.view.WatchView;

import java.util.List;

public class WatchController {
    private final WatchRepository watchRepository;
    private final WatchView watchView;

    public WatchController(WatchRepository watchRepository, WatchView watchView) {
        this.watchRepository = watchRepository;
        this.watchView = watchView;
    }

    public void run() {
        boolean running = true;

        while (running) {
            watchView.displayMenu();
            int choice = watchView.getUserChoice();

            switch (choice) {
                case 1:
                    showAllWatches();
                    break;
                case 2:
                    sortByPrice();
                    break;
                case 3:
                    sortByColor();
                    break;
                case 4:
                    sortByArrivalDate();
                    break;
                case 5:
                    showTotalValue();
                    break;
                case 6:
                    addNewWatch();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        watchView.close();
    }

    private void showAllWatches() {
        List<Watch> watches = watchRepository.getWatches();
        watchView.displayWatches(watches);
    }

    private void sortByPrice() {
        List<Watch> watches = watchRepository.getSortedByPrice();
        watchView.displayWatches(watches);
    }

    private void sortByColor() {
        List<Watch> watches = watchRepository.getSortedByColor();
        watchView.displayWatches(watches);
    }

    private void sortByArrivalDate() {
        List<Watch> watches = watchRepository.getSortedByArrivalDate();
        watchView.displayWatches(watches);
    }

    private void showTotalValue() {
        double totalValue = watchRepository.getTotalValue();
        watchView.displayTotalValue(totalValue);
    }

    private void addNewWatch() {
        Watch newWatch = watchView.addWatch();
        watchRepository.addWatch(newWatch);
        System.out.println("Watch added successfully!");
    }

}
