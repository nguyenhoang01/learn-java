package baovedoan;

import java.util.Scanner;

public class Sach {
	private String _maSach, _nhaXuatBan;
	private double _donGia;
	private int _soLuong;
	Scanner scanner = new Scanner(System.in);

	public Sach() {
		super();
	}

	public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
		super();
		_maSach = maSach;
		_nhaXuatBan = nhaXuatBan;
		_donGia = donGia;
		_soLuong = soLuong;
	}

	public String getMaSach() {
		return _maSach;
	}

	public void setMaSach(String maSach) {
		_maSach = maSach;
	}

	public String getNhaXuatBan() {
		return _nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		_nhaXuatBan = nhaXuatBan;
	}

	public double getDonGia() {
		return _donGia;
	}

	public void setDonGia(double donGia) {
		_donGia = donGia;
	}

	public int getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;
	}

	public void nhapSach() {
		System.out.print("Nhập mã sách: ");
		_maSach = scanner.nextLine();
		System.out.print("Nhập tên nhà xuất bản: ");
		_nhaXuatBan = scanner.nextLine();
		System.out.print("Nhập đơn giá: ");
		_donGia = scanner.nextDouble();
		System.out.print("Nhập số lượng: ");
		_soLuong = scanner.nextInt();
	}

	@Override
	public String toString() {
		return "Mã sách: " + _maSach + ", tên nhà xuất bản: " + _nhaXuatBan + ", đơn giá: " + _donGia + ", số lượng: " + _soLuong;
	}
}
