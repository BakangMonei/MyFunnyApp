package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:56 PM
 */
public class HR extends Employee {
    // HR and Administration Coordinator
    private static final String DEPARTMENT = "HR and Administration Coordinator";

    public HR(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
