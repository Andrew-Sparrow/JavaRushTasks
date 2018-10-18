package com.javarush.task.task19.task1921;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution
{
    public static final List<Person> PEOPLE = new ArrayList<Person>();
    
    public static void main(String[] args) throws IOException, ParseException
    {
        
            String fileName = /*"F:/1.txt";*/args[0];
        
            FileReader fileReader = new FileReader(fileName);
        
            Map<String, Double> map = new TreeMap<>();
        
            StringBuilder stringBuilder = new StringBuilder();
        
            //adding lines from file to stringBuilder
            while(fileReader.ready())
            {
                Character character = (char)fileReader.read();
            
                stringBuilder.append(character);
            }
            
            fileReader.close();
            
            String str = stringBuilder.toString();
            String[] arrLines = str.split("\n"); //split string by newLine, this array contains all lines from file
        
            Pattern pattern = Pattern.compile("^(?<name>\\D+)\\b\\s(?<date>\\d+\\s\\d+\\s\\d+)");
    
            for ( String s: arrLines)
            {
                Matcher matcher = pattern.matcher(s);
    
                matcher.find();
    
                String strName = matcher.group("name");
                String strDate = matcher.group("date");
    
                String[] datePersonSplitted = strDate.split("\\s+");
    
                int day = Integer.parseInt(datePersonSplitted[0]);
                int month = Integer.parseInt(datePersonSplitted[1]);
                int year = Integer.parseInt(datePersonSplitted[2]);
    
                String patternDate = "dd MM yyyy";
    
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternDate );
    
                Date birthDate = simpleDateFormat.parse(day + " " + month + " " + year );
                
                Person person = new Person(strName, birthDate);
                
                PEOPLE.add(person);
                
                
            }
            /*for ( Person personList: PEOPLE    ) //verify list of PEOPLE
            {
                System.out.println(personList.getName()+" "+ personList.getBirthDate().toString());
            }*/
        
    
    }
}
