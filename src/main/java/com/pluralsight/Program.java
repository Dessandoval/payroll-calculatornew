package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {

        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.csv"))){

            String line;
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(Pattern.quote("|"));

                int employeeId = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hours = Double.parseDouble(fields[2]);
                double payRate = Double.parseDouble(fields[3]);
                Employee employee = new Employee(employeeId, name, hours, payRate);
                System.out.printf("Id: %d  Name: %s  Gross Pay: $%.2f%n", employee.getEmployeeId(), employee.getName(), employee.calcuateGrossPay());
            }
        } catch (IOException e) {
            System.out.println("There was an error reading the transactions file.");
        }


    }
}
