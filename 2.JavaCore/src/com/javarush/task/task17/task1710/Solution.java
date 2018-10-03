package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution
{
    public static List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH) ;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH) ;

        //start here - начни тут

        if(args[0].equals("-c"))
        {
            if(args[2].equals("м"))
            {
                allPeople.add(Person.createMale(args[1], simpleDateFormat1.parse(args[3])));
            }
            else if(args[2].equals("ж"))
            {
                allPeople.add(Person.createFemale(args[1], simpleDateFormat1.parse(args[3])));
            }

            System.out.println(allPeople.size()-1);
        }

        if(args[0].equals("-u")) // update
        {
            Person person = allPeople.get(Integer.parseInt(args[1]));

            person.setName(args[2]);

            if(args[3].equals("м"))
            {
                    person.setSex(Sex.MALE);
            }
            else
            {
                person.setSex(Sex.FEMALE);
            }
            person.setBirthDay(simpleDateFormat1.parse(args[4]));
        }

        if(args[0].equals("-d")) // deleting person
        {
            Person person = allPeople.get(Integer.parseInt(args[1]));

            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }

        if(args[0].equals("-i"))
        {
            int i = Integer.parseInt(args[1]);

            String sex ="";

            if(allPeople.get(i).getSex()==Sex.MALE)
            {
                sex = "м";
            }
            else if(allPeople.get(i).getSex()==Sex.FEMALE)
            {
                sex= "ж";
            }

            System.out.println(allPeople.get(i).getName()+" "+sex+" "+ simpleDateFormat2.format(allPeople.get(i).getBirthDay()));
        }

        /*for (int i = 0; i < allPeople.size(); i++) // it shows all elements in list
        {
            String sex ="";

            if(allPeople.get(i).getSex()==Sex.MALE)
            {
                sex = "м";
            }
            else if(allPeople.get(i).getSex()==Sex.FEMALE)
            {
                sex= "ж";
            }

            System.out.println("all elements "+i +" "+ allPeople.get(i).getName()+" "+sex+" "+ simpleDateFormat2.format(allPeople.get(i).getBirthDay()));
        }*/
    }
}
