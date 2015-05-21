package xpadro.tutorial.rest.model.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andO_ORDERKEYIsNull() {
            addCriterion("O_ORDERKEY is null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYIsNotNull() {
            addCriterion("O_ORDERKEY is not null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYEqualTo(Integer value) {
            addCriterion("O_ORDERKEY =", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYNotEqualTo(Integer value) {
            addCriterion("O_ORDERKEY <>", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYGreaterThan(Integer value) {
            addCriterion("O_ORDERKEY >", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_ORDERKEY >=", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYLessThan(Integer value) {
            addCriterion("O_ORDERKEY <", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYLessThanOrEqualTo(Integer value) {
            addCriterion("O_ORDERKEY <=", value, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYIn(List<Integer> values) {
            addCriterion("O_ORDERKEY in", values, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYNotIn(List<Integer> values) {
            addCriterion("O_ORDERKEY not in", values, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYBetween(Integer value1, Integer value2) {
            addCriterion("O_ORDERKEY between", value1, value2, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("O_ORDERKEY not between", value1, value2, "o_ORDERKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYIsNull() {
            addCriterion("O_CUSTKEY is null");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYIsNotNull() {
            addCriterion("O_CUSTKEY is not null");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYEqualTo(Integer value) {
            addCriterion("O_CUSTKEY =", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYNotEqualTo(Integer value) {
            addCriterion("O_CUSTKEY <>", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYGreaterThan(Integer value) {
            addCriterion("O_CUSTKEY >", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_CUSTKEY >=", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYLessThan(Integer value) {
            addCriterion("O_CUSTKEY <", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYLessThanOrEqualTo(Integer value) {
            addCriterion("O_CUSTKEY <=", value, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYIn(List<Integer> values) {
            addCriterion("O_CUSTKEY in", values, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYNotIn(List<Integer> values) {
            addCriterion("O_CUSTKEY not in", values, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYBetween(Integer value1, Integer value2) {
            addCriterion("O_CUSTKEY between", value1, value2, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_CUSTKEYNotBetween(Integer value1, Integer value2) {
            addCriterion("O_CUSTKEY not between", value1, value2, "o_CUSTKEY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSIsNull() {
            addCriterion("O_ORDERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSIsNotNull() {
            addCriterion("O_ORDERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSEqualTo(String value) {
            addCriterion("O_ORDERSTATUS =", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSNotEqualTo(String value) {
            addCriterion("O_ORDERSTATUS <>", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSGreaterThan(String value) {
            addCriterion("O_ORDERSTATUS >", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("O_ORDERSTATUS >=", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSLessThan(String value) {
            addCriterion("O_ORDERSTATUS <", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSLessThanOrEqualTo(String value) {
            addCriterion("O_ORDERSTATUS <=", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSLike(String value) {
            addCriterion("O_ORDERSTATUS like", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSNotLike(String value) {
            addCriterion("O_ORDERSTATUS not like", value, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSIn(List<String> values) {
            addCriterion("O_ORDERSTATUS in", values, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSNotIn(List<String> values) {
            addCriterion("O_ORDERSTATUS not in", values, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSBetween(String value1, String value2) {
            addCriterion("O_ORDERSTATUS between", value1, value2, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_ORDERSTATUSNotBetween(String value1, String value2) {
            addCriterion("O_ORDERSTATUS not between", value1, value2, "o_ORDERSTATUS");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEIsNull() {
            addCriterion("O_TOTALPRICE is null");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEIsNotNull() {
            addCriterion("O_TOTALPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEEqualTo(Double value) {
            addCriterion("O_TOTALPRICE =", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICENotEqualTo(Double value) {
            addCriterion("O_TOTALPRICE <>", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEGreaterThan(Double value) {
            addCriterion("O_TOTALPRICE >", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEGreaterThanOrEqualTo(Double value) {
            addCriterion("O_TOTALPRICE >=", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICELessThan(Double value) {
            addCriterion("O_TOTALPRICE <", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICELessThanOrEqualTo(Double value) {
            addCriterion("O_TOTALPRICE <=", value, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEIn(List<Double> values) {
            addCriterion("O_TOTALPRICE in", values, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICENotIn(List<Double> values) {
            addCriterion("O_TOTALPRICE not in", values, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICEBetween(Double value1, Double value2) {
            addCriterion("O_TOTALPRICE between", value1, value2, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_TOTALPRICENotBetween(Double value1, Double value2) {
            addCriterion("O_TOTALPRICE not between", value1, value2, "o_TOTALPRICE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEIsNull() {
            addCriterion("O_ORDERDATE is null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEIsNotNull() {
            addCriterion("O_ORDERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEEqualTo(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE =", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATENotEqualTo(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE <>", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEGreaterThan(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE >", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE >=", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATELessThan(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE <", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("O_ORDERDATE <=", value, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEIn(List<Date> values) {
            addCriterionForJDBCDate("O_ORDERDATE in", values, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATENotIn(List<Date> values) {
            addCriterionForJDBCDate("O_ORDERDATE not in", values, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("O_ORDERDATE between", value1, value2, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERDATENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("O_ORDERDATE not between", value1, value2, "o_ORDERDATE");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYIsNull() {
            addCriterion("O_ORDERPRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYIsNotNull() {
            addCriterion("O_ORDERPRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYEqualTo(String value) {
            addCriterion("O_ORDERPRIORITY =", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYNotEqualTo(String value) {
            addCriterion("O_ORDERPRIORITY <>", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYGreaterThan(String value) {
            addCriterion("O_ORDERPRIORITY >", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYGreaterThanOrEqualTo(String value) {
            addCriterion("O_ORDERPRIORITY >=", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYLessThan(String value) {
            addCriterion("O_ORDERPRIORITY <", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYLessThanOrEqualTo(String value) {
            addCriterion("O_ORDERPRIORITY <=", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYLike(String value) {
            addCriterion("O_ORDERPRIORITY like", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYNotLike(String value) {
            addCriterion("O_ORDERPRIORITY not like", value, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYIn(List<String> values) {
            addCriterion("O_ORDERPRIORITY in", values, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYNotIn(List<String> values) {
            addCriterion("O_ORDERPRIORITY not in", values, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYBetween(String value1, String value2) {
            addCriterion("O_ORDERPRIORITY between", value1, value2, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_ORDERPRIORITYNotBetween(String value1, String value2) {
            addCriterion("O_ORDERPRIORITY not between", value1, value2, "o_ORDERPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_CLERKIsNull() {
            addCriterion("O_CLERK is null");
            return (Criteria) this;
        }

        public Criteria andO_CLERKIsNotNull() {
            addCriterion("O_CLERK is not null");
            return (Criteria) this;
        }

        public Criteria andO_CLERKEqualTo(String value) {
            addCriterion("O_CLERK =", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKNotEqualTo(String value) {
            addCriterion("O_CLERK <>", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKGreaterThan(String value) {
            addCriterion("O_CLERK >", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKGreaterThanOrEqualTo(String value) {
            addCriterion("O_CLERK >=", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKLessThan(String value) {
            addCriterion("O_CLERK <", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKLessThanOrEqualTo(String value) {
            addCriterion("O_CLERK <=", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKLike(String value) {
            addCriterion("O_CLERK like", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKNotLike(String value) {
            addCriterion("O_CLERK not like", value, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKIn(List<String> values) {
            addCriterion("O_CLERK in", values, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKNotIn(List<String> values) {
            addCriterion("O_CLERK not in", values, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKBetween(String value1, String value2) {
            addCriterion("O_CLERK between", value1, value2, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_CLERKNotBetween(String value1, String value2) {
            addCriterion("O_CLERK not between", value1, value2, "o_CLERK");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYIsNull() {
            addCriterion("O_SHIPPRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYIsNotNull() {
            addCriterion("O_SHIPPRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYEqualTo(Integer value) {
            addCriterion("O_SHIPPRIORITY =", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYNotEqualTo(Integer value) {
            addCriterion("O_SHIPPRIORITY <>", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYGreaterThan(Integer value) {
            addCriterion("O_SHIPPRIORITY >", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYGreaterThanOrEqualTo(Integer value) {
            addCriterion("O_SHIPPRIORITY >=", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYLessThan(Integer value) {
            addCriterion("O_SHIPPRIORITY <", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYLessThanOrEqualTo(Integer value) {
            addCriterion("O_SHIPPRIORITY <=", value, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYIn(List<Integer> values) {
            addCriterion("O_SHIPPRIORITY in", values, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYNotIn(List<Integer> values) {
            addCriterion("O_SHIPPRIORITY not in", values, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYBetween(Integer value1, Integer value2) {
            addCriterion("O_SHIPPRIORITY between", value1, value2, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_SHIPPRIORITYNotBetween(Integer value1, Integer value2) {
            addCriterion("O_SHIPPRIORITY not between", value1, value2, "o_SHIPPRIORITY");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTIsNull() {
            addCriterion("O_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTIsNotNull() {
            addCriterion("O_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTEqualTo(String value) {
            addCriterion("O_COMMENT =", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTNotEqualTo(String value) {
            addCriterion("O_COMMENT <>", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTGreaterThan(String value) {
            addCriterion("O_COMMENT >", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTGreaterThanOrEqualTo(String value) {
            addCriterion("O_COMMENT >=", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTLessThan(String value) {
            addCriterion("O_COMMENT <", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTLessThanOrEqualTo(String value) {
            addCriterion("O_COMMENT <=", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTLike(String value) {
            addCriterion("O_COMMENT like", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTNotLike(String value) {
            addCriterion("O_COMMENT not like", value, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTIn(List<String> values) {
            addCriterion("O_COMMENT in", values, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTNotIn(List<String> values) {
            addCriterion("O_COMMENT not in", values, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTBetween(String value1, String value2) {
            addCriterion("O_COMMENT between", value1, value2, "o_COMMENT");
            return (Criteria) this;
        }

        public Criteria andO_COMMENTNotBetween(String value1, String value2) {
            addCriterion("O_COMMENT not between", value1, value2, "o_COMMENT");
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