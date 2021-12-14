package entity;

import javax.persistence.*;

/**
 * id
 * adi
 * kirilim
 * ustKategoriId
 */
@Entity
@Table(name = "KATEGORI")
public class Kategory {

    @SequenceGenerator(name = "generator", sequenceName = "KATEGORI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name = "KIRILIM")
    private Long kirilim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UST_KATEGORI")
    private Kategory ustKategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kategory getUstKategori() {
        return ustKategory;
    }

    public void setUstKategori(Kategory ustKategory) {
        this.ustKategory = ustKategory;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Long getKirilim() {
        return kirilim;
    }

    public void setKirilim(Long kirilim) {
        this.kirilim = kirilim;
    }

    @Override
    public String toString() {
        return "Kategori{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", kirilim=" + kirilim +
                ", ustKategori=" + ustKategory +
                '}';
    }
}
