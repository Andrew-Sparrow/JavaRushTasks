package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution
{


    public static void main(String[] args)
    {

    }

    public static class PersonScannerAdapter implements PersonScanner
    {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner)
        {
            this.fileScanner = scanner ;
        }

        @Override
        public Person read() throws IOException, ParseException
        {
            String linePerson = fileScanner.nextLine();

            String[] linePersonSplitted = linePerson.split("\\s+");

            String lastName = linePersonSplitted[0];
            String firstName = linePersonSplitted[1];
            String middleName  = linePersonSplitted[2];

            int day = Integer.parseInt(linePersonSplitted[3]);
            int month = Integer.parseInt(linePersonSplitted[4]);
            int year = Integer.parseInt(linePersonSplitted[5]);

            String pattern = "dd MM yyyy";

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern );

            Date birthDate = simpleDateFormat.parse(day + " " + (month) + " " + year );

            Person person = new Person(firstName, middleName, lastName, birthDate);

            return person;
        }

        @Override
        public void close() throws IOException
        {
            this.fileScanner.close();
        }
    }
}
