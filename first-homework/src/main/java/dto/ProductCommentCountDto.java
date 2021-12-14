package dto;

import java.math.BigDecimal;

public class ProductCommentCountDto {

    private Long urunId;
    private String urunAdi;
    private BigDecimal fiyat;
    private Long yorumSayisi;


    public ProductCommentCountDto() {
    }

    public ProductCommentCountDto(Long urunId) {
        this.urunId = urunId;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public Long getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }
}
