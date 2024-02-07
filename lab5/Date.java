/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2.lab5;

/**
 *
 * @author rey7s
 */
public class Date {
    private int Day;
    private String Month;
    private int Year;

    public Date(int Day, String Month, int Year) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getDay() {
        return Day;
    }

    public String getMonth() {
        return Month;
    }

    public int getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "Date{" + "Day=" + Day + ", Month=" + Month + ", Year=" + Year + '}';
    }
}
