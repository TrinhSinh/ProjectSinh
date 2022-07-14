package App;

import java.util.List;

public class HocTap {
    int hocKi;
    Toan toan;
    Hoa hoa;
    Ly ly;
    public HocTap() {}
	public HocTap(int hocKi, Toan toan, Hoa hoa, Ly ly) {
		super();
		this.hocKi = hocKi;
		this.toan = toan;
		this.hoa = hoa;
		this.ly = ly;
	}
	public int getHocKi() {
		return hocKi;
	}
	public void setHocKi(int hocKi) {
		this.hocKi = hocKi;
	}
	public Toan getToan() {
		return toan;
	}
	public void setToan(Toan toan) {
		this.toan = toan;
	}
	public Hoa getHoa() {
		return hoa;
	}
	public void setHoa(Hoa hoa) {
		this.hoa = hoa;
	}
	public Ly getLy() {
		return ly;
	}
	public void setLy(Ly ly) {
		this.ly = ly;
	}
    public float diemTrungBinh() {
    	return (ly.getDiem()+hoa.getDiem()+toan.getDiem())/3;
    	
    }
}
