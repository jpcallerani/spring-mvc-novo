package com.br.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to a inicial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// Recuperando parametro da pagina;
		String theName = request.getParameter("studentName");

		// Convertendo o nome para uppercase;
		theName = theName.toUpperCase();
		String result = "Yo! " + theName;

		// Retornando o parametro para a pagina
		model.addAttribute("message", result);

		// Retornando a pagina
		return "helloworld";
	}

	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String theName, Model model) {
		// Convertendo o nome para uppercase;
		theName = theName.toUpperCase();
		String result = "Hey my friend: " + theName;

		// Retornando o parametro para a pagina
		model.addAttribute("message", result);

		// Retornando a pagina
		return "helloworld";
	}
}
