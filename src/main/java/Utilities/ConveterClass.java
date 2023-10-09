package Utilities;

import Beans.Employee;
import Database.SwiftIQDatabase;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday June 2023
 * @Time: 1:25 PM
 */
public class ConveterClass {
    SwiftIQDatabase DB = new SwiftIQDatabase();
    Employee employee;

    public ConveterClass(){
        super();
    }
    protected void ValidateEmp(String email, String password){
        email.equals(employee.getEmail());
        password.equals(employee.getPassword());

        String valid = email + " " + password;
        return;
    }
}
