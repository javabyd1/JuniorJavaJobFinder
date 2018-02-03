package com.sda.juniorjavajobfinder.groupproject.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "job_position")
    private String jobPosition;
    @Column(name = "job_description")
    private String jobDescription;
    private LocalDate date;
    @Column(name = "min_salary")
    private BigDecimal minSalary;
    @Column(name = "max_salary")
    private BigDecimal maxSalary;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    @ManyToOne
    @JoinColumn(name = "devskills_id")
    private Devskills devskills;
    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> applyingUsers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(BigDecimal minSalary) {
        this.minSalary = minSalary;
    }

    public BigDecimal getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(BigDecimal maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Devskills getDevskills() {
        return devskills;
    }

    public void setDevskills(Devskills devskills) {
        this.devskills = devskills;
    }

    public User getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(User recruiter) {
        this.recruiter = recruiter;
    }

    public List<User> getApplyingUsers() {
        return applyingUsers;
    }

    public void setApplyingUsers(List<User> applyingUsers) {
        this.applyingUsers = applyingUsers;
    }
}
