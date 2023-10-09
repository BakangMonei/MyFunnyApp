package Beans.Positions;

import Beans.Employee;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 12:58 PM
 */
public class FinancialMarketing extends Employee {
    // Financial Marketing Analyst
    private static final String DEPARTMENT = "Financial Marketing Analyst";

    public FinancialMarketing(int id){
        this.id = id;
    }

    //Getters
    public String getDEPARTMENT() {
        return DEPARTMENT;
    }
}
