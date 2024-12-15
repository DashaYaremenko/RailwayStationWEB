package org.example.railwaystationweb.dataClass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
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

    public Clients() {}

    public Clients(String firstName, String lastName, String typeDoc, String email, String passwordUser, LocalDateTime dataRegistr, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeDoc = typeDoc;
        this.email = email;
        this.passwordUser = passwordUser;
        this.dataRegistr = dataRegistr;
        this.username = username;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getTypeDoc() {return typeDoc;}
    public void setTypeDoc(String typeDoc) {this.typeDoc = typeDoc;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPasswordUser() {return passwordUser;}
    public void setPasswordUser(String passwordUser) {this.passwordUser = passwordUser;}
    public LocalDateTime getDataRegistr() {return dataRegistr;}
    public void setDataRegistr(LocalDateTime dataRegistr) {this.dataRegistr = dataRegistr;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

}
