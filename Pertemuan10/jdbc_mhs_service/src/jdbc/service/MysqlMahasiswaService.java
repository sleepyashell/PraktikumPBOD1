/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 * Nama file    : MysqlMahasiswaService.java
 * Deskripsi    : Service class yang berisi operasi CRUD (Create, Read, Update, Delete)
 * Pembuat      : Syuraih Umar Khotthob
 * @author syura
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    /** Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Data berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Data berhasil diperbarui.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Data berhasil dihapus.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try (Statement s = koneksi.createStatement();
             ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                listMhs.add(new Mahasiswa(rs.getInt("id"), rs.getString("nama")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
}