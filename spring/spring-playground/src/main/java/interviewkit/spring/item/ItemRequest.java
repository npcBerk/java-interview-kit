package interviewkit.spring.item;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record ItemRequest(@NotBlank String name, @Min(0) int quantity) {}
