package com.zp.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dName is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dName is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dName =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dName <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dName >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dName >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dName <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dName <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dName like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dName not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dName in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dName not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dName between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dName not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDspecIsNull() {
            addCriterion("dSpec is null");
            return (Criteria) this;
        }

        public Criteria andDspecIsNotNull() {
            addCriterion("dSpec is not null");
            return (Criteria) this;
        }

        public Criteria andDspecEqualTo(String value) {
            addCriterion("dSpec =", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecNotEqualTo(String value) {
            addCriterion("dSpec <>", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecGreaterThan(String value) {
            addCriterion("dSpec >", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecGreaterThanOrEqualTo(String value) {
            addCriterion("dSpec >=", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecLessThan(String value) {
            addCriterion("dSpec <", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecLessThanOrEqualTo(String value) {
            addCriterion("dSpec <=", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecLike(String value) {
            addCriterion("dSpec like", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecNotLike(String value) {
            addCriterion("dSpec not like", value, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecIn(List<String> values) {
            addCriterion("dSpec in", values, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecNotIn(List<String> values) {
            addCriterion("dSpec not in", values, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecBetween(String value1, String value2) {
            addCriterion("dSpec between", value1, value2, "dspec");
            return (Criteria) this;
        }

        public Criteria andDspecNotBetween(String value1, String value2) {
            addCriterion("dSpec not between", value1, value2, "dspec");
            return (Criteria) this;
        }

        public Criteria andPdidIsNull() {
            addCriterion("pDid is null");
            return (Criteria) this;
        }

        public Criteria andPdidIsNotNull() {
            addCriterion("pDid is not null");
            return (Criteria) this;
        }

        public Criteria andPdidEqualTo(Integer value) {
            addCriterion("pDid =", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotEqualTo(Integer value) {
            addCriterion("pDid <>", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThan(Integer value) {
            addCriterion("pDid >", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pDid >=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThan(Integer value) {
            addCriterion("pDid <", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidLessThanOrEqualTo(Integer value) {
            addCriterion("pDid <=", value, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidIn(List<Integer> values) {
            addCriterion("pDid in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotIn(List<Integer> values) {
            addCriterion("pDid not in", values, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidBetween(Integer value1, Integer value2) {
            addCriterion("pDid between", value1, value2, "pdid");
            return (Criteria) this;
        }

        public Criteria andPdidNotBetween(Integer value1, Integer value2) {
            addCriterion("pDid not between", value1, value2, "pdid");
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