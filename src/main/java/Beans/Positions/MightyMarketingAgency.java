package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 1:01 PM
 */
public class MightyMarketingAgency extends Employee {
    private static final String DEPARTMENT = "Mighty Marketing Agency Team Lead";

    public MightyMarketingAgency(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
