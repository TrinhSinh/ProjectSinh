package App;

import java.util.Scanner;

public class Ngay {
	int ngay;
	int thang;
	int nam;

	public Ngay() {
	}

	public Ngay(int ngay, int thang, int nam) {
		super();
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void nhapNgay() {
		Scanner scan = new Scanner(System.in);
		int check = 0;
		do {
			check = 0;
			try {
				System.out.println("Nhap ngay:");
				ngay = Integer.parseInt(scan.nextLine());
				System.out.println("Nhap thang:");
				thang = Integer.parseInt(scan.nextLine());
				System.out.println("Nhap nam:");
				nam=Integer.parseInt(scan.nextLine());
				if (ngay < 0 || thang < 0 || nam < 0) {
					System.out.println("Ngay thang nam khong duoc nho hon 0 .Xin vui laong nhap lai");
					check = 1;
				}
			} catch (Exception e) {
				System.out.println("Ngay thang nam phai la so duong.Xin vui long nhap lai");
				check = 1;
			}

		} while (check == 1);

	}

	public void hien() {
		System.out.println(ngay+"-"+thang+"-"+nam);
	}
	@Override
	public String toString() {
		return ngay+"-"+thang+"-"+nam;
	}
	

}
