package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:59 PM
 */
public class AreyengSghela extends Employee {
    private static final String DEPARTMENT = "AreyengSghela Team Lead";

    public AreyengSghela(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
