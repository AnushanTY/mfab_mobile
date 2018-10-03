package com.mfab_mobile.entity;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "useremail")
    private String useremail;

    @Column(name = "phonenumber")
    private String phonenumber;




    public void setName(String name) {
        this.name = name;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUseremail() {
        return useremail;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}
