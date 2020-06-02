package application;


import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args){
		
		Department obj = new Department(1,"Books");
		Seller seller = new Seller(19, "lucas", "Lucas@Gmail.com", new Date(), 1000.0, obj);
		System.out.println(seller);
	}

}
