package com.gradle;

import java.util.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradleUC10 {

	public static UserRegistration ur=null;
	@Test
	public void TestFirstName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateFirstName("John");
		assertTrue(result);
	}
	@Test
	public void TestFirstName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateFirstName("john");
		assertFalse(result);
	}
	@Test
	public void TestLastName_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateLastName("Lara");
		assertTrue(result);
	}
	@Test
	public void TestLastName_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateLastName("lara");
		assertFalse(result);
	}
	@Test
	public void TestEmail_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes@gmail.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes.gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestPhoneNumber_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePhoneNumber("918292826716");
		assertTrue(result);
	}
	@Test
	public void TestPhoneNumber_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePhoneNumber("8292826716");
		assertFalse(result);
	}
	@Test
	public void TestPassword_trueCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePassword("Love9@123467");
		assertTrue(result);
	}
	@Test
	public void TestPassword_falseCase() {
		ur = new UserRegistration();
		boolean result = ur.validatePassword("Love9123467");
		assertFalse(result);
	}
	}

}
