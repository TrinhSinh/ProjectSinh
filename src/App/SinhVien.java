/**
 * 
 */
package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class SinhVien {
     String maSo;
     Ngay ngaySinh;
     String ten;
     String diaChi;
     float diemDauVao;
     List<HocTap> hocTap;
	 public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSo, Ngay ngaySinh, String ten, String diaChi, float diemDauVao, List<HocTap> hocTap) {
		super();
		this.maSo = maSo;
		this.ngaySinh = ngaySinh;
		this.ten = ten;
		this.diaChi = diaChi;
		this.diemDauVao = diemDauVao;
		this.hocTap = hocTap;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public Ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public float getDiemDauVao() {
		return diemDauVao;
	}
	public void setDiemDauVao(float diemDauVao) {
		this.diemDauVao = diemDauVao;
	}
	public List<HocTap> getHocTap() {
		return hocTap;
	}
	public void setHocTap(List<HocTap> hocTap) {
		this.hocTap = hocTap;
	}
	public void hienSinhVien() {
		System.out.println("Ma so:"+maSo);
		System.out.println("Ten:"+ten);
		System.out.println("Ngay sinh:"+ngaySinh);
		System.out.println("Dia chi:"+diaChi);
		System.out.println("Diem dau vao:"+diemDauVao);	
	}
	public void nhapThongTinSinhVien() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Nhap ma so:");
		maSo=scan.nextLine();
		System.out.println("Nhap ten:");
		ten=scan.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaySinh=new Ngay();
		ngaySinh.nhapNgay();
		System.out.println("Nhap dia chi:");
		diaChi=scan.nextLine();
		System.out.println("Nhap diem dau vao thang diem tu 1 den 10:");
		diemDauVao=Float.parseFloat(scan.nextLine());
		hocTap=new ArrayList<>();
	}
	public void themKetQuaHocTap() {
		Scanner scan=new Scanner(System.in);
		HocTap t1=new HocTap();
		int check=0;
		do {
		try {
			System.out.println("Bai kiem tra so:");
			int so=Integer.parseInt(scan.nextLine());
			System.out.println("nhap diem kiem tra mon toan:");
			float toan=Float.parseFloat(scan.nextLine());
			System.out.println("Nhap diem kiem tra mon ly:");
			float ly=Float.parseFloat(scan.nextLine());
			System.out.println("Nhap diem kiem tra mon hoa:");
			float hoa=Float.parseFloat(scan.nextLine());
			t1.setHocKi(so);
			t1.hoa=new Hoa(hoa);
			t1.ly=new Ly(ly);
			t1.toan=new Toan(toan);
			check=1;
		}catch (Exception e) {
			System.out.println("Co loi xay ra vui long nhap lai");
			check=2;
		}}while(check==2);
		hocTap.add(t1);
	}
	public float tinhDiemTrungBinh() {
		float diemTrungBinh;
		int tb=hocTap.size();
		float tong=0;
		for(int i=0;i<hocTap.size();i++) {
			tong=tong+hocTap.get(i).diemTrungBinh();
		}
		return tong/tb;
	}
	public void hienKetQuaHocTap() {
		System.out.println("Ma sinh vien:"+maSo+"   |   "  +"Ten: "+ten);
		for(int i=0;i<hocTap.size();i++) {
			System.out.println("Bai kiem tra so:"+hocTap.get(i).getHocKi());
			System.out.println("Toan:"+hocTap.get(i).getToan().getDiem()+"    "+
					            "Ly:"+hocTap.get(i).getLy().getDiem()+"    "
					             +"Hoa:"+hocTap.get(i).getHoa().getDiem());
			System.out.println("---------------------------------------------------------");
		}
	}
	public void nhapThongTinSinhVien_1() {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Nhap ten:");
		ten=scan.nextLine();
		System.out.println("Nhap ngay sinh:");
		ngaySinh=new Ngay();
		ngaySinh.nhapNgay();
		System.out.println("Nhap dia chi:");
		diaChi=scan.nextLine();
		System.out.println("Nhap diem dau vao:");
		diemDauVao=Float.parseFloat(scan.nextLine());
		hocTap=new ArrayList<>();
	}
	
}
