package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            String headerLine = bufferedReader.readLine(); //ignore header

            while ((line = bufferedReader.readLine()) != null) {
                //Split it into individual fields using the | character as the delimiter
                String[] fields = line.split(Pattern.quote("|"));

                int employeeId = Integer.parseInt(fields[0]);
                String name = fields[1];
                Double hoursWorked = Double.parseDouble(fields[2]);
                Double payRate = Double.parseDouble(fields[3]);
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.println(employee);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("There was an error reading the transactions file. Check the location of the file.");
        }
    }
}
