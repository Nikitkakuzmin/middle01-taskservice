package kz.nik.taskmicroservice.servcie;

import kz.nik.taskmicroservice.dto.TaskDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;


@Service
public class TaskService {

    private ArrayList<TaskDto> tastDtoList;
    private Long id;

    public TaskService() {
        tastDtoList = new ArrayList<>();
        tastDtoList.add(TaskDto.builder()
                .id(1L)
                .name("Task 1")
                .description("to do 1")
                .deadline(LocalDateTime.now())
                .build());
        tastDtoList.add(TaskDto.builder()
                .id(2L)
                .name("Task 2")
                .description("to do 2")
                .deadline(LocalDateTime.now())
                .build());
        tastDtoList.add(TaskDto.builder()
                .id(3L)
                .name("Task 3")
                .description("to do 3")
                .deadline(LocalDateTime.now())
                .build());
        tastDtoList.add(TaskDto.builder()
                .id(4L)
                .name("Task 4")
                .description("to do 4")
                .deadline(LocalDateTime.now())
                .build());
        id = 5L;
    }


    public ArrayList<TaskDto> getTasks() {
        return tastDtoList;
    }

    public TaskDto getTask(Long id){
        return tastDtoList.stream().filter(taskDto -> taskDto.getId().equals(id)).findFirst().orElse(null);
    }

    public TaskDto addTask(TaskDto taskDto){
        taskDto.setId(id);
        taskDto.setDeadline(LocalDateTime.now());
        tastDtoList.add(taskDto);
        id++;
        return taskDto;
    }
}
