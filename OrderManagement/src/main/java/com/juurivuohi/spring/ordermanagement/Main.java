package com.juurivuohi.spring.ordermanagement;

import java.util.Scanner;

/* Created with Eclipse Java EE IDE Oxygen.3a
 * Simple Apache Maven (4.0.0)  Spring framework project.
 * With following dependencies:
 * Spring-core 5.0.6
 * Spring-beans 5.0.6
 * Spring-context 5.0.6
 * 
 * Displaying the usage of:
 * - ApplicationContext (Beanfactory container)																-> TextInterface.java
 * - How to set properties of bean in Spring Bean Configuration XML file via <property> 					-> Customer.java
 * - How to set bean constructor arguments in Spring Bean Configuration XML file via <constructor-arg>		-> PurchaseOrder.java
 * - How to do simple dependency injection (injecting Terms dependency to Customer class)					-> dependent: Customer.java - dependency: terms.java
*/

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		TextInterface textinterface = new TextInterface(reader);
		textinterface.start();

	}
}
