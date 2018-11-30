package com.br.springdemo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// Criando novo objeto usuário;
		Student student = new Student();

		// E adicionando o objeto da página ao novo objeto;
		model.addAttribute("student", student);

		return "student-form";
	}

	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindResult) {
		if (bindResult.hasErrors()) {
			return "student-form";

		} else {
			return "student-confirmation";
		}
	}
}
