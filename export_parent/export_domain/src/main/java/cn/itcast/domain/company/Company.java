package cn.itcast.domain.company;

import lombok.Data;

import java.util.Date;
@Data
public class Company {
    private String id;
    private String name;
    private Date expirationDate;
    private String address;
    private String licenseId;
    private String representative;
    private String phone;
    private String companySize;
    private String industry;
    private String remarks;
    private Integer state;
    private Double balance;
    private String city;
}
