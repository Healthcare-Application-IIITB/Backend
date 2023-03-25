package com.example.backend.Bean;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id", nullable = false)
    private int id;

    @Column(name="Fname")
    private String fname;

    @Column(name="Lname")
    private String lname;

    @Column(name="DOB")
    private Date DOB;

    @Column(name="Sex")
    private char sex;

    @Column(name="Specialization")
    private String specialization;

    @Column(name="Qualification")
    private String qualification;

    @Column(name="Description")
    private String description;

    @Column(name="Rating")
    private int rating;

    @Column(name="AvailableTimings")
    private String available_timings;

    @Column(name="City")
    private String city;

    @Column(name="State")
    private String state;

    @Column(name="ClinicAddress")
    private String clinic_address;

    @Column(name="PhotoUrl")
    private String photo_url;

    @Column(name="OnlineStatus")
    private boolean online_status;

    @Column(name="ChannelName")
    private String channel_name;

    @Column(name="Token")
    private String token;

    @Column(name="UserName")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="Email")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "doctor_roles",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAvailable_timings() {
        return available_timings;
    }

    public void setAvailable_timings(String available_timings) {
        this.available_timings = available_timings;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getClinic_address() {
        return clinic_address;
    }

    public void setClinic_address(String clinic_address) {
        this.clinic_address = clinic_address;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public boolean isOnline_status() {
        return online_status;
    }

    public void setOnline_status(boolean online_status) {
        this.online_status = online_status;
    }

    public Doctor(String fname, String lname, Date DOB, char sex, String channel_name, String specialization, String qualification, String description, int rating, String available_timimgs, String city, String state, String clinic_address, String photo_url, boolean online_status, String userName, String password, String email, String token) {
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
        this.sex = sex;
        this.specialization = specialization;
        this.qualification = qualification;
        this.description = description;
        this.rating = rating;
        this.available_timings = available_timimgs;
        this.city = city;
        this.state = state;
        this.clinic_address = clinic_address;
        this.photo_url = photo_url;
        this.online_status = online_status;
        this.channel_name = channel_name;
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.token = token;
    }

    public Doctor() {
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}