package entity;
    /*
        Id
        Adı(50 char)
        Soyadı(50 char)
        Email(50 char)
        telefon(15 char)
    * */

import javax.persistence.*;

@Entity
@Table(name="KULLANICI")
public class User {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ADI",nullable = false,length = 50)
    private String adi;

    @Column(name = "SOY_ADI",nullable = false,length = 50)
    private String soyadi;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "TELEFON",length = 15)
    private String telefon;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
