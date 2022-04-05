package Week4;

public class HourlyEmployee extends Employee implements IPayable{
    private double hourlyRate;
    private double hoursWorked;
    private double pay;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPay() {
        return pay;
    }

    public void calculatePay() {
        this.pay = getHourlyRate()*getHoursWorked();
    }
}
