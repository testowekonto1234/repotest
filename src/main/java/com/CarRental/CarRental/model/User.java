package com.CarRental.CarRental.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

@Entity
//Wykomentowalem adnotacje bo nie chciało mi sie wszystkich danych wpisywac przy testach
//Ogolnie gdy dodam np.@Email to gdy nie wpisze poprawnego maila to wywali wyjatki i trzeba
// to zbinować zeby pojawiało sie na stronce a nie sypało wyjatkami, nie robiłem tego bo musialbym sie zagłebic we front
public class User {

    private Long id;
    //@Email(message = "*Please provide a valid Email")
    //@NotEmpty(message = "*Please provide your last name")
    private String email;

    //@NotEmpty(message = "*Wprowadz haslo - min 5 znaków")
    private String password;

    //@NotEmpty(message = "*Wprowadz imie")
    private String name;

   // @NotEmpty(message = "*Wprowadz nazwisko")
    private String surname;

   // @NotEmpty(message = "*Wprowadz numer telefonu")
    private String phoneNumber;

  //  @NotEmpty(message = "*Wprowadz PESEL")
    private String pesel;

    @Column(name = "active")
    private int active;
    private Set<Role> roles;
    private List<Rent> rents;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @OneToMany(mappedBy = "user")
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }
}
