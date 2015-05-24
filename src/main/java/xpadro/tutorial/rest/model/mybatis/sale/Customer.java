package xpadro.tutorial.rest.model.mybatis.sale;

public class Customer {
    private Integer c_CUSTKEY;

    private String c_NAME;

    private String c_ADDRESS;

    private Integer c_NATIONKEY;

    private String c_PHONE;

    private Double c_ACCTBAL;

    private String c_MKTSEGMENT;

    private String c_COMMENT;

    public Integer getC_CUSTKEY() {
        return c_CUSTKEY;
    }

    public void setC_CUSTKEY(Integer c_CUSTKEY) {
        this.c_CUSTKEY = c_CUSTKEY;
    }

    public String getC_NAME() {
        return c_NAME;
    }

    public void setC_NAME(String c_NAME) {
        this.c_NAME = c_NAME == null ? null : c_NAME.trim();
    }

    public String getC_ADDRESS() {
        return c_ADDRESS;
    }

    public void setC_ADDRESS(String c_ADDRESS) {
        this.c_ADDRESS = c_ADDRESS == null ? null : c_ADDRESS.trim();
    }

    public Integer getC_NATIONKEY() {
        return c_NATIONKEY;
    }

    public void setC_NATIONKEY(Integer c_NATIONKEY) {
        this.c_NATIONKEY = c_NATIONKEY;
    }

    public String getC_PHONE() {
        return c_PHONE;
    }

    public void setC_PHONE(String c_PHONE) {
        this.c_PHONE = c_PHONE == null ? null : c_PHONE.trim();
    }

    public Double getC_ACCTBAL() {
        return c_ACCTBAL;
    }

    public void setC_ACCTBAL(Double c_ACCTBAL) {
        this.c_ACCTBAL = c_ACCTBAL;
    }

    public String getC_MKTSEGMENT() {
        return c_MKTSEGMENT;
    }

    public void setC_MKTSEGMENT(String c_MKTSEGMENT) {
        this.c_MKTSEGMENT = c_MKTSEGMENT == null ? null : c_MKTSEGMENT.trim();
    }

    public String getC_COMMENT() {
        return c_COMMENT;
    }

    public void setC_COMMENT(String c_COMMENT) {
        this.c_COMMENT = c_COMMENT == null ? null : c_COMMENT.trim();
    }
}