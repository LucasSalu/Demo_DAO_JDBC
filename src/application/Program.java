package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
	
	public static void main(String[] args){
		
		System.out.println("====================findByID===================");
		SellerDao sellerDao = DaoFactory.createSellerDao();
	    System.out.println(sellerDao.findById(3));
	}

}
