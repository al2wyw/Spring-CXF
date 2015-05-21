package xpadro.tutorial.rest.model.mybatis;

import java.util.ArrayList;
import java.util.List;

public class PartsuppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartsuppExample() {
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

        public Criteria andPS_PARTKEYIsNull() {
            addCriterion("PS_PARTKEY is null");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYIsNotNull() {
            addCriterion("PS_PARTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYEqualTo(Integer value) {
            addCriterion("PS_PARTKEY =", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYNotEqualTo(Integer value) {
            addCriterion("PS_PARTKEY <>", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYGreaterThan(Integer value) {
            addCriterion("PS_PARTKEY >", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_PARTKEY >=", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYLessThan(Integer value) {
            addCriterion("PS_PARTKEY <", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYLessThanOrEqualTo(Integer value) {
            addCriterion("PS_PARTKEY <=", value, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYIn(List<Integer> values) {
            addCriterion("PS_PARTKEY in", values, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYNotIn(List<Integer> values) {
            addCriterion("PS_PARTKEY not in", values, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYBetween(Integer value1, Integer value2) {
            addCriterion("PS_PARTKEY between", value1, value2, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_PARTKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_PARTKEY not between", value1, value2, "PS_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYIsNull() {
            addCriterion("PS_SUPPKEY is null");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYIsNotNull() {
            addCriterion("PS_SUPPKEY is not null");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYEqualTo(Integer value) {
            addCriterion("PS_SUPPKEY =", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYNotEqualTo(Integer value) {
            addCriterion("PS_SUPPKEY <>", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYGreaterThan(Integer value) {
            addCriterion("PS_SUPPKEY >", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_SUPPKEY >=", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYLessThan(Integer value) {
            addCriterion("PS_SUPPKEY <", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYLessThanOrEqualTo(Integer value) {
            addCriterion("PS_SUPPKEY <=", value, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYIn(List<Integer> values) {
            addCriterion("PS_SUPPKEY in", values, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYNotIn(List<Integer> values) {
            addCriterion("PS_SUPPKEY not in", values, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYBetween(Integer value1, Integer value2) {
            addCriterion("PS_SUPPKEY between", value1, value2, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_SUPPKEY not between", value1, value2, "PS_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYIsNull() {
            addCriterion("PS_AVAILQTY is null");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYIsNotNull() {
            addCriterion("PS_AVAILQTY is not null");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYEqualTo(Integer value) {
            addCriterion("PS_AVAILQTY =", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYNotEqualTo(Integer value) {
            addCriterion("PS_AVAILQTY <>", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYGreaterThan(Integer value) {
            addCriterion("PS_AVAILQTY >", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_AVAILQTY >=", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYLessThan(Integer value) {
            addCriterion("PS_AVAILQTY <", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYLessThanOrEqualTo(Integer value) {
            addCriterion("PS_AVAILQTY <=", value, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYIn(List<Integer> values) {
            addCriterion("PS_AVAILQTY in", values, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYNotIn(List<Integer> values) {
            addCriterion("PS_AVAILQTY not in", values, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYBetween(Integer value1, Integer value2) {
            addCriterion("PS_AVAILQTY between", value1, value2, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_AVAILQTYNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_AVAILQTY not between", value1, value2, "PS_AVAILQTY");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTIsNull() {
            addCriterion("PS_SUPPLYCOST is null");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTIsNotNull() {
            addCriterion("PS_SUPPLYCOST is not null");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTEqualTo(Double value) {
            addCriterion("PS_SUPPLYCOST =", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTNotEqualTo(Double value) {
            addCriterion("PS_SUPPLYCOST <>", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTGreaterThan(Double value) {
            addCriterion("PS_SUPPLYCOST >", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTGreaterThanOrEqualTo(Double value) {
            addCriterion("PS_SUPPLYCOST >=", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTLessThan(Double value) {
            addCriterion("PS_SUPPLYCOST <", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTLessThanOrEqualTo(Double value) {
            addCriterion("PS_SUPPLYCOST <=", value, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTIn(List<Double> values) {
            addCriterion("PS_SUPPLYCOST in", values, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTNotIn(List<Double> values) {
            addCriterion("PS_SUPPLYCOST not in", values, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTBetween(Double value1, Double value2) {
            addCriterion("PS_SUPPLYCOST between", value1, value2, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_SUPPLYCOSTNotBetween(Double value1, Double value2) {
            addCriterion("PS_SUPPLYCOST not between", value1, value2, "PS_SUPPLYCOST");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTIsNull() {
            addCriterion("PS_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTIsNotNull() {
            addCriterion("PS_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTEqualTo(String value) {
            addCriterion("PS_COMMENT =", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTNotEqualTo(String value) {
            addCriterion("PS_COMMENT <>", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTGreaterThan(String value) {
            addCriterion("PS_COMMENT >", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("PS_COMMENT >=", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTLessThan(String value) {
            addCriterion("PS_COMMENT <", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("PS_COMMENT <=", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTLike(String value) {
            addCriterion("PS_COMMENT like", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTNotLike(String value) {
            addCriterion("PS_COMMENT not like", value, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTIn(List<String> values) {
            addCriterion("PS_COMMENT in", values, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTNotIn(List<String> values) {
            addCriterion("PS_COMMENT not in", values, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTBetween(String value1, String value2) {
            addCriterion("PS_COMMENT between", value1, value2, "PS_COMMENT");
            return (Criteria) this;
        }

        public Criteria andPS_COMMENTNotBetween(String value1, String value2) {
            addCriterion("PS_COMMENT not between", value1, value2, "PS_COMMENT");
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