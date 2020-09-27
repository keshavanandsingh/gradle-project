package com.gradle1;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class gradleUC11
{
	public static UserRegistration ur=null;
	@Test
	public void TestEmail_trueCase1() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes-100@1.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase2() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes.100@gmail.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase3() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes111@kes.com");
		assertTrue(result);
	}
	@Test
	public void TestEmail_trueCase4() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes+100@1.com.in");
		assertTrue(result);
	}
	@Test
	public void TestEmail_falseCase1() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes.@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase2() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes@gmail.c");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase3() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes@gmail.com.1");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase4() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail(".kes.@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase5() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes.@.gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase6() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes@%*.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase7() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes()*@gmail@gmail.com");
		assertFalse(result);
	}
	@Test
	public void TestEmail_falseCase8() {
		ur = new UserRegistration();
		boolean result = ur.validateEmail("kes.@gmail.com.in.aa");
		assertFalse(result);
	}
	}

