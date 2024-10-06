package net.hanas_cards.util;

public enum CustomCardRarity {
    MYTHIC(new String[] {
            "§4",
            "§c",
            "§6",
            "§e",
            "§a",
            "§b",
            "§9",
            "§d",
            "§5"
    }, "Mythic"),
    LEGENDARY("§6", "Legendary"),
    ULTRA_RARE(new String[] {"§3", "§9"}, "Ultra Rare");

    private final String[] colorCodes;
    private final String displayName;
    private final boolean isCycling;

    CustomCardRarity(String colorCode, String displayName) {
        this.colorCodes = new String[] { colorCode };
        this.displayName = displayName;
        this.isCycling = false;
    }

    CustomCardRarity(String[] colorCodes, String displayName) {
        this.colorCodes = colorCodes;
        this.displayName = displayName;
        this.isCycling = true;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getColorCode() {
        return isCycling ? getCyclingColor() : colorCodes[0];
    }
    // Change color
    private String getCyclingColor() {
        long time = System.currentTimeMillis();
        int index = (int) ((time / 500) % colorCodes.length);
        return colorCodes[index];
    }
}
