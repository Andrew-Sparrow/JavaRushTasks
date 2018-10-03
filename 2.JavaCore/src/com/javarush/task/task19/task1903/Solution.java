package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static Map<String, String> countries = new HashMap<String, String>();

    static
    {
        countries.put( "UA", "Ukraine" );
        countries.put( "RU", "Russia" );
        countries.put( "CA", "Canada" );
    }
    
    
    public static void main(String[] args)
    {
        //System.out.println(String.format("%010d", 123));
    }

    public static class IncomeDataAdapter implements Customer, Contact
    {
        private IncomeData data ;
        
        
        public IncomeDataAdapter(IncomeData data )
        {
            this.data = data ;
        }
        
        public String getCompanyName()       //example JavaRush Ltd.
        {
            return this.data.getCompany();
        }

        public String getCountryName()        //example Ukraine
        {
            return countries.get(this.data.getCountryCode());
        }
    
        public String getName()               //example Ivanov, Ivan
        {
            return this.data.getContactLastName() +", " + this.data.getContactFirstName();
        }

        public String getPhoneNumber()       //example +38(050)123-45-67
        {
            String countryPhoneCode = this.data.getCountryPhoneCode() +"";

            int phoneNumber = this.data.getPhoneNumber() ;

            String strPhoneNumber = phoneNumber +"";

            if(strPhoneNumber.length() < 10)
                strPhoneNumber = String.format("%010d", phoneNumber );

            return  "+" + String.valueOf(countryPhoneCode) +"("+ strPhoneNumber.substring(0,3)+")"+ strPhoneNumber.substring(3,6)+"-"+ strPhoneNumber.substring(6,8) + "-" + strPhoneNumber.substring(8);

        }
    }


    public static interface IncomeData
    {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer
    {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact
    {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}