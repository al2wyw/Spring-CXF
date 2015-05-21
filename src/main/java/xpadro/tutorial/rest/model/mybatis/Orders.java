package xpadro.tutorial.rest.model.mybatis;

import java.util.Date;

public class Orders {
    private Integer o_ORDERKEY;

    private Integer o_CUSTKEY;

    private String o_ORDERSTATUS;

    private Double o_TOTALPRICE;

    private Date o_ORDERDATE;

    private String o_ORDERPRIORITY;

    private String o_CLERK;

    private Integer o_SHIPPRIORITY;

    private String o_COMMENT;

    public Integer getO_ORDERKEY() {
        return o_ORDERKEY;
    }

    public void setO_ORDERKEY(Integer o_ORDERKEY) {
        this.o_ORDERKEY = o_ORDERKEY;
    }

    public Integer getO_CUSTKEY() {
        return o_CUSTKEY;
    }

    public void setO_CUSTKEY(Integer o_CUSTKEY) {
        this.o_CUSTKEY = o_CUSTKEY;
    }

    public String getO_ORDERSTATUS() {
        return o_ORDERSTATUS;
    }

    public void setO_ORDERSTATUS(String o_ORDERSTATUS) {
        this.o_ORDERSTATUS = o_ORDERSTATUS == null ? null : o_ORDERSTATUS.trim();
    }

    public Double getO_TOTALPRICE() {
        return o_TOTALPRICE;
    }

    public void setO_TOTALPRICE(Double o_TOTALPRICE) {
        this.o_TOTALPRICE = o_TOTALPRICE;
    }

    public Date getO_ORDERDATE() {
        return o_ORDERDATE;
    }

    public void setO_ORDERDATE(Date o_ORDERDATE) {
        this.o_ORDERDATE = o_ORDERDATE;
    }

    public String getO_ORDERPRIORITY() {
        return o_ORDERPRIORITY;
    }

    public void setO_ORDERPRIORITY(String o_ORDERPRIORITY) {
        this.o_ORDERPRIORITY = o_ORDERPRIORITY == null ? null : o_ORDERPRIORITY.trim();
    }

    public String getO_CLERK() {
        return o_CLERK;
    }

    public void setO_CLERK(String o_CLERK) {
        this.o_CLERK = o_CLERK == null ? null : o_CLERK.trim();
    }

    public Integer getO_SHIPPRIORITY() {
        return o_SHIPPRIORITY;
    }

    public void setO_SHIPPRIORITY(Integer o_SHIPPRIORITY) {
        this.o_SHIPPRIORITY = o_SHIPPRIORITY;
    }

    public String getO_COMMENT() {
        return o_COMMENT;
    }

    public void setO_COMMENT(String o_COMMENT) {
        this.o_COMMENT = o_COMMENT == null ? null : o_COMMENT.trim();
    }
}