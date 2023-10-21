package task_2.enums;

public enum WoodType {
    ACACIA,
    ASH,
    BLACKTHORN,
    CEDAR,
    CHERRY,
    ELDER;

    @Override
    public String toString() {
        return switch (this) {
            case ACACIA -> "Acacia";
            case ASH -> "Ash";
            case BLACKTHORN -> "Blackthorn";
            case CEDAR -> "Cedar";
            case CHERRY -> "Cherry";
            case ELDER -> "Elder";
            default -> "Unknown Wood Type";
        };
    }
}

