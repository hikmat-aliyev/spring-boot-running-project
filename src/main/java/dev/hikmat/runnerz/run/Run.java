package dev.hikmat.runnerz.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record Run(
        Integer id,
        @NotEmpty String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive Integer miles,
        Location location) {

    public Run {
        if (completedOn.isBefore(startedOn)) {
            throw new IllegalArgumentException("Completed on should be after Started on");
        }
    }

}
