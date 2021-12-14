package entity;

import javax.persistence.*;
import java.util.Date;

/*
    Id
    Yorum(500 char)
    yorumTarihi (date)
    urunId
    kullaniciId
*/
@Entity
@Table(name = "URUNYORUM")
public class ProductComment {
        @SequenceGenerator(name = "generator", sequenceName = "URUN_YORUM_ID_SEQ")
        @Id
        @GeneratedValue(generator = "generator")
        @Column(name = "ID")
        private Long id;

        @Column(name = "YORUM",length = 500)
        private String yorum;

        @Column(name = "YORUM_TARIHI")
        @Temporal(TemporalType.TIMESTAMP)
        private Date yorumTarihi;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_URUN",
                foreignKey = @ForeignKey(name = "FK_URUN_ID")
        )
        private Product product;


        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_KULLANICI",
                foreignKey = @ForeignKey(name = "FK_KULLANICI_ID")
        )
        private User user;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getYorum() {
                return yorum;
        }

        public void setYorum(String yorum) {
                this.yorum = yorum;
        }

        public Date getYorumTarihi() {
                return yorumTarihi;
        }

        public void setYorumTarihi(Date yorumTarihi) {
                this.yorumTarihi = yorumTarihi;
        }

        public Product getProduct() {
                return product;
        }

        public void setProduct(Product product) {
                this.product = product;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }
}
