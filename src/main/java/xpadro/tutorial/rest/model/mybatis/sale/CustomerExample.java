package xpadro.tutorial.rest.model.mybatis.sale;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andC_CUSTKEYIsNull() {
            addCriterion("C_CUSTKEY is null");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYIsNotNull() {
            addCriterion("C_CUSTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYEqualTo(Integer value) {
            addCriterion("C_CUSTKEY =", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYNotEqualTo(Integer value) {
            addCriterion("C_CUSTKEY <>", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYGreaterThan(Integer value) {
            addCriterion("C_CUSTKEY >", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_CUSTKEY >=", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYLessThan(Integer value) {
            addCriterion("C_CUSTKEY <", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYLessThanOrEqualTo(Integer value) {
            addCriterion("C_CUSTKEY <=", value, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYIn(List<Integer> values) {
            addCriterion("C_CUSTKEY in", values, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYNotIn(List<Integer> values) {
            addCriterion("C_CUSTKEY not in", values, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYBetween(Integer value1, Integer value2) {
            addCriterion("C_CUSTKEY between", value1, value2, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_CUSTKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("C_CUSTKEY not between", value1, value2, "c_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andC_NAMEIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andC_NAMEIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andC_NAMEEqualTo(String value) {
            addCriterion("C_NAME =", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMENotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMEGreaterThan(String value) {
            addCriterion("C_NAME >", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMELessThan(String value) {
            addCriterion("C_NAME <", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMELessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMELike(String value) {
            addCriterion("C_NAME like", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMENotLike(String value) {
            addCriterion("C_NAME not like", value, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMEIn(List<String> values) {
            addCriterion("C_NAME in", values, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMENotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMEBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_NAMENotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "c_NAME");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSIsNull() {
            addCriterion("C_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSIsNotNull() {
            addCriterion("C_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSEqualTo(String value) {
            addCriterion("C_ADDRESS =", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSNotEqualTo(String value) {
            addCriterion("C_ADDRESS <>", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSGreaterThan(String value) {
            addCriterion("C_ADDRESS >", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS >=", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSLessThan(String value) {
            addCriterion("C_ADDRESS <", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("C_ADDRESS <=", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSLike(String value) {
            addCriterion("C_ADDRESS like", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSNotLike(String value) {
            addCriterion("C_ADDRESS not like", value, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSIn(List<String> values) {
            addCriterion("C_ADDRESS in", values, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSNotIn(List<String> values) {
            addCriterion("C_ADDRESS not in", values, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSBetween(String value1, String value2) {
            addCriterion("C_ADDRESS between", value1, value2, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("C_ADDRESS not between", value1, value2, "c_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYIsNull() {
            addCriterion("C_NATIONKEY is null");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYIsNotNull() {
            addCriterion("C_NATIONKEY is not null");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYEqualTo(Integer value) {
            addCriterion("C_NATIONKEY =", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYNotEqualTo(Integer value) {
            addCriterion("C_NATIONKEY <>", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYGreaterThan(Integer value) {
            addCriterion("C_NATIONKEY >", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_NATIONKEY >=", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYLessThan(Integer value) {
            addCriterion("C_NATIONKEY <", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYLessThanOrEqualTo(Integer value) {
            addCriterion("C_NATIONKEY <=", value, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYIn(List<Integer> values) {
            addCriterion("C_NATIONKEY in", values, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYNotIn(List<Integer> values) {
            addCriterion("C_NATIONKEY not in", values, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYBetween(Integer value1, Integer value2) {
            addCriterion("C_NATIONKEY between", value1, value2, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_NATIONKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("C_NATIONKEY not between", value1, value2, "c_NATIONKEY");
            return (Criteria) this;
        }

        public Criteria andC_PHONEIsNull() {
            addCriterion("C_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andC_PHONEIsNotNull() {
            addCriterion("C_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andC_PHONEEqualTo(String value) {
            addCriterion("C_PHONE =", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONENotEqualTo(String value) {
            addCriterion("C_PHONE <>", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONEGreaterThan(String value) {
            addCriterion("C_PHONE >", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("C_PHONE >=", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONELessThan(String value) {
            addCriterion("C_PHONE <", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONELessThanOrEqualTo(String value) {
            addCriterion("C_PHONE <=", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONELike(String value) {
            addCriterion("C_PHONE like", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONENotLike(String value) {
            addCriterion("C_PHONE not like", value, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONEIn(List<String> values) {
            addCriterion("C_PHONE in", values, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONENotIn(List<String> values) {
            addCriterion("C_PHONE not in", values, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONEBetween(String value1, String value2) {
            addCriterion("C_PHONE between", value1, value2, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_PHONENotBetween(String value1, String value2) {
            addCriterion("C_PHONE not between", value1, value2, "c_PHONE");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALIsNull() {
            addCriterion("C_ACCTBAL is null");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALIsNotNull() {
            addCriterion("C_ACCTBAL is not null");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALEqualTo(Double value) {
            addCriterion("C_ACCTBAL =", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALNotEqualTo(Double value) {
            addCriterion("C_ACCTBAL <>", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALGreaterThan(Double value) {
            addCriterion("C_ACCTBAL >", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALGreaterThanOrEqualTo(Double value) {
            addCriterion("C_ACCTBAL >=", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALLessThan(Double value) {
            addCriterion("C_ACCTBAL <", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALLessThanOrEqualTo(Double value) {
            addCriterion("C_ACCTBAL <=", value, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALIn(List<Double> values) {
            addCriterion("C_ACCTBAL in", values, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALNotIn(List<Double> values) {
            addCriterion("C_ACCTBAL not in", values, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALBetween(Double value1, Double value2) {
            addCriterion("C_ACCTBAL between", value1, value2, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_ACCTBALNotBetween(Double value1, Double value2) {
            addCriterion("C_ACCTBAL not between", value1, value2, "c_ACCTBAL");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTIsNull() {
            addCriterion("C_MKTSEGMENT is null");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTIsNotNull() {
            addCriterion("C_MKTSEGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTEqualTo(String value) {
            addCriterion("C_MKTSEGMENT =", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTNotEqualTo(String value) {
            addCriterion("C_MKTSEGMENT <>", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTGreaterThan(String value) {
            addCriterion("C_MKTSEGMENT >", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTGreaterThanOrEqualTo(String value) {
            addCriterion("C_MKTSEGMENT >=", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTLessThan(String value) {
            addCriterion("C_MKTSEGMENT <", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTLessThanOrEqualTo(String value) {
            addCriterion("C_MKTSEGMENT <=", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTLike(String value) {
            addCriterion("C_MKTSEGMENT like", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTNotLike(String value) {
            addCriterion("C_MKTSEGMENT not like", value, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTIn(List<String> values) {
            addCriterion("C_MKTSEGMENT in", values, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTNotIn(List<String> values) {
            addCriterion("C_MKTSEGMENT not in", values, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTBetween(String value1, String value2) {
            addCriterion("C_MKTSEGMENT between", value1, value2, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_MKTSEGMENTNotBetween(String value1, String value2) {
            addCriterion("C_MKTSEGMENT not between", value1, value2, "c_MKTSEGMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTIsNull() {
            addCriterion("C_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTIsNotNull() {
            addCriterion("C_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTEqualTo(String value) {
            addCriterion("C_COMMENT =", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTNotEqualTo(String value) {
            addCriterion("C_COMMENT <>", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTGreaterThan(String value) {
            addCriterion("C_COMMENT >", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMMENT >=", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTLessThan(String value) {
            addCriterion("C_COMMENT <", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("C_COMMENT <=", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTLike(String value) {
            addCriterion("C_COMMENT like", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTNotLike(String value) {
            addCriterion("C_COMMENT not like", value, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTIn(List<String> values) {
            addCriterion("C_COMMENT in", values, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTNotIn(List<String> values) {
            addCriterion("C_COMMENT not in", values, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTBetween(String value1, String value2) {
            addCriterion("C_COMMENT between", value1, value2, "c_COMMENT");
            return (Criteria) this;
        }

        public Criteria andC_COMMENTNotBetween(String value1, String value2) {
            addCriterion("C_COMMENT not between", value1, value2, "c_COMMENT");
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