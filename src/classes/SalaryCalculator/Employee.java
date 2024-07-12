package classes.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,double salary, int workHours, int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
    }


    double tax(){
        if(salary < 1000){
            return 0;
        }

        return salary * 0.03;
    }

    int bonus(){
        if(workHours> 40){
            return (workHours -40) * 30;
        }
        return 0;
    }

    double raiseSalary(){
        if(2021 - hireYear > 19){
            return salary * 0.15;
        }else if(2021 - hireYear > 9){
            return  salary * 0.10;
        }else if(2021 - hireYear < 10){
            return  salary * 0.5;
        }

        return 0;
    }

    void writeEmployeeInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Toplam maaş: " + (this.salary - tax() + bonus() + raiseSalary()));
    }

}
