package com.br.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Student {

	private String firstName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	@NotBlank
	private String lastName;
	private String country;
	private String favoriteLanguage;

	@NotNull
	@NumberFormat(style = Style.NUMBER)
	@Min(1)
	@Max(110)
	private Integer age;

	public Student() {
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer Age) {
		this.age = Age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
}
