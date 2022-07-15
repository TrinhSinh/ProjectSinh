package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<SinhVien> sinhViens = new ArrayList<>();
		List<SinhVien> sinhVien_1 = new ArrayList<>();
		int key = 0;
		do {
			System.out.println("Menu");
			System.out.println("0->Thoat chuong trinh");
			System.out.println("1->Them sinh vien");
			System.out.println("2->Sua thong tin sinh vien tim kiem theo ma so");
			System.out.println("3->Xoa Sinh vien theo ma so");
			System.out.println("4->Hien thong tin sinh vien theo ma so");
			System.out.println("5->Hien tat ca sinh vien");
			System.out.println("6->Tuyen sinh ");
			System.out.println("7->Quan ly qua trinh hoc tap duoc chon ");
			System.out.println("Nhap lua chon:");
			key = Integer.parseInt(scan.nextLine());
			switch (key) {
			case 1: {
				if (sinhViens.size() == 0) {
					SinhVien t = new SinhVien();
					t.nhapThongTinSinhVien();
					sinhViens.add(t);
				} else {
					SinhVien t = new SinhVien();
					String m;
					int check = 0;
					do {
						check = 0;
						System.out.println("Nhap ma sinh vien can them:");
						m = scan.nextLine();
						for (int i = 0; i < sinhViens.size(); i++) {
							if (m.equals(sinhViens.get(i).getMaSo())) {
								System.out.println("Ma da ton tai trong he thong nhap lai");
								check = 1;
								break;
							}
						}
					} while (check == 1);
					t.setMaSo(m);
					t.nhapThongTinSinhVien_1();
					sinhViens.add(t);
				}
				break;
			}
			case 2: {
				System.out.println("Nhap ma so sinh vien can sua:");
				String m = scan.nextLine();
				int check = 0;
				for (int i = 0; i < sinhViens.size(); i++) {
					if (sinhViens.get(i).getMaSo().equals(m)) {
						sinhViens.get(i).hienSinhVien();
						int luaChon = 0;
						do {
							System.out.println("0->Thoat");
							System.out.println("1->Sua ten");
							System.out.println("2->Sua ngay sinh");
							System.out.println("3->Sua Dia Chi");
							System.out.println("Nhap lua chon:");
							try {
								luaChon = Integer.parseInt(scan.nextLine());
							} catch (Exception e) {

							}
							switch (luaChon) {
							case 1: {
								System.out.println("Ten cu:" + sinhViens.get(i).getTen());
								System.out.println("Nhap ten moi:");
								String t = scan.nextLine();
								sinhViens.get(i).setTen(t);
								break;
							}
							case 2: {
								System.out.println("Ngay sinh cu:" + sinhViens.get(i).getNgaySinh());
								System.out.println("Nhap ngay sinh moi:");
								Ngay n = new Ngay();
								n.nhapNgay();
								sinhViens.get(i).setNgaySinh(n);
								break;
							}
							case 3: {
								System.out.println("Dia chi cu:" + sinhViens.get(i).getDiaChi());
								System.out.println("Nhap dia chi moi:");
								String d = scan.nextLine();
								sinhViens.get(i).setDiaChi(d);
								break;
							}

							}

						} while (luaChon != 0);
						check = 1;
						break;
					}
				}
				if (check == 0) {
					System.out.println("Khong tim thay ma trong he thong");
				}

				break;
			}
			case 3:{
				System.out.println("Nhap ma sinh vien can xoa:");
				String m=scan.nextLine();
				int check=0;
				for(int i=0;i<sinhViens.size();i++) {
					if(m.equals(sinhViens.get(i).getMaSo())) {
						sinhViens.remove(i);
						check=1;
						System.out.println("Xoa Thanh Cong");
						break;
					}
				}
				if(check==0) {
					System.out.println("Khong tim thay ma trong he thong");
				}
			break;	
			}
			case 4:{
				System.out.println("Nhap ma so tim kiem:");
				String m=scan.nextLine();
				int check=0;
				for(int i=0;i<sinhViens.size();i++) {
					if(m.equals(sinhViens.get(i).getMaSo())){
						sinhViens.get(i).hienSinhVien();
						check=1	;
						break;
					}
				}
				if(check==0){System.out.println("Khong tim thay ma");}
			break;	
			}
			case 5:{
			for(SinhVien o:sinhViens) {
				o.hienSinhVien();
			}
			break;	
			}
			case 6:{
			   System.out.println("Nhap diem can tuyen ,thang diem tu 1 den 10");
			   float d=Float.parseFloat(scan.nextLine());
				for(int i=0;i<sinhViens.size();i++) {
					if(d<=sinhViens.get(i).getDiemDauVao()) {
						sinhVien_1.add(sinhViens.get(i));
					}
				} 
				System.out.println("Da co:"+sinhVien_1.size()+" duoc them vao");
				System.out.println("thong tin cac sinh da duoc them");
				for(SinhVien o: sinhVien_1) {
					o.hienSinhVien();
					System.out.println("-------------------------------------------------------");
				}
			break;	
			}
			case 7:{
				System.out.println("Nhap ma sinh vien can quan ly:");
				String m=scan.nextLine();
				int check=0;
				int s=0;
				for(int i=0;i<sinhVien_1.size();i++) {
					if(m.equals(sinhVien_1.get(i).getMaSo())){
						s=i;
						check=1;
						break;
					}
				}
				if(check==0) {System.out.println("Khong tim thay ma trong he thong");}
				if(check==1) {
				int c=9;
				do {
				System.out.println("0->Thoat");
				System.out.println("1-Them ket qua hoc tap");
				System.out.println("2->Hien ket qua hoc tap");
				System.out.println("3->hien diem trung binh toan bo mon/khoa hoc");
				c=Integer.parseInt(scan.nextLine());
				switch(c) {
				case 1:{
				sinhVien_1.get(s).themKetQuaHocTap();	
				break;	
				}
				case 2:{
				sinhViens.get(s).hienKetQuaHocTap();	
				break;	
				}
				case 3:{
				float diemTrungBinh=sinhVien_1.get(s).tinhDiemTrungBinh();
				System.out.println("Diem trung binh hien tai la:"+diemTrungBinh);	
				break;	
				}
				}// end switch
				}while(c>0&&c<4);
			}
				
			break;	
			}
           
			}// end switch

		} while (key > 0 && key < 8);
	}

}
