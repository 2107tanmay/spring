package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Shipment s1 = (Shipment) context.getBean("shipmentObj");
		Item i1 = s1.getItem();
		
		System.out.println("Shipment Details1");
		System.out.println("Enter the Item Name");
		i1.setItemName(sc.nextLine());
		System.out.println("Enter the Item Price");
		i1.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter the ShipmentId");
		s1.setShipmentId(sc.nextLine());
		System.out.println("Enter the Delivery Status");
		s1.setDeliveryStatus(sc.nextLine());
		
		Shipment s2 = (Shipment) context.getBean("shipmentObj");
		Item i2 = s2.getItem();
		
		System.out.println("Shipment Details1");
		System.out.println("Enter the Item Name");
		i2.setItemName(sc.nextLine());
		System.out.println("Enter the Item Price");
		i2.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter the ShipmentId");
		s2.setShipmentId(sc.nextLine());
		System.out.println("Enter the Delivery Status");
		s2.setDeliveryStatus(sc.nextLine());
		
		System.out.println("Delivery status of shipment ID: "+s1.getShipmentId()+" is "+s1.getDeliveryStatus());
		System.out.println("Delivery status of shipment ID: "+s2.getShipmentId()+" is "+s2.getDeliveryStatus());
	}	 

	
}
