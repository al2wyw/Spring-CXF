package xpadro.tutorial.rest.model.mybatis.sale;

public class Region {
    private Integer r_REGIONKEY;

    private String r_NAME;

    private String r_COMMENT;

    public Integer getR_REGIONKEY() {
        return r_REGIONKEY;
    }

    public void setR_REGIONKEY(Integer r_REGIONKEY) {
        this.r_REGIONKEY = r_REGIONKEY;
    }

    public String getR_NAME() {
        return r_NAME;
    }

    public void setR_NAME(String r_NAME) {
        this.r_NAME = r_NAME == null ? null : r_NAME.trim();
    }

    public String getR_COMMENT() {
        return r_COMMENT;
    }

    public void setR_COMMENT(String r_COMMENT) {
        this.r_COMMENT = r_COMMENT == null ? null : r_COMMENT.trim();
    }
}