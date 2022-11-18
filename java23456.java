 public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonusAmount;
    double raiseAmount;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (this.salary >= 1000){ // 1000 liradan fazla maaş alanlara yüzde 3 vergi yansıtma
            this.taxAmount = this.salary * 0.03;
        }else
            this.taxAmount = 0; // eğer 1000 liradan az alıyorsa vergisi yok
    }

    void bonus(){
        if(this.workHours > 40)
        {
            this.bonusAmount = 30 * (this.workHours - 40); // 40 saatten fazla çalışıyorsa fazla çalıştığı saati bulup 30 çarpıyoruz.
        }
    }
    int yearWorked = 2021 - this.hireYear; // toplam çalışma yılını buluyoruz

    void raiseSalary(){

        if (yearWorked < 10)
            this.raiseAmount = this.salary * 0.05; // 10 yıldan az çalışmışsa yüzde 5
        else if(yearWorked < 20) // burada 10 dan büyük mü kontrolu yapmıyoruz çünkü 'else if' içerisinde kontrol ettiğimiz için bi önceki if de kontrol ediyor.
            this.raiseAmount = this.salary * 0.1; // 10 yıldan fazla ve 20 yıldan az çalışmış yüzde 10
        else
            this.raiseAmount = this.salary * 0.15; // 20 yıldan fazla çalışmışsa yüzde 15
    }

    public String toString() {
        this.tax();
        this.raiseSalary();
        this.bonus();
        double salaryTaxBonus = this.salary - this.taxAmount + this.bonusAmount;
        double totalSalary = salaryTaxBonus + this.raiseAmount;
        return "Ad: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Yılı: " + this.workHours +
        "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + this.taxAmount + "\nBonus: " + this.bonusAmount +
        "\nMaaş Artışı: " + this.raiseAmount + "\nVergi ve Bonuslar ile birlikte maaş: " + salaryTaxBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}



public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Emre", 2000, 45, 1985);
        System.out.println(emp); // toString komutunu çalıştırır
    }
}
    