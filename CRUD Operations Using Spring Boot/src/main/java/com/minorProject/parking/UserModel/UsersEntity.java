package com.minorProject.parking.UserModel;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class UsersEntity {

    @Id
    private String email;

    private String username;
    private String password;

}
