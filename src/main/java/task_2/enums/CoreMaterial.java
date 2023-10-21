package task_2.enums;

public enum CoreMaterial {
    PHOENIX_FEATHER,
    DRAGON_SCALE,
    UNICORN_HAIR,
    VEELA_HAIR,
    THESTRAL_TAIL_HAIR,
    OLLIVANDERS_CHOICE;

    @Override
    public String toString() {
        return switch (this) {
            case PHOENIX_FEATHER -> "Phoenix Feather";
            case DRAGON_SCALE -> "Dragon Scale";
            case UNICORN_HAIR -> "Unicorn Hair";
            case VEELA_HAIR -> "Veela Hair";
            case THESTRAL_TAIL_HAIR -> "Thestral Tail Hair";
            case OLLIVANDERS_CHOICE -> "Ollivander's Choice";
            default -> "Unknown Core Material";
        };
    }
}
