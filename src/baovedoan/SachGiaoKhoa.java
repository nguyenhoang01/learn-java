package baovedoan;

public class SachGiaoKhoa extends Sach {
	private String _tinhTrang;
	private int _number;
	private double _thanhTien;

	public SachGiaoKhoa() {
		super();
	}

	public SachGiaoKhoa(String tinhTrang, int number) {
		super();
		_tinhTrang = tinhTrang;
		_number = number;
	}

	public String getTinhTrang() {
		return _tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		_tinhTrang = tinhTrang;
	}

	public int getNumber() {
		return _number;
	}

	public void setNumber(int number) {
		_number = number;
	}

	public String tinhTrangSach(int x) {
		switch (_number) {
		case 0:
			_tinhTrang = "cũ";
			break;
		case 1:
			_tinhTrang = "mới";
			break;
		default:
			break;
		}
		return _tinhTrang;
	}

	public void nhapSach() {
		super.nhapSach();
		System.out.print("Nhập tình trạng sách (0 - cũ/ 1 - mới): ");
		_number = scanner.nextInt();
	}

	public String toString() {
		return super.toString() + ", tình trạng sách: " + this.tinhTrangSach(_number);
	}
}
