package com.bridgelabz;
/**
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *
     * @param email:input from the user
     */

    public static void toCheckForPhoneNumberValidation(String mobileNumber){
        /**
         * regex pattern is taken;where condition is given as per the uc
         * * pattern is then matched with user input name by using matcher class
         * if the  regex matches with the input name,then print has valid email
         * else invalid email-id
         */

            boolean isMobileNumber;
            String mobileNumberRegex = "^[9][1] [0-9]{10}$";;
            Pattern obj = Pattern.compile(mobileNumberRegex);
            if (mobileNumber == null) {
                isMobileNumber = false;
            }
            Matcher matcherObj = obj.matcher(mobileNumber);
            isMobileNumber =  matcherObj.matches();

            if(isMobileNumber)
                System.out.println(mobileNumber+" is a Valid  Number\n");
            else
                System.out.println(mobileNumber+" is a Invalid  Number");

        }
}
