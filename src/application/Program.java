package application;


import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args){
		
		System.out.println("====================findByID===================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
	    System.out.println(sellerDao.findById(3));
	    
	    System.out.println("findByDepartment");
	    sellerDao.findByDepartment(new Department(1,""));
	    
		System.out.println("====================findByDepartment===================");	
        System.out.println(sellerDao.findByDepartment(new Department(1,"")));

		System.out.println("====================findAllt===================");	
		System.out.println(sellerDao.findAll());
		
	 //	System.out.println("====================insert===================");
	//	sellerDao.insert(new Seller(null,"name","email",new Date(),10.0,new Department(2,"")));
		
		System.out.println("====================update===================");
		sellerDao.update(new Seller(11,"Salu","Salu",new Date(),10.0,new Department(3,"")));
		
		System.out.println("====================deleteById===================");
		System.out.println("Digite o Id que deseja deletar");
		sellerDao.deleteById(6);
		
		
	    
	}

}
