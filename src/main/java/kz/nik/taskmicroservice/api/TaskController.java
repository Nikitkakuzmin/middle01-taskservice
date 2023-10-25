package kz.nik.taskmicroservice.api;

import kz.nik.taskmicroservice.dto.TaskDto;
import kz.nik.taskmicroservice.servcie.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public ArrayList<TaskDto> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping(value="{id}")
    public TaskDto getTask(@PathVariable(name = "id")Long id) {
        return taskService.getTask(id);
    }

    @PostMapping
    public TaskDto addTask(@RequestBody TaskDto taskDto) {
        return taskService.addTask(taskDto);
    }
}
