/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjuneexam.models;

/**
 *
 * @author alvaro
 */
public class Teachers extends Person {

    private int timeService;
    private double salary;

    public int getTimeService() {
        return timeService;
    }

    public void setTimeService(int timeService) {
        this.timeService = timeService;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teachers(int timeService, double salary, String name, String surname, String dni) {
        super(name, surname, dni);
        this.timeService = timeService;
        this.salary = salary;
    }

}
