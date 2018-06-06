package com.juurivuohi.spring.ordermanagement;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*This is where the spring work begins*/

public class TextInterface {

	private Scanner reader;
	private boolean running;
	private ApplicationContext context;
	private Customer customer;
	private PurchaseOrder purchase;

	public TextInterface(Scanner reader) {
		this.reader = reader;
		this.running = true;
		this.context = new ClassPathXmlApplicationContext("com/juurivuohi/spring/ordermanagement/beans/beans.xml");
		this.customer = (Customer) context.getBean("samlink");
		this.purchase = (PurchaseOrder) context.getBean("purchaseorder");
	}

	/*
	 * -------------------------------------------------------------------------
	 * start() method gets called from Main class
	 * -------------------------------------------------------------------------
	 */
	public void start() {

		menu();

		((ClassPathXmlApplicationContext) context).close();
	}

	/*
	 * ------------------------------------------------------------------------- The
	 * main menu called from start() method
	 * -------------------------------------------------------------------------
	 */
	private void menu() {
		while (this.running == true) {
			System.out.println("-------");
			System.out.println("1) Print out customer details");
			System.out.println("2) Print customers open orders");
			System.out.println("3) Quit");
			System.out.println("-------");
			System.out.print("-> ");
			int menuOption = Integer.parseInt(this.reader.nextLine());
			switch (menuOption) {
			case 1:
				System.out.println(this.customer);
				break;
			case 2:
				System.out.println(this.purchase);
				break;
			case 3:
				this.running = false;
				break;
			case 4:
			}
		}
	}
}
