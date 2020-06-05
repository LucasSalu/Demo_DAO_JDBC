package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		System.out.println("====================findByID===================");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
	    System.out.println(departmentDao.findById(2));
	    
		System.out.println("====================findAllt===================");	
		System.out.println(departmentDao.findAll());
		
	 	System.out.println("====================insert===================");
   // 	departmentDao.insert(new Department(2,"qwe"));

      	
		System.out.println("====================update===================");
		departmentDao.update(new Department(4,"qwe"));
		
		System.out.println("====================deleteById===================");
		System.out.println("Digite o Id que deseja deletar");
        departmentDao.deleteById(8);
		

	}

}
