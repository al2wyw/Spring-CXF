package xpadro.tutorial.rest.model.mybatis;

import java.util.Date;

public class Lineitem extends LineitemKey {
    private Integer l_PARTKEY;

    private Integer l_SUPPKEY;

    private Double l_QUANTITY;

    private Double l_EXTENDEDPRICE;

    private Double l_DISCOUNT;

    private Double l_TAX;

    private String l_RETURNFLAG;

    private String l_LINESTATUS;

    private Date l_SHIPDATE;

    private Date l_COMMITDATE;

    private Date l_RECEIPTDATE;

    private String l_SHIPINSTRUCT;

    private String l_SHIPMODE;

    private String l_COMMENT;

    public Integer getL_PARTKEY() {
        return l_PARTKEY;
    }

    public void setL_PARTKEY(Integer l_PARTKEY) {
        this.l_PARTKEY = l_PARTKEY;
    }

    public Integer getL_SUPPKEY() {
        return l_SUPPKEY;
    }

    public void setL_SUPPKEY(Integer l_SUPPKEY) {
        this.l_SUPPKEY = l_SUPPKEY;
    }

    public Double getL_QUANTITY() {
        return l_QUANTITY;
    }

    public void setL_QUANTITY(Double l_QUANTITY) {
        this.l_QUANTITY = l_QUANTITY;
    }

    public Double getL_EXTENDEDPRICE() {
        return l_EXTENDEDPRICE;
    }

    public void setL_EXTENDEDPRICE(Double l_EXTENDEDPRICE) {
        this.l_EXTENDEDPRICE = l_EXTENDEDPRICE;
    }

    public Double getL_DISCOUNT() {
        return l_DISCOUNT;
    }

    public void setL_DISCOUNT(Double l_DISCOUNT) {
        this.l_DISCOUNT = l_DISCOUNT;
    }

    public Double getL_TAX() {
        return l_TAX;
    }

    public void setL_TAX(Double l_TAX) {
        this.l_TAX = l_TAX;
    }

    public String getL_RETURNFLAG() {
        return l_RETURNFLAG;
    }

    public void setL_RETURNFLAG(String l_RETURNFLAG) {
        this.l_RETURNFLAG = l_RETURNFLAG == null ? null : l_RETURNFLAG.trim();
    }

    public String getL_LINESTATUS() {
        return l_LINESTATUS;
    }

    public void setL_LINESTATUS(String l_LINESTATUS) {
        this.l_LINESTATUS = l_LINESTATUS == null ? null : l_LINESTATUS.trim();
    }

    public Date getL_SHIPDATE() {
        return l_SHIPDATE;
    }

    public void setL_SHIPDATE(Date l_SHIPDATE) {
        this.l_SHIPDATE = l_SHIPDATE;
    }

    public Date getL_COMMITDATE() {
        return l_COMMITDATE;
    }

    public void setL_COMMITDATE(Date l_COMMITDATE) {
        this.l_COMMITDATE = l_COMMITDATE;
    }

    public Date getL_RECEIPTDATE() {
        return l_RECEIPTDATE;
    }

    public void setL_RECEIPTDATE(Date l_RECEIPTDATE) {
        this.l_RECEIPTDATE = l_RECEIPTDATE;
    }

    public String getL_SHIPINSTRUCT() {
        return l_SHIPINSTRUCT;
    }

    public void setL_SHIPINSTRUCT(String l_SHIPINSTRUCT) {
        this.l_SHIPINSTRUCT = l_SHIPINSTRUCT == null ? null : l_SHIPINSTRUCT.trim();
    }

    public String getL_SHIPMODE() {
        return l_SHIPMODE;
    }

    public void setL_SHIPMODE(String l_SHIPMODE) {
        this.l_SHIPMODE = l_SHIPMODE == null ? null : l_SHIPMODE.trim();
    }

    public String getL_COMMENT() {
        return l_COMMENT;
    }

    public void setL_COMMENT(String l_COMMENT) {
        this.l_COMMENT = l_COMMENT == null ? null : l_COMMENT.trim();
    }
}