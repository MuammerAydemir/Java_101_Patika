package maas_Calculator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		double vergi;
		if (this.salary > 0 && this.salary > 1000) {
			vergi = this.salary * 0.03;
		} else {
			vergi = 0;
		}
		return vergi;
	}

	public double bonus() {
		double bonus;
		if (this.workHours > 40)
			bonus = ((this.workHours % 40) * 30);
		else
			bonus = 0;
		return bonus;
	}

	public double raiseSalary() {
		double rSalary;
		int year = 2021;
		int fark = year - this.hireYear;
		if (fark < 10) {
			rSalary = (this.salary * 0.05);
		} else if (fark > 9 && fark < 20) {
			rSalary = (this.salary * 0.10);
		} else if (fark > 19) {
			rSalary = (this.salary * 0.15);
		} else
			rSalary = 0;
		return rSalary;
	}

	public String toString() {
		return "Adı\t: " + this.name + "\n" + 
				"Maaşı\t: " + this.salary + "\n" + 
				"Çalışma Saati\t: " + this.workHours+ "\n" + 
				"Başlangıç Yılı\t: " + this.hireYear + "\n" + 
				"Vergi\t: " + tax() + "\n" + 
				"Bonus\t: "+ bonus() + "\n" + 
				"Maaş Artışı\t: " + raiseSalary() + "\n" + 
				"Vergi ve Bonuslar ile birlikte maaş\t: "+ (this.salary + (-tax() + bonus())) + "\n" + 
				"Toplam Maaş\t: "+ (this.salary + (-tax() + bonus() + raiseSalary()));
	}

}
