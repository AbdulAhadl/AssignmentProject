package com.sampleProject.assignmentproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class AssignmentprojectApplication {
	@GetMapping("/welcome")
public String welcome(){

	return "WelcomeNewProject";
}
	// echo "# AssignmentProject" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin https://github.com/AbdulAhadl/AssignmentProject.git
	// git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(AssignmentprojectApplication.class, args);
	}

}
