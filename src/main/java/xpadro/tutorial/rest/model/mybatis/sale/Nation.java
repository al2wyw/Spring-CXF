package xpadro.tutorial.rest.model.mybatis.sale;

public class Nation {
    private Integer n_NATIONKEY;

    private String n_NAME;

    private Integer n_REGIONKEY;

    private String n_COMMENT;

    public Integer getN_NATIONKEY() {
        return n_NATIONKEY;
    }

    public void setN_NATIONKEY(Integer n_NATIONKEY) {
        this.n_NATIONKEY = n_NATIONKEY;
    }

    public String getN_NAME() {
        return n_NAME;
    }

    public void setN_NAME(String n_NAME) {
        this.n_NAME = n_NAME == null ? null : n_NAME.trim();
    }

    public Integer getN_REGIONKEY() {
        return n_REGIONKEY;
    }

    public void setN_REGIONKEY(Integer n_REGIONKEY) {
        this.n_REGIONKEY = n_REGIONKEY;
    }

    public String getN_COMMENT() {
        return n_COMMENT;
    }

    public void setN_COMMENT(String n_COMMENT) {
        this.n_COMMENT = n_COMMENT == null ? null : n_COMMENT.trim();
    }
}