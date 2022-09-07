package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *
     * @param LastName:input from the user
     */

    public static void toCheckForLastNameValidation(String LastName){
        /**
         * regex pattern is taken;where Ending should be Capital letter and then min of 3 characters can be taken
         * pattern is then matched with user input name by using matcher class
         * if the  regex matches with the input name,then print has valid name
         * else invalid username
         */
        boolean isLastName;
        String regexName = "^[A-Z]{1}[A-Z a-z]{3,}$";
        Pattern object = Pattern.compile(regexName);
        Matcher objectMatcher = object.matcher(LastName);
        isLastName = objectMatcher.matches();
        if(isLastName) {
            System.out.println(LastName + " is an valid name");
        }
        else{
            System.out.println(LastName + " is an invalid user name");
        }
    }
}
