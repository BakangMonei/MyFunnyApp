package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:55 PM
 */

public class Finance extends Employee {

    // Finance and Accounting Officer
    private static final String DEPARTMENT = "Finance and Accounting Officer";

    public Finance(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
