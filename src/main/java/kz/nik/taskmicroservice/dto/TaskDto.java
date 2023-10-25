package kz.nik.taskmicroservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class TaskDto {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime deadline;
}
