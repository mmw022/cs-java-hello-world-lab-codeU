package com.flatironschool.javacs;

//Megan Wang CodeU 2016

public class HelloWorld {
    
    /**
     * Method that returns the version number of the system
     */

    public static Double getVersion() {
        //Create a string of the version number
        String versionNum = System.getProperty("java.specification.version");
        
        //Return the double version of the string
        return Double.parseDouble(versionNum);
    }

    public static void main(String[] args) {
    
    }
}
