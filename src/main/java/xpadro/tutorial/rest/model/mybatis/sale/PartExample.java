package xpadro.tutorial.rest.model.mybatis.sale;

import java.util.ArrayList;
import java.util.List;

public class PartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartExample() {
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

        public Criteria andP_PARTKEYIsNull() {
            addCriterion("P_PARTKEY is null");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYIsNotNull() {
            addCriterion("P_PARTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYEqualTo(Integer value) {
            addCriterion("P_PARTKEY =", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYNotEqualTo(Integer value) {
            addCriterion("P_PARTKEY <>", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYGreaterThan(Integer value) {
            addCriterion("P_PARTKEY >", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_PARTKEY >=", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYLessThan(Integer value) {
            addCriterion("P_PARTKEY <", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYLessThanOrEqualTo(Integer value) {
            addCriterion("P_PARTKEY <=", value, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYIn(List<Integer> values) {
            addCriterion("P_PARTKEY in", values, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYNotIn(List<Integer> values) {
            addCriterion("P_PARTKEY not in", values, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYBetween(Integer value1, Integer value2) {
            addCriterion("P_PARTKEY between", value1, value2, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_PARTKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("P_PARTKEY not between", value1, value2, "p_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andP_NAMEIsNull() {
            addCriterion("P_NAME is null");
            return (Criteria) this;
        }

        public Criteria andP_NAMEIsNotNull() {
            addCriterion("P_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andP_NAMEEqualTo(String value) {
            addCriterion("P_NAME =", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMENotEqualTo(String value) {
            addCriterion("P_NAME <>", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMEGreaterThan(String value) {
            addCriterion("P_NAME >", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("P_NAME >=", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMELessThan(String value) {
            addCriterion("P_NAME <", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMELessThanOrEqualTo(String value) {
            addCriterion("P_NAME <=", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMELike(String value) {
            addCriterion("P_NAME like", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMENotLike(String value) {
            addCriterion("P_NAME not like", value, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMEIn(List<String> values) {
            addCriterion("P_NAME in", values, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMENotIn(List<String> values) {
            addCriterion("P_NAME not in", values, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMEBetween(String value1, String value2) {
            addCriterion("P_NAME between", value1, value2, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_NAMENotBetween(String value1, String value2) {
            addCriterion("P_NAME not between", value1, value2, "p_NAME");
            return (Criteria) this;
        }

        public Criteria andP_MFGRIsNull() {
            addCriterion("P_MFGR is null");
            return (Criteria) this;
        }

        public Criteria andP_MFGRIsNotNull() {
            addCriterion("P_MFGR is not null");
            return (Criteria) this;
        }

        public Criteria andP_MFGREqualTo(String value) {
            addCriterion("P_MFGR =", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRNotEqualTo(String value) {
            addCriterion("P_MFGR <>", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRGreaterThan(String value) {
            addCriterion("P_MFGR >", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRGreaterThanOrEqualTo(String value) {
            addCriterion("P_MFGR >=", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRLessThan(String value) {
            addCriterion("P_MFGR <", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRLessThanOrEqualTo(String value) {
            addCriterion("P_MFGR <=", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRLike(String value) {
            addCriterion("P_MFGR like", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRNotLike(String value) {
            addCriterion("P_MFGR not like", value, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRIn(List<String> values) {
            addCriterion("P_MFGR in", values, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRNotIn(List<String> values) {
            addCriterion("P_MFGR not in", values, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRBetween(String value1, String value2) {
            addCriterion("P_MFGR between", value1, value2, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_MFGRNotBetween(String value1, String value2) {
            addCriterion("P_MFGR not between", value1, value2, "p_MFGR");
            return (Criteria) this;
        }

        public Criteria andP_BRANDIsNull() {
            addCriterion("P_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andP_BRANDIsNotNull() {
            addCriterion("P_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andP_BRANDEqualTo(String value) {
            addCriterion("P_BRAND =", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDNotEqualTo(String value) {
            addCriterion("P_BRAND <>", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDGreaterThan(String value) {
            addCriterion("P_BRAND >", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDGreaterThanOrEqualTo(String value) {
            addCriterion("P_BRAND >=", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDLessThan(String value) {
            addCriterion("P_BRAND <", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDLessThanOrEqualTo(String value) {
            addCriterion("P_BRAND <=", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDLike(String value) {
            addCriterion("P_BRAND like", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDNotLike(String value) {
            addCriterion("P_BRAND not like", value, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDIn(List<String> values) {
            addCriterion("P_BRAND in", values, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDNotIn(List<String> values) {
            addCriterion("P_BRAND not in", values, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDBetween(String value1, String value2) {
            addCriterion("P_BRAND between", value1, value2, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_BRANDNotBetween(String value1, String value2) {
            addCriterion("P_BRAND not between", value1, value2, "p_BRAND");
            return (Criteria) this;
        }

        public Criteria andP_TYPEIsNull() {
            addCriterion("P_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andP_TYPEIsNotNull() {
            addCriterion("P_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andP_TYPEEqualTo(String value) {
            addCriterion("P_TYPE =", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPENotEqualTo(String value) {
            addCriterion("P_TYPE <>", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPEGreaterThan(String value) {
            addCriterion("P_TYPE >", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("P_TYPE >=", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPELessThan(String value) {
            addCriterion("P_TYPE <", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPELessThanOrEqualTo(String value) {
            addCriterion("P_TYPE <=", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPELike(String value) {
            addCriterion("P_TYPE like", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPENotLike(String value) {
            addCriterion("P_TYPE not like", value, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPEIn(List<String> values) {
            addCriterion("P_TYPE in", values, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPENotIn(List<String> values) {
            addCriterion("P_TYPE not in", values, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPEBetween(String value1, String value2) {
            addCriterion("P_TYPE between", value1, value2, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_TYPENotBetween(String value1, String value2) {
            addCriterion("P_TYPE not between", value1, value2, "p_TYPE");
            return (Criteria) this;
        }

        public Criteria andP_SIZEIsNull() {
            addCriterion("P_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andP_SIZEIsNotNull() {
            addCriterion("P_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andP_SIZEEqualTo(Integer value) {
            addCriterion("P_SIZE =", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZENotEqualTo(Integer value) {
            addCriterion("P_SIZE <>", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZEGreaterThan(Integer value) {
            addCriterion("P_SIZE >", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZEGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_SIZE >=", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZELessThan(Integer value) {
            addCriterion("P_SIZE <", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZELessThanOrEqualTo(Integer value) {
            addCriterion("P_SIZE <=", value, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZEIn(List<Integer> values) {
            addCriterion("P_SIZE in", values, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZENotIn(List<Integer> values) {
            addCriterion("P_SIZE not in", values, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZEBetween(Integer value1, Integer value2) {
            addCriterion("P_SIZE between", value1, value2, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_SIZENotBetween(Integer value1, Integer value2) {
            addCriterion("P_SIZE not between", value1, value2, "p_SIZE");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERIsNull() {
            addCriterion("P_CONTAINER is null");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERIsNotNull() {
            addCriterion("P_CONTAINER is not null");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINEREqualTo(String value) {
            addCriterion("P_CONTAINER =", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERNotEqualTo(String value) {
            addCriterion("P_CONTAINER <>", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERGreaterThan(String value) {
            addCriterion("P_CONTAINER >", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERGreaterThanOrEqualTo(String value) {
            addCriterion("P_CONTAINER >=", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERLessThan(String value) {
            addCriterion("P_CONTAINER <", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERLessThanOrEqualTo(String value) {
            addCriterion("P_CONTAINER <=", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERLike(String value) {
            addCriterion("P_CONTAINER like", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERNotLike(String value) {
            addCriterion("P_CONTAINER not like", value, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERIn(List<String> values) {
            addCriterion("P_CONTAINER in", values, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERNotIn(List<String> values) {
            addCriterion("P_CONTAINER not in", values, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERBetween(String value1, String value2) {
            addCriterion("P_CONTAINER between", value1, value2, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_CONTAINERNotBetween(String value1, String value2) {
            addCriterion("P_CONTAINER not between", value1, value2, "p_CONTAINER");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEIsNull() {
            addCriterion("P_RETAILPRICE is null");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEIsNotNull() {
            addCriterion("P_RETAILPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEEqualTo(Double value) {
            addCriterion("P_RETAILPRICE =", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICENotEqualTo(Double value) {
            addCriterion("P_RETAILPRICE <>", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEGreaterThan(Double value) {
            addCriterion("P_RETAILPRICE >", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("P_RETAILPRICE >=", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICELessThan(Double value) {
            addCriterion("P_RETAILPRICE <", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICELessThanOrEqualTo(Double value) {
            addCriterion("P_RETAILPRICE <=", value, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEIn(List<Double> values) {
            addCriterion("P_RETAILPRICE in", values, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICENotIn(List<Double> values) {
            addCriterion("P_RETAILPRICE not in", values, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICEBetween(Double value1, Double value2) {
            addCriterion("P_RETAILPRICE between", value1, value2, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_RETAILPRICENotBetween(Double value1, Double value2) {
            addCriterion("P_RETAILPRICE not between", value1, value2, "p_RETAILPRICE");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTIsNull() {
            addCriterion("P_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTIsNotNull() {
            addCriterion("P_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTEqualTo(String value) {
            addCriterion("P_COMMENT =", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTNotEqualTo(String value) {
            addCriterion("P_COMMENT <>", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTGreaterThan(String value) {
            addCriterion("P_COMMENT >", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("P_COMMENT >=", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTLessThan(String value) {
            addCriterion("P_COMMENT <", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("P_COMMENT <=", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTLike(String value) {
            addCriterion("P_COMMENT like", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTNotLike(String value) {
            addCriterion("P_COMMENT not like", value, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTIn(List<String> values) {
            addCriterion("P_COMMENT in", values, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTNotIn(List<String> values) {
            addCriterion("P_COMMENT not in", values, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTBetween(String value1, String value2) {
            addCriterion("P_COMMENT between", value1, value2, "p_COMMENT");
            return (Criteria) this;
        }

        public Criteria andP_COMMENTNotBetween(String value1, String value2) {
            addCriterion("P_COMMENT not between", value1, value2, "p_COMMENT");
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