package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution
{
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static
    {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException
    {
        //start here - начни тут

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH) ;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH) ;

        switch(args[0])
        {
            case "-c":     //add new persons

                synchronized (allPeople)
                {
                    for (int i = 1; i <= args.length - 1; i++)
                    {
                        if (i % 3 == 1)
                        {
                            if (args[i + 1].equals("м"))
                            {
                                allPeople.add(Person.createMale(args[i], simpleDateFormat1.parse(args[i + 2])));
                            }
                            else if (args[2].equals("ж"))
                            {
                                allPeople.add(Person.createFemale(args[i], simpleDateFormat1.parse(args[i + 2])));
                            }
                        }
                    }

                    int numAdded = (args.length - 1) / 3;

                    for (int i = allPeople.size() - numAdded; i < allPeople.size(); i++)
                    {
                        System.out.println(i);
                    }
                }
            break;

            case "-u":      //update

                synchronized (allPeople)
                {
                    for (int i = 1; i < args.length; i++)
                    {
                        if (i % 4 == 1)
                        {
                            Person person = allPeople.get(Integer.parseInt(args[i]));

                            person.setName(args[i + 1]);

                            if (args[i + 2].equals("м"))
                            {
                                person.setSex(Sex.MALE);
                            }
                            else
                            {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDay(simpleDateFormat1.parse(args[i + 3]));
                        }
                    }
                }
            break;

            case "-d":           // deleting person

                synchronized (allPeople)
                {
                    for (int i = 1; i < args.length; i++)
                    {
                        Person person = allPeople.get(Integer.parseInt(args[i]));

                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
            break;

            case "-i":    //  person

                synchronized (allPeople)
                {
                    for (int ind = 1; ind < args.length; ind++)
                    {
                        int i = Integer.parseInt(args[ind]);

                        String sex = "";

                        if (allPeople.get(i).getSex() == Sex.MALE)
                        {
                            sex = "м";
                        }
                        else if (allPeople.get(i).getSex() == Sex.FEMALE)
                        {
                            sex = "ж";
                        }

                        System.out.println(allPeople.get(i).getName() + " " + sex + " " + simpleDateFormat2.format(allPeople.get(i).getBirthDay()));
                    }
                }
            break;

            default:
                synchronized (allPeople)
                {
                    System.out.println("Invalid data");
                }

        }
    }
}
