package baovedoan;

public class SachThamKhao extends Sach {
	private double _thue, _thanhTien;

	public SachThamKhao() {
		super();
	}

	public SachThamKhao(double thue) {
		super();
		_thue = thue;
	}

	public double getThue() {
		return _thue;
	}

	public void setThue(double thue) {
		_thue = thue;
	}

	public void nhapSach() {
		super.nhapSach();
		System.out.print("Nhập thuế: ");
		_thue = scanner.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + ", thuế: " + _thue;

	}
}
