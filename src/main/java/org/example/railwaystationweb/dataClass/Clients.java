package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
@Getter
@Setter
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "TypeDoc")
    private String typeDoc;

    @Column(name = "Email")
    private String email;

    @Column(name = "PasswordUser")
    private String passwordUser;

    @Column(name = "DataRegistr")
    private LocalDateTime dataRegistr;

    @Column(name = "Username")
    private String username;

}
