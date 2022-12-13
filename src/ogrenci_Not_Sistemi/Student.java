package ogrenci_Not_Sistemi;

public class Student {
	String name, stuNo;
	int classes;
	double mat;
	double fizik;
	double kimya;
	Course matSoz;
	Course matFin;
	Course fizikSoz;
	Course fizikFin;
	Course kimyaSoz;
	Course kimyaFin;
	double avarage;
	boolean isPass;

	Student(String name, int classes, String stuNo, Course matSoz, Course matFin, Course fizikSoz, Course fizikFin,
			Course kimyaSoz, Course kimyaFin) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.matSoz = matSoz;
		this.matFin = matFin;
		this.fizikSoz = fizikSoz;
		this.fizikFin = fizikFin;
		this.kimyaSoz = kimyaSoz;
		this.kimyaFin = kimyaFin;
		calcAvarage();
		this.isPass = false;
	}

	public void addBulkExamNote(int matSoz, int fizikSoz, int kimyaSoz, int matFin, int fizikFin, int kimyaFin) {

		if (matSoz >= 0 && matSoz <= 100) {
			this.matSoz.sozlu = (matSoz * 0.20);
		}

		if (fizikSoz >= 0 && fizikSoz <= 100) {
			this.fizikSoz.sozlu = (fizikSoz * 0.20);
		}
		if (kimyaSoz >= 0 && kimyaSoz <= 100) {
			this.kimyaSoz.sozlu = (kimyaSoz * 0.20);
		}

		if (matFin >= 0 && matFin <= 100) {
			this.matFin.sinav = (matSoz * 0.80);
		}
		if (fizikFin >= 0 && fizikFin <= 100) {
			this.fizikFin.sinav = (fizikFin * 0.80);
		}
		if (kimyaFin >= 0 && kimyaFin <= 100) {
			this.kimyaFin.sinav = (kimyaFin * 0.80);
		}

	}

	public void calcAvarage() {
		this.mat = this.matSoz.sozlu + this.matFin.sinav;
		this.fizik = this.fizikSoz.sozlu + this.fizikFin.sinav;
		this.kimya = this.kimyaSoz.sozlu + this.kimyaFin.sinav;

		this.avarage = (this.fizik + this.kimya + this.mat) / 3;
	}

	public void isPass() {
		if (this.matSoz.sozlu == 0 || this.fizikSoz.sozlu == 0 || this.kimyaSoz.sozlu == 0 || this.matFin.sinav == 0
				|| this.fizikFin.sinav == 0 || this.kimyaFin.sinav == 0) {
			System.out.println("Notlar tam olarak girilmemiş");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama : " + this.avarage);
			if (this.isPass) {
				System.out.println("Sınıfı Geçti. ");
			} else {
				System.out.println("Sınıfta Kaldı.");
			}
		}
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println("=========================");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik Notu : " + (int) this.mat);
		System.out.println("Fizik Notu : " + (int) this.fizik);
		System.out.println("Kimya Notu : " + (int) this.kimya);
	}
}
