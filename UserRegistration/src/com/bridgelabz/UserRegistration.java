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

    public static void toCheckForEmailValidation(String email){
        /**
         * regex pattern is taken;wherecondition is given as per the uc
         * * pattern is then matched with user input name by using matcher class
         * if the  regex matches with the input name,then print has valid email
         * else invalid email-id
         */

            boolean isEmailId;
            String emailIdRegex ="^[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]$";//abc.xyz@bl.co.in
            Pattern patternObj = Pattern.compile(emailIdRegex);
            Matcher matcherObj = patternObj.matcher(email);
            isEmailId =  matcherObj.matches();

            if(isEmailId)
                System.out.println(email+" is a Valid Email Id\n");
            else
                System.out.println(email+" is a Invalid Email Id");
        }
}
