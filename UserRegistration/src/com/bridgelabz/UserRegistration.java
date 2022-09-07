package com.bridgelabz;
/**
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *
     * @param password:input from the user
     */

    public static void toCheckPasswordValidation(String password){
        /**
         * regex pattern is taken;where condition is given as per the uc
         * * pattern is then matched with user input name by using matcher class
         * if the  regex matches with the input name,then print has valid email
         * else invalid email-id
         */

            boolean isPassword;
            String mobileNumberRegex = "^[A-z a-z]{8,}$";;
            Pattern obj = Pattern.compile(mobileNumberRegex);
            Matcher matcherObj = obj.matcher(password);
            isPassword =  matcherObj.matches();

            if(isPassword)
                System.out.println(password+" is a Valid  password\n");
            else
                System.out.println(password+" is a Invalid  password");

        }
}
