package task_2.exceptions;

import task_2.enums.CoreMaterial;
import task_2.enums.WoodType;

public class NotEnoughMaterialException extends RuntimeException {
    public NotEnoughMaterialException(CoreMaterial coreMaterial) {
        super("Not enough \"%s\" core material".formatted(coreMaterial));
    }
}
