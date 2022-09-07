package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    /**
     *
     * @param FirstName:input from the user
     */

    public static void toCheckForFirstNameValidation(String FirstName){
        /**
         * regex pattern is taken;where starting should be Capital letter and then min of 3 characters can be taken
         * pattern is then matched with user input name by using matcher class
         * if the  regex matches with the input name,then print has valid name
         * else invalid username
         */
        boolean isFirstName;
        String regexName = "^[A-Z]{1}[a-z A-Z]{3,}$";
        Pattern object = Pattern.compile(regexName);
        Matcher objectMatcher = object.matcher(FirstName);
        isFirstName = objectMatcher.matches();
        if(isFirstName) {
            System.out.println(FirstName + " is an valid name");
        }
        else{
            System.out.println(FirstName + " is an invalid user name");
        }
    }
}
