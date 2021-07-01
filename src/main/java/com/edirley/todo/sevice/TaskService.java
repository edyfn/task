package com.edirley.todo.sevice;

import com.edirley.todo.dto.TaskDto;
import com.edirley.todo.entity.Task;
import com.edirley.todo.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Page<Task> getTasks(Pageable pageable) {
        return taskRepository.findAll(pageable);
    }

    public Task getTask(long taskId) {
        Optional<Task> task = taskRepository.findById(taskId);
        return task.get();
    }

    public Task saveTask(TaskDto taskDto) {
        ModelMapper modelMapper = new ModelMapper();
        Task task = modelMapper.map(taskDto, Task.class);

        return taskRepository.save(task);
    }

}
