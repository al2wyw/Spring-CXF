package xpadro.tutorial.rest.model.mybatis.sale;

import java.util.ArrayList;
import java.util.List;

public class RegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andR_REGIONKEYIsNull() {
            addCriterion("R_REGIONKEY is null");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYIsNotNull() {
            addCriterion("R_REGIONKEY is not null");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYEqualTo(Integer value) {
            addCriterion("R_REGIONKEY =", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYNotEqualTo(Integer value) {
            addCriterion("R_REGIONKEY <>", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYGreaterThan(Integer value) {
            addCriterion("R_REGIONKEY >", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("R_REGIONKEY >=", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYLessThan(Integer value) {
            addCriterion("R_REGIONKEY <", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYLessThanOrEqualTo(Integer value) {
            addCriterion("R_REGIONKEY <=", value, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYIn(List<Integer> values) {
            addCriterion("R_REGIONKEY in", values, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYNotIn(List<Integer> values) {
            addCriterion("R_REGIONKEY not in", values, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYBetween(Integer value1, Integer value2) {
            addCriterion("R_REGIONKEY between", value1, value2, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_REGIONKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("R_REGIONKEY not between", value1, value2, "r_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andR_NAMEIsNull() {
            addCriterion("R_NAME is null");
            return (Criteria) this;
        }

        public Criteria andR_NAMEIsNotNull() {
            addCriterion("R_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andR_NAMEEqualTo(String value) {
            addCriterion("R_NAME =", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMENotEqualTo(String value) {
            addCriterion("R_NAME <>", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMEGreaterThan(String value) {
            addCriterion("R_NAME >", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("R_NAME >=", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMELessThan(String value) {
            addCriterion("R_NAME <", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMELessThanOrEqualTo(String value) {
            addCriterion("R_NAME <=", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMELike(String value) {
            addCriterion("R_NAME like", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMENotLike(String value) {
            addCriterion("R_NAME not like", value, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMEIn(List<String> values) {
            addCriterion("R_NAME in", values, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMENotIn(List<String> values) {
            addCriterion("R_NAME not in", values, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMEBetween(String value1, String value2) {
            addCriterion("R_NAME between", value1, value2, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_NAMENotBetween(String value1, String value2) {
            addCriterion("R_NAME not between", value1, value2, "r_NAME");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTIsNull() {
            addCriterion("R_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTIsNotNull() {
            addCriterion("R_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTEqualTo(String value) {
            addCriterion("R_COMMENT =", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTNotEqualTo(String value) {
            addCriterion("R_COMMENT <>", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTGreaterThan(String value) {
            addCriterion("R_COMMENT >", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("R_COMMENT >=", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTLessThan(String value) {
            addCriterion("R_COMMENT <", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("R_COMMENT <=", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTLike(String value) {
            addCriterion("R_COMMENT like", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTNotLike(String value) {
            addCriterion("R_COMMENT not like", value, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTIn(List<String> values) {
            addCriterion("R_COMMENT in", values, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTNotIn(List<String> values) {
            addCriterion("R_COMMENT not in", values, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTBetween(String value1, String value2) {
            addCriterion("R_COMMENT between", value1, value2, "r_COMMENT");
            return (Criteria) this;
        }

        public Criteria andR_COMMENTNotBetween(String value1, String value2) {
            addCriterion("R_COMMENT not between", value1, value2, "r_COMMENT");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}