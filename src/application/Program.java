package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {
	
	public static void main(String[] args){
		
		System.out.println("====================findByID===================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
	    System.out.println(sellerDao.findById(3));
	    
	    System.out.println("findByDepartment");
	    sellerDao.findByDepartment(new Department(1,""));
	    
	}

}
