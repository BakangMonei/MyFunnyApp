package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 1:02 PM
 */
public class SwiftDev extends Employee {
    private static final String DEPARTMENT = "SwiftDev Lead";

    public SwiftDev(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
