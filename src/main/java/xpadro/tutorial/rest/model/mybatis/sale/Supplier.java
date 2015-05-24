package xpadro.tutorial.rest.model.mybatis.sale;

public class Supplier {
    private Integer s_SUPPKEY;

    private String s_NAME;

    private String s_ADDRESS;

    private Integer s_NATIONKEY;

    private String s_PHONE;

    private Double s_ACCTBAL;

    private String s_COMMENT;

    public Integer getS_SUPPKEY() {
        return s_SUPPKEY;
    }

    public void setS_SUPPKEY(Integer s_SUPPKEY) {
        this.s_SUPPKEY = s_SUPPKEY;
    }

    public String getS_NAME() {
        return s_NAME;
    }

    public void setS_NAME(String s_NAME) {
        this.s_NAME = s_NAME == null ? null : s_NAME.trim();
    }

    public String getS_ADDRESS() {
        return s_ADDRESS;
    }

    public void setS_ADDRESS(String s_ADDRESS) {
        this.s_ADDRESS = s_ADDRESS == null ? null : s_ADDRESS.trim();
    }

    public Integer getS_NATIONKEY() {
        return s_NATIONKEY;
    }

    public void setS_NATIONKEY(Integer s_NATIONKEY) {
        this.s_NATIONKEY = s_NATIONKEY;
    }

    public String getS_PHONE() {
        return s_PHONE;
    }

    public void setS_PHONE(String s_PHONE) {
        this.s_PHONE = s_PHONE == null ? null : s_PHONE.trim();
    }

    public Double getS_ACCTBAL() {
        return s_ACCTBAL;
    }

    public void setS_ACCTBAL(Double s_ACCTBAL) {
        this.s_ACCTBAL = s_ACCTBAL;
    }

    public String getS_COMMENT() {
        return s_COMMENT;
    }

    public void setS_COMMENT(String s_COMMENT) {
        this.s_COMMENT = s_COMMENT == null ? null : s_COMMENT.trim();
    }
}