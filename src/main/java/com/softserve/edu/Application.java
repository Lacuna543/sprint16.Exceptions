package com.softserve.edu;


import com.softserve.edu.model.*;
import com.softserve.edu.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
//@SpringBootApplication
//public class Application implements CommandLineRunner {
//
//	UserService userService;
//	MarathonService marathonService;
//	private final SprintService sprintService;
//	private final TaskService taskService;
//	private final ProgressService progressService;
//
//	public Application(UserService userService, MarathonService marathonService, SprintService sprintService, TaskService taskService, ProgressService progressService) {
//		this.userService = userService;
//		this.marathonService = marathonService;
//		this.sprintService = sprintService;
//		this.taskService = taskService;
//		this.progressService = progressService;
//	}
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(Application.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Sprint sprint = new Sprint();
//		sprint.setTitle("Stream API");
//		sprintService.addSprintToMarathon(sprint, marathonService.getMarathonById(2L));
//		Task task = new Task();
//		task.setTitle("some task");
//		taskService.addTaskToSprint(task, sprintService.getSprintById(2L));
//		Progress progress = new Progress();
//		progressService.addOrUpdateProgress(progress);
//		User student = userService.getAllByRole(User.Role.TRAINEE.toString()).get(0);
//		progressService.addTaskForStudent(task, student);
//    }
//}