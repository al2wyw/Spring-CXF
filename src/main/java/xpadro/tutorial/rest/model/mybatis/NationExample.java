package xpadro.tutorial.rest.model.mybatis;

import java.util.ArrayList;
import java.util.List;

public class NationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationExample() {
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

        public Criteria andN_NATIONKEYIsNull() {
            addCriterion("N_NATIONKEY is null");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYIsNotNull() {
            addCriterion("N_NATIONKEY is not null");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYEqualTo(Integer value) {
            addCriterion("N_NATIONKEY =", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYNotEqualTo(Integer value) {
            addCriterion("N_NATIONKEY <>", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYGreaterThan(Integer value) {
            addCriterion("N_NATIONKEY >", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_NATIONKEY >=", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYLessThan(Integer value) {
            addCriterion("N_NATIONKEY <", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYLessThanOrEqualTo(Integer value) {
            addCriterion("N_NATIONKEY <=", value, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYIn(List<Integer> values) {
            addCriterion("N_NATIONKEY in", values, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYNotIn(List<Integer> values) {
            addCriterion("N_NATIONKEY not in", values, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYBetween(Integer value1, Integer value2) {
            addCriterion("N_NATIONKEY between", value1, value2, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NATIONKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("N_NATIONKEY not between", value1, value2, "n_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_NAMEIsNull() {
            addCriterion("N_NAME is null");
            return (Criteria) this;
        }

        public Criteria andN_NAMEIsNotNull() {
            addCriterion("N_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andN_NAMEEqualTo(String value) {
            addCriterion("N_NAME =", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMENotEqualTo(String value) {
            addCriterion("N_NAME <>", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMEGreaterThan(String value) {
            addCriterion("N_NAME >", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("N_NAME >=", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMELessThan(String value) {
            addCriterion("N_NAME <", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMELessThanOrEqualTo(String value) {
            addCriterion("N_NAME <=", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMELike(String value) {
            addCriterion("N_NAME like", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMENotLike(String value) {
            addCriterion("N_NAME not like", value, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMEIn(List<String> values) {
            addCriterion("N_NAME in", values, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMENotIn(List<String> values) {
            addCriterion("N_NAME not in", values, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMEBetween(String value1, String value2) {
            addCriterion("N_NAME between", value1, value2, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_NAMENotBetween(String value1, String value2) {
            addCriterion("N_NAME not between", value1, value2, "n_NAME");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYIsNull() {
            addCriterion("N_REGIONKEY is null");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYIsNotNull() {
            addCriterion("N_REGIONKEY is not null");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYEqualTo(Integer value) {
            addCriterion("N_REGIONKEY =", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYNotEqualTo(Integer value) {
            addCriterion("N_REGIONKEY <>", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYGreaterThan(Integer value) {
            addCriterion("N_REGIONKEY >", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("N_REGIONKEY >=", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYLessThan(Integer value) {
            addCriterion("N_REGIONKEY <", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYLessThanOrEqualTo(Integer value) {
            addCriterion("N_REGIONKEY <=", value, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYIn(List<Integer> values) {
            addCriterion("N_REGIONKEY in", values, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYNotIn(List<Integer> values) {
            addCriterion("N_REGIONKEY not in", values, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYBetween(Integer value1, Integer value2) {
            addCriterion("N_REGIONKEY between", value1, value2, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_REGIONKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("N_REGIONKEY not between", value1, value2, "n_REGIONKEY");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTIsNull() {
            addCriterion("N_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTIsNotNull() {
            addCriterion("N_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTEqualTo(String value) {
            addCriterion("N_COMMENT =", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTNotEqualTo(String value) {
            addCriterion("N_COMMENT <>", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTGreaterThan(String value) {
            addCriterion("N_COMMENT >", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("N_COMMENT >=", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTLessThan(String value) {
            addCriterion("N_COMMENT <", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("N_COMMENT <=", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTLike(String value) {
            addCriterion("N_COMMENT like", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTNotLike(String value) {
            addCriterion("N_COMMENT not like", value, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTIn(List<String> values) {
            addCriterion("N_COMMENT in", values, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTNotIn(List<String> values) {
            addCriterion("N_COMMENT not in", values, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTBetween(String value1, String value2) {
            addCriterion("N_COMMENT between", value1, value2, "n_COMMENT");
            return (Criteria) this;
        }

        public Criteria andN_COMMENTNotBetween(String value1, String value2) {
            addCriterion("N_COMMENT not between", value1, value2, "n_COMMENT");
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