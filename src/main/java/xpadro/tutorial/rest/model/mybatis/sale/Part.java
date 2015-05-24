package xpadro.tutorial.rest.model.mybatis.sale;

public class Part {
    private Integer p_PARTKEY;

    private String p_NAME;

    private String p_MFGR;

    private String p_BRAND;

    private String p_TYPE;

    private Integer p_SIZE;

    private String p_CONTAINER;

    private Double p_RETAILPRICE;

    private String p_COMMENT;

    public Integer getP_PARTKEY() {
        return p_PARTKEY;
    }

    public void setP_PARTKEY(Integer p_PARTKEY) {
        this.p_PARTKEY = p_PARTKEY;
    }

    public String getP_NAME() {
        return p_NAME;
    }

    public void setP_NAME(String p_NAME) {
        this.p_NAME = p_NAME == null ? null : p_NAME.trim();
    }

    public String getP_MFGR() {
        return p_MFGR;
    }

    public void setP_MFGR(String p_MFGR) {
        this.p_MFGR = p_MFGR == null ? null : p_MFGR.trim();
    }

    public String getP_BRAND() {
        return p_BRAND;
    }

    public void setP_BRAND(String p_BRAND) {
        this.p_BRAND = p_BRAND == null ? null : p_BRAND.trim();
    }

    public String getP_TYPE() {
        return p_TYPE;
    }

    public void setP_TYPE(String p_TYPE) {
        this.p_TYPE = p_TYPE == null ? null : p_TYPE.trim();
    }

    public Integer getP_SIZE() {
        return p_SIZE;
    }

    public void setP_SIZE(Integer p_SIZE) {
        this.p_SIZE = p_SIZE;
    }

    public String getP_CONTAINER() {
        return p_CONTAINER;
    }

    public void setP_CONTAINER(String p_CONTAINER) {
        this.p_CONTAINER = p_CONTAINER == null ? null : p_CONTAINER.trim();
    }

    public Double getP_RETAILPRICE() {
        return p_RETAILPRICE;
    }

    public void setP_RETAILPRICE(Double p_RETAILPRICE) {
        this.p_RETAILPRICE = p_RETAILPRICE;
    }

    public String getP_COMMENT() {
        return p_COMMENT;
    }

    public void setP_COMMENT(String p_COMMENT) {
        this.p_COMMENT = p_COMMENT == null ? null : p_COMMENT.trim();
    }
}