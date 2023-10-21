package task_3.enums;

public enum CourseType {
    MATH,
    HISTORY,
    BARTS_PRANKS,
    SCIENCE,
    MUSIC,
    ENVIRONMENTALISM;

    @Override
    public String toString() {
        return switch (this) {
            case MATH -> "Math";
            case HISTORY -> "History";
            case BARTS_PRANKS -> "Bart`s pranks";
            default -> "Unknown Course Type";
        };
    }
}
