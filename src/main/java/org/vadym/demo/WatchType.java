package org.vadym.demo;

public enum WatchType {
    QUARTZ("Quartz"),
    MECHANICAL("Mechanical"),
    SOLAR("Solar"),
    SMART("Smart Watch");

    private final String displayedName;

    WatchType(String displayedName) {
        this.displayedName = displayedName;
    }

    public String getDisplayedName() {
        return displayedName;
    }
}
