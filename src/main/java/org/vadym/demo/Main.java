package org.vadym.demo;

import org.vadym.demo.controller.WatchController;
import org.vadym.demo.repository.WatchRepository;
import org.vadym.demo.view.WatchView;

public class Main {
    public static void main(String[] args) {
        WatchRepository repository = new WatchRepository();
        WatchView view = new WatchView();
        WatchController controller = new WatchController(repository, view);

        controller.run();
    }
}