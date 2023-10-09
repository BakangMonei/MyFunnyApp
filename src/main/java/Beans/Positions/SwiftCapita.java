package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 1:01 PM
 */
public class SwiftCapita extends Employee {
    private static final String DEPARTMENT = "Swift Capita Team Lead";

    public SwiftCapita(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
