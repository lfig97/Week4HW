package PersonCode;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee se = new SalariedEmployee();
        HourlyEmployee he = new HourlyEmployee();
        Entrepreneur e = new Entrepreneur();

        se.setName("Johnny");
        se.setSalary(40000.00);
        printPay(se);

        he.setName("Mike");
        he.setHourlyRate(20.00);
        he.setHoursWorked(40);
        printPay(he);

        e.setName("Bob");
        e.setIncome("$60,000 yearly");
        printPay(e);

        Employee[] employees = new Employee[]{se, he};
        issueBadge(employees);

    }
    public static void issueBadge(Employee[] employees){
        for(Employee e:employees){
            System.out.println("Employee Badge: "+e.getName());
        }
    }
    public static void printPay(Person p){
        if(p instanceof SalariedEmployee){
            System.out.println(p.getName()+" Salary: $"+((SalariedEmployee) p).getSalary());
        }
        else if (p instanceof HourlyEmployee){
            System.out.println(p.getName()+" Hourly Rate: $"+((HourlyEmployee) p).getHourlyRate());
            System.out.println(p.getName()+" Hours Worked: "+((HourlyEmployee) p).getHoursWorked());
            ((HourlyEmployee) p).calculatePay();
            System.out.println(p.getName()+" Pay: $"+ ((HourlyEmployee) p).getPay());
        }
        else if(p instanceof Entrepreneur){
            System.out.println(p.getName()+" Income: "+((Entrepreneur) p).getIncome());
        }

    }
}
