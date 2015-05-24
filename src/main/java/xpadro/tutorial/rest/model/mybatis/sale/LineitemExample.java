package xpadro.tutorial.rest.model.mybatis.sale;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LineitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineitemExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andL_ORDERKEYIsNull() {
            addCriterion("L_ORDERKEY is null");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYIsNotNull() {
            addCriterion("L_ORDERKEY is not null");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYEqualTo(Integer value) {
            addCriterion("L_ORDERKEY =", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYNotEqualTo(Integer value) {
            addCriterion("L_ORDERKEY <>", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYGreaterThan(Integer value) {
            addCriterion("L_ORDERKEY >", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_ORDERKEY >=", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYLessThan(Integer value) {
            addCriterion("L_ORDERKEY <", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYLessThanOrEqualTo(Integer value) {
            addCriterion("L_ORDERKEY <=", value, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYIn(List<Integer> values) {
            addCriterion("L_ORDERKEY in", values, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYNotIn(List<Integer> values) {
            addCriterion("L_ORDERKEY not in", values, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYBetween(Integer value1, Integer value2) {
            addCriterion("L_ORDERKEY between", value1, value2, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_ORDERKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("L_ORDERKEY not between", value1, value2, "l_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTIsNull() {
            addCriterion("L_LINEINT is null");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTIsNotNull() {
            addCriterion("L_LINEINT is not null");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTEqualTo(Integer value) {
            addCriterion("L_LINEINT =", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTNotEqualTo(Integer value) {
            addCriterion("L_LINEINT <>", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTGreaterThan(Integer value) {
            addCriterion("L_LINEINT >", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_LINEINT >=", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTLessThan(Integer value) {
            addCriterion("L_LINEINT <", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTLessThanOrEqualTo(Integer value) {
            addCriterion("L_LINEINT <=", value, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTIn(List<Integer> values) {
            addCriterion("L_LINEINT in", values, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTNotIn(List<Integer> values) {
            addCriterion("L_LINEINT not in", values, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTBetween(Integer value1, Integer value2) {
            addCriterion("L_LINEINT between", value1, value2, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_LINEINTNotBetween(Integer value1, Integer value2) {
            addCriterion("L_LINEINT not between", value1, value2, "l_LINEINT");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYIsNull() {
            addCriterion("L_PARTKEY is null");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYIsNotNull() {
            addCriterion("L_PARTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYEqualTo(Integer value) {
            addCriterion("L_PARTKEY =", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYNotEqualTo(Integer value) {
            addCriterion("L_PARTKEY <>", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYGreaterThan(Integer value) {
            addCriterion("L_PARTKEY >", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_PARTKEY >=", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYLessThan(Integer value) {
            addCriterion("L_PARTKEY <", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYLessThanOrEqualTo(Integer value) {
            addCriterion("L_PARTKEY <=", value, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYIn(List<Integer> values) {
            addCriterion("L_PARTKEY in", values, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYNotIn(List<Integer> values) {
            addCriterion("L_PARTKEY not in", values, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYBetween(Integer value1, Integer value2) {
            addCriterion("L_PARTKEY between", value1, value2, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_PARTKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("L_PARTKEY not between", value1, value2, "l_PARTKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYIsNull() {
            addCriterion("L_SUPPKEY is null");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYIsNotNull() {
            addCriterion("L_SUPPKEY is not null");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYEqualTo(Integer value) {
            addCriterion("L_SUPPKEY =", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYNotEqualTo(Integer value) {
            addCriterion("L_SUPPKEY <>", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYGreaterThan(Integer value) {
            addCriterion("L_SUPPKEY >", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_SUPPKEY >=", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYLessThan(Integer value) {
            addCriterion("L_SUPPKEY <", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYLessThanOrEqualTo(Integer value) {
            addCriterion("L_SUPPKEY <=", value, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYIn(List<Integer> values) {
            addCriterion("L_SUPPKEY in", values, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYNotIn(List<Integer> values) {
            addCriterion("L_SUPPKEY not in", values, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYBetween(Integer value1, Integer value2) {
            addCriterion("L_SUPPKEY between", value1, value2, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_SUPPKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("L_SUPPKEY not between", value1, value2, "l_SUPPKEY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYIsNull() {
            addCriterion("L_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYIsNotNull() {
            addCriterion("L_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYEqualTo(Double value) {
            addCriterion("L_QUANTITY =", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYNotEqualTo(Double value) {
            addCriterion("L_QUANTITY <>", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYGreaterThan(Double value) {
            addCriterion("L_QUANTITY >", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYGreaterThanOrEqualTo(Double value) {
            addCriterion("L_QUANTITY >=", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYLessThan(Double value) {
            addCriterion("L_QUANTITY <", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYLessThanOrEqualTo(Double value) {
            addCriterion("L_QUANTITY <=", value, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYIn(List<Double> values) {
            addCriterion("L_QUANTITY in", values, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYNotIn(List<Double> values) {
            addCriterion("L_QUANTITY not in", values, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYBetween(Double value1, Double value2) {
            addCriterion("L_QUANTITY between", value1, value2, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_QUANTITYNotBetween(Double value1, Double value2) {
            addCriterion("L_QUANTITY not between", value1, value2, "l_QUANTITY");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEIsNull() {
            addCriterion("L_EXTENDEDPRICE is null");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEIsNotNull() {
            addCriterion("L_EXTENDEDPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEEqualTo(Double value) {
            addCriterion("L_EXTENDEDPRICE =", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICENotEqualTo(Double value) {
            addCriterion("L_EXTENDEDPRICE <>", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEGreaterThan(Double value) {
            addCriterion("L_EXTENDEDPRICE >", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("L_EXTENDEDPRICE >=", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICELessThan(Double value) {
            addCriterion("L_EXTENDEDPRICE <", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICELessThanOrEqualTo(Double value) {
            addCriterion("L_EXTENDEDPRICE <=", value, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEIn(List<Double> values) {
            addCriterion("L_EXTENDEDPRICE in", values, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICENotIn(List<Double> values) {
            addCriterion("L_EXTENDEDPRICE not in", values, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICEBetween(Double value1, Double value2) {
            addCriterion("L_EXTENDEDPRICE between", value1, value2, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_EXTENDEDPRICENotBetween(Double value1, Double value2) {
            addCriterion("L_EXTENDEDPRICE not between", value1, value2, "l_EXTENDEDPRICE");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTIsNull() {
            addCriterion("L_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTIsNotNull() {
            addCriterion("L_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTEqualTo(Double value) {
            addCriterion("L_DISCOUNT =", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTNotEqualTo(Double value) {
            addCriterion("L_DISCOUNT <>", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTGreaterThan(Double value) {
            addCriterion("L_DISCOUNT >", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTGreaterThanOrEqualTo(Double value) {
            addCriterion("L_DISCOUNT >=", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTLessThan(Double value) {
            addCriterion("L_DISCOUNT <", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTLessThanOrEqualTo(Double value) {
            addCriterion("L_DISCOUNT <=", value, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTIn(List<Double> values) {
            addCriterion("L_DISCOUNT in", values, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTNotIn(List<Double> values) {
            addCriterion("L_DISCOUNT not in", values, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTBetween(Double value1, Double value2) {
            addCriterion("L_DISCOUNT between", value1, value2, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_DISCOUNTNotBetween(Double value1, Double value2) {
            addCriterion("L_DISCOUNT not between", value1, value2, "l_DISCOUNT");
            return (Criteria) this;
        }

        public Criteria andL_TAXIsNull() {
            addCriterion("L_TAX is null");
            return (Criteria) this;
        }

        public Criteria andL_TAXIsNotNull() {
            addCriterion("L_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andL_TAXEqualTo(Double value) {
            addCriterion("L_TAX =", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXNotEqualTo(Double value) {
            addCriterion("L_TAX <>", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXGreaterThan(Double value) {
            addCriterion("L_TAX >", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXGreaterThanOrEqualTo(Double value) {
            addCriterion("L_TAX >=", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXLessThan(Double value) {
            addCriterion("L_TAX <", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXLessThanOrEqualTo(Double value) {
            addCriterion("L_TAX <=", value, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXIn(List<Double> values) {
            addCriterion("L_TAX in", values, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXNotIn(List<Double> values) {
            addCriterion("L_TAX not in", values, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXBetween(Double value1, Double value2) {
            addCriterion("L_TAX between", value1, value2, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_TAXNotBetween(Double value1, Double value2) {
            addCriterion("L_TAX not between", value1, value2, "l_TAX");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGIsNull() {
            addCriterion("L_RETURNFLAG is null");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGIsNotNull() {
            addCriterion("L_RETURNFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGEqualTo(String value) {
            addCriterion("L_RETURNFLAG =", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGNotEqualTo(String value) {
            addCriterion("L_RETURNFLAG <>", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGGreaterThan(String value) {
            addCriterion("L_RETURNFLAG >", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGGreaterThanOrEqualTo(String value) {
            addCriterion("L_RETURNFLAG >=", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGLessThan(String value) {
            addCriterion("L_RETURNFLAG <", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGLessThanOrEqualTo(String value) {
            addCriterion("L_RETURNFLAG <=", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGLike(String value) {
            addCriterion("L_RETURNFLAG like", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGNotLike(String value) {
            addCriterion("L_RETURNFLAG not like", value, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGIn(List<String> values) {
            addCriterion("L_RETURNFLAG in", values, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGNotIn(List<String> values) {
            addCriterion("L_RETURNFLAG not in", values, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGBetween(String value1, String value2) {
            addCriterion("L_RETURNFLAG between", value1, value2, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_RETURNFLAGNotBetween(String value1, String value2) {
            addCriterion("L_RETURNFLAG not between", value1, value2, "l_RETURNFLAG");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSIsNull() {
            addCriterion("L_LINESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSIsNotNull() {
            addCriterion("L_LINESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSEqualTo(String value) {
            addCriterion("L_LINESTATUS =", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSNotEqualTo(String value) {
            addCriterion("L_LINESTATUS <>", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSGreaterThan(String value) {
            addCriterion("L_LINESTATUS >", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("L_LINESTATUS >=", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSLessThan(String value) {
            addCriterion("L_LINESTATUS <", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSLessThanOrEqualTo(String value) {
            addCriterion("L_LINESTATUS <=", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSLike(String value) {
            addCriterion("L_LINESTATUS like", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSNotLike(String value) {
            addCriterion("L_LINESTATUS not like", value, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSIn(List<String> values) {
            addCriterion("L_LINESTATUS in", values, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSNotIn(List<String> values) {
            addCriterion("L_LINESTATUS not in", values, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSBetween(String value1, String value2) {
            addCriterion("L_LINESTATUS between", value1, value2, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_LINESTATUSNotBetween(String value1, String value2) {
            addCriterion("L_LINESTATUS not between", value1, value2, "l_LINESTATUS");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEIsNull() {
            addCriterion("L_SHIPDATE is null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEIsNotNull() {
            addCriterion("L_SHIPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEEqualTo(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE =", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE <>", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE >", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE >=", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATELessThan(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE <", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_SHIPDATE <=", value, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEIn(List<Date> values) {
            addCriterionForJDBCDate("L_SHIPDATE in", values, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("L_SHIPDATE not in", values, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_SHIPDATE between", value1, value2, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_SHIPDATE not between", value1, value2, "l_SHIPDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEIsNull() {
            addCriterion("L_COMMITDATE is null");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEIsNotNull() {
            addCriterion("L_COMMITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEEqualTo(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE =", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE <>", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE >", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE >=", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATELessThan(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE <", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_COMMITDATE <=", value, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEIn(List<Date> values) {
            addCriterionForJDBCDate("L_COMMITDATE in", values, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("L_COMMITDATE not in", values, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_COMMITDATE between", value1, value2, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_COMMITDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_COMMITDATE not between", value1, value2, "l_COMMITDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEIsNull() {
            addCriterion("L_RECEIPTDATE is null");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEIsNotNull() {
            addCriterion("L_RECEIPTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEEqualTo(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE =", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE <>", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE >", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE >=", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATELessThan(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE <", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("L_RECEIPTDATE <=", value, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEIn(List<Date> values) {
            addCriterionForJDBCDate("L_RECEIPTDATE in", values, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("L_RECEIPTDATE not in", values, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_RECEIPTDATE between", value1, value2, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_RECEIPTDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("L_RECEIPTDATE not between", value1, value2, "l_RECEIPTDATE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTIsNull() {
            addCriterion("L_SHIPINSTRUCT is null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTIsNotNull() {
            addCriterion("L_SHIPINSTRUCT is not null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTEqualTo(String value) {
            addCriterion("L_SHIPINSTRUCT =", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTNotEqualTo(String value) {
            addCriterion("L_SHIPINSTRUCT <>", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTGreaterThan(String value) {
            addCriterion("L_SHIPINSTRUCT >", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTGreaterThanOrEqualTo(String value) {
            addCriterion("L_SHIPINSTRUCT >=", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTLessThan(String value) {
            addCriterion("L_SHIPINSTRUCT <", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTLessThanOrEqualTo(String value) {
            addCriterion("L_SHIPINSTRUCT <=", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTLike(String value) {
            addCriterion("L_SHIPINSTRUCT like", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTNotLike(String value) {
            addCriterion("L_SHIPINSTRUCT not like", value, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTIn(List<String> values) {
            addCriterion("L_SHIPINSTRUCT in", values, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTNotIn(List<String> values) {
            addCriterion("L_SHIPINSTRUCT not in", values, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTBetween(String value1, String value2) {
            addCriterion("L_SHIPINSTRUCT between", value1, value2, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPINSTRUCTNotBetween(String value1, String value2) {
            addCriterion("L_SHIPINSTRUCT not between", value1, value2, "l_SHIPINSTRUCT");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEIsNull() {
            addCriterion("L_SHIPMODE is null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEIsNotNull() {
            addCriterion("L_SHIPMODE is not null");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEEqualTo(String value) {
            addCriterion("L_SHIPMODE =", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODENotEqualTo(String value) {
            addCriterion("L_SHIPMODE <>", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEGreaterThan(String value) {
            addCriterion("L_SHIPMODE >", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEGreaterThanOrEqualTo(String value) {
            addCriterion("L_SHIPMODE >=", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODELessThan(String value) {
            addCriterion("L_SHIPMODE <", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODELessThanOrEqualTo(String value) {
            addCriterion("L_SHIPMODE <=", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODELike(String value) {
            addCriterion("L_SHIPMODE like", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODENotLike(String value) {
            addCriterion("L_SHIPMODE not like", value, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEIn(List<String> values) {
            addCriterion("L_SHIPMODE in", values, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODENotIn(List<String> values) {
            addCriterion("L_SHIPMODE not in", values, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODEBetween(String value1, String value2) {
            addCriterion("L_SHIPMODE between", value1, value2, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_SHIPMODENotBetween(String value1, String value2) {
            addCriterion("L_SHIPMODE not between", value1, value2, "l_SHIPMODE");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTIsNull() {
            addCriterion("L_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTIsNotNull() {
            addCriterion("L_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTEqualTo(String value) {
            addCriterion("L_COMMENT =", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTNotEqualTo(String value) {
            addCriterion("L_COMMENT <>", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTGreaterThan(String value) {
            addCriterion("L_COMMENT >", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("L_COMMENT >=", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTLessThan(String value) {
            addCriterion("L_COMMENT <", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("L_COMMENT <=", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTLike(String value) {
            addCriterion("L_COMMENT like", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTNotLike(String value) {
            addCriterion("L_COMMENT not like", value, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTIn(List<String> values) {
            addCriterion("L_COMMENT in", values, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTNotIn(List<String> values) {
            addCriterion("L_COMMENT not in", values, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTBetween(String value1, String value2) {
            addCriterion("L_COMMENT between", value1, value2, "l_COMMENT");
            return (Criteria) this;
        }

        public Criteria andL_COMMENTNotBetween(String value1, String value2) {
            addCriterion("L_COMMENT not between", value1, value2, "l_COMMENT");
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