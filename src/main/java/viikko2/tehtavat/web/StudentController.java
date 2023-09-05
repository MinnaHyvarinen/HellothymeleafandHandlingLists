package viikko2.tehtavat.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import viikko2.tehtavat.domain.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {
	
	@GetMapping("/hello")
	public String showStudents(Model model) {
		System.out.println("Students");
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Kate", "Cole"));
		students.add(new Student("Dan", "Brown"));
		students.add(new Student("Mike", "Mars"));
		
		model.addAttribute("students", students);
		return "studentlist";
	}
	
	@RequestMapping("/hello2")
	public String sayWelcome(@RequestParam (name="name") String name, 
			@RequestParam (name="age") int age, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello2";
		
	}
	
}
