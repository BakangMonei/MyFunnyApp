package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:53 PM
 */
public class Marketing extends Employee {
    private static final String DEPARTMENT = "Marketing and Sales Specialist";

    public Marketing(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
