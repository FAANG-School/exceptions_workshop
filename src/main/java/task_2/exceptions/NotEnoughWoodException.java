package task_2.exceptions;

import task_2.enums.WoodType;

public class NotEnoughWoodException extends RuntimeException {
    public NotEnoughWoodException(WoodType woodType) {
        super("Not enough \"%s\" wood material".formatted(woodType));
    }
}
