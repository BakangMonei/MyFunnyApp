package Utilities;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday June 2023
 * @Time: 1:24 PM
 */

import java.util.*;
public class ToolBox {
    public void PasswordGenerator(String password){
        String locked = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String unlocked = "abcdefghijklmnopqrstuvwxyz";
        int numbers = 1234567890;
        String special = "!@#$%^&*()_+=-?/.>,<";

        password = locked + unlocked+ numbers + special;

    }

}
