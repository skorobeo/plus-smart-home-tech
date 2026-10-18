package ru.yandex.practicum.collector.dto.hub;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DeviceAction {

    private String sensorId;

    @NotNull
    private ActionType type;

    private Integer value;
}
