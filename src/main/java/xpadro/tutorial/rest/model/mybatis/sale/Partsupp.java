package xpadro.tutorial.rest.model.mybatis.sale;

public class Partsupp extends PartsuppKey {
    private Integer PS_AVAILQTY;

    private Double PS_SUPPLYCOST;

    private String PS_COMMENT;

    public Integer getPS_AVAILQTY() {
        return PS_AVAILQTY;
    }

    public void setPS_AVAILQTY(Integer PS_AVAILQTY) {
        this.PS_AVAILQTY = PS_AVAILQTY;
    }

    public Double getPS_SUPPLYCOST() {
        return PS_SUPPLYCOST;
    }

    public void setPS_SUPPLYCOST(Double PS_SUPPLYCOST) {
        this.PS_SUPPLYCOST = PS_SUPPLYCOST;
    }

    public String getPS_COMMENT() {
        return PS_COMMENT;
    }

    public void setPS_COMMENT(String PS_COMMENT) {
        this.PS_COMMENT = PS_COMMENT == null ? null : PS_COMMENT.trim();
    }
}