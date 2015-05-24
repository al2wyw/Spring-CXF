package xpadro.tutorial.rest.model.mybatis.sale;

import java.util.ArrayList;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
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

        public Criteria andS_SUPPKEYIsNull() {
            addCriterion("S_SUPPKEY is null");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYIsNotNull() {
            addCriterion("S_SUPPKEY is not null");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYEqualTo(Integer value) {
            addCriterion("S_SUPPKEY =", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYNotEqualTo(Integer value) {
            addCriterion("S_SUPPKEY <>", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYGreaterThan(Integer value) {
            addCriterion("S_SUPPKEY >", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_SUPPKEY >=", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYLessThan(Integer value) {
            addCriterion("S_SUPPKEY <", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYLessThanOrEqualTo(Integer value) {
            addCriterion("S_SUPPKEY <=", value, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYIn(List<Integer> values) {
            addCriterion("S_SUPPKEY in", values, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYNotIn(List<Integer> values) {
            addCriterion("S_SUPPKEY not in", values, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYBetween(Integer value1, Integer value2) {
            addCriterion("S_SUPPKEY between", value1, value2, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_SUPPKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("S_SUPPKEY not between", value1, value2, "s_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andS_NAMEIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andS_NAMEIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andS_NAMEEqualTo(String value) {
            addCriterion("S_NAME =", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMENotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMEGreaterThan(String value) {
            addCriterion("S_NAME >", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMELessThan(String value) {
            addCriterion("S_NAME <", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMELessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMELike(String value) {
            addCriterion("S_NAME like", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMENotLike(String value) {
            addCriterion("S_NAME not like", value, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMEIn(List<String> values) {
            addCriterion("S_NAME in", values, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMENotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMEBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_NAMENotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "s_NAME");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSIsNull() {
            addCriterion("S_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSIsNotNull() {
            addCriterion("S_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSEqualTo(String value) {
            addCriterion("S_ADDRESS =", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSNotEqualTo(String value) {
            addCriterion("S_ADDRESS <>", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSGreaterThan(String value) {
            addCriterion("S_ADDRESS >", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("S_ADDRESS >=", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSLessThan(String value) {
            addCriterion("S_ADDRESS <", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("S_ADDRESS <=", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSLike(String value) {
            addCriterion("S_ADDRESS like", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSNotLike(String value) {
            addCriterion("S_ADDRESS not like", value, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSIn(List<String> values) {
            addCriterion("S_ADDRESS in", values, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSNotIn(List<String> values) {
            addCriterion("S_ADDRESS not in", values, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSBetween(String value1, String value2) {
            addCriterion("S_ADDRESS between", value1, value2, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("S_ADDRESS not between", value1, value2, "s_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYIsNull() {
            addCriterion("S_NATIONKEY is null");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYIsNotNull() {
            addCriterion("S_NATIONKEY is not null");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYEqualTo(Integer value) {
            addCriterion("S_NATIONKEY =", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYNotEqualTo(Integer value) {
            addCriterion("S_NATIONKEY <>", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYGreaterThan(Integer value) {
            addCriterion("S_NATIONKEY >", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_NATIONKEY >=", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYLessThan(Integer value) {
            addCriterion("S_NATIONKEY <", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYLessThanOrEqualTo(Integer value) {
            addCriterion("S_NATIONKEY <=", value, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYIn(List<Integer> values) {
            addCriterion("S_NATIONKEY in", values, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYNotIn(List<Integer> values) {
            addCriterion("S_NATIONKEY not in", values, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYBetween(Integer value1, Integer value2) {
            addCriterion("S_NATIONKEY between", value1, value2, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_NATIONKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("S_NATIONKEY not between", value1, value2, "s_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andS_PHONEIsNull() {
            addCriterion("S_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andS_PHONEIsNotNull() {
            addCriterion("S_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andS_PHONEEqualTo(String value) {
            addCriterion("S_PHONE =", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONENotEqualTo(String value) {
            addCriterion("S_PHONE <>", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONEGreaterThan(String value) {
            addCriterion("S_PHONE >", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("S_PHONE >=", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONELessThan(String value) {
            addCriterion("S_PHONE <", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONELessThanOrEqualTo(String value) {
            addCriterion("S_PHONE <=", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONELike(String value) {
            addCriterion("S_PHONE like", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONENotLike(String value) {
            addCriterion("S_PHONE not like", value, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONEIn(List<String> values) {
            addCriterion("S_PHONE in", values, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONENotIn(List<String> values) {
            addCriterion("S_PHONE not in", values, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONEBetween(String value1, String value2) {
            addCriterion("S_PHONE between", value1, value2, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_PHONENotBetween(String value1, String value2) {
            addCriterion("S_PHONE not between", value1, value2, "s_PHONE");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALIsNull() {
            addCriterion("S_ACCTBAL is null");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALIsNotNull() {
            addCriterion("S_ACCTBAL is not null");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALEqualTo(Double value) {
            addCriterion("S_ACCTBAL =", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALNotEqualTo(Double value) {
            addCriterion("S_ACCTBAL <>", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALGreaterThan(Double value) {
            addCriterion("S_ACCTBAL >", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALGreaterThanOrEqualTo(Double value) {
            addCriterion("S_ACCTBAL >=", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALLessThan(Double value) {
            addCriterion("S_ACCTBAL <", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALLessThanOrEqualTo(Double value) {
            addCriterion("S_ACCTBAL <=", value, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALIn(List<Double> values) {
            addCriterion("S_ACCTBAL in", values, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALNotIn(List<Double> values) {
            addCriterion("S_ACCTBAL not in", values, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALBetween(Double value1, Double value2) {
            addCriterion("S_ACCTBAL between", value1, value2, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_ACCTBALNotBetween(Double value1, Double value2) {
            addCriterion("S_ACCTBAL not between", value1, value2, "s_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTIsNull() {
            addCriterion("S_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTIsNotNull() {
            addCriterion("S_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTEqualTo(String value) {
            addCriterion("S_COMMENT =", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTNotEqualTo(String value) {
            addCriterion("S_COMMENT <>", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTGreaterThan(String value) {
            addCriterion("S_COMMENT >", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("S_COMMENT >=", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTLessThan(String value) {
            addCriterion("S_COMMENT <", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("S_COMMENT <=", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTLike(String value) {
            addCriterion("S_COMMENT like", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTNotLike(String value) {
            addCriterion("S_COMMENT not like", value, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTIn(List<String> values) {
            addCriterion("S_COMMENT in", values, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTNotIn(List<String> values) {
            addCriterion("S_COMMENT not in", values, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTBetween(String value1, String value2) {
            addCriterion("S_COMMENT between", value1, value2, "s_COMMENT");
            return (Criteria) this;
        }

        public Criteria andS_COMMENTNotBetween(String value1, String value2) {
            addCriterion("S_COMMENT not between", value1, value2, "s_COMMENT");
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