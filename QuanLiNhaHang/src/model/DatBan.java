/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import View.DatBan.DatBan_NguoiDaiDien;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ACER
 */
public class DatBan {
    private String name_352, phone_352, role_352, address_352, dob_352, request_352, gender_352 ;
 

    public DatBan(String name_352, String phone_352, String role_352, String address_352, String dob_352, String request_352, String gender_352) {
        this.name_352 = name_352;
        this.phone_352 = phone_352;
        this.role_352 = role_352;
        this.address_352 = address_352;
        this.dob_352 = dob_352;
        this.request_352 = request_352;
        this.gender_352 = gender_352;
    }

    public DatBan() {
        
    }

    public String getName_352() {
        return name_352;
    }

    public void setName_352(String name_352) {
        this.name_352 = name_352;
    }

    public String getPhone_352() {
        return phone_352;
    }

    public void setPhone_352(String phone_352) {
        this.phone_352 = phone_352;
    }

    public String getRole_352() {
        return role_352;
    }

    public void setRole_352(String role_352) {
        this.role_352 = role_352;
    }

    public String getAddress_352() {
        return address_352;
    }

    public void setAddress_352(String address_352) {
        this.address_352 = address_352;
    }

    public String getDob_352() {
        return dob_352;
    }

    public void setDob_352(String dob_352) {
        this.dob_352 = dob_352;
    }

    public String getRequest_352() {
        return request_352;
    }

    public void setRequest_352(String request_352) {
        this.request_352 = request_352;
    }

    public String getGender_352() {
        return gender_352;
    }

    public void setGender_352(String gender_352) {
        this.gender_352 = gender_352;
    }
    
}
