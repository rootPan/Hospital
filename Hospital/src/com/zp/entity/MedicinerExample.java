package com.zp.entity;

import java.util.ArrayList;
import java.util.List;

public class MedicinerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicinerExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mName is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mName is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mName =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mName <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mName >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mName >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mName <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mName <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mName like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mName not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mName in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mName not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mName between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mName not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMspecIsNull() {
            addCriterion("mSpec is null");
            return (Criteria) this;
        }

        public Criteria andMspecIsNotNull() {
            addCriterion("mSpec is not null");
            return (Criteria) this;
        }

        public Criteria andMspecEqualTo(String value) {
            addCriterion("mSpec =", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecNotEqualTo(String value) {
            addCriterion("mSpec <>", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecGreaterThan(String value) {
            addCriterion("mSpec >", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecGreaterThanOrEqualTo(String value) {
            addCriterion("mSpec >=", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecLessThan(String value) {
            addCriterion("mSpec <", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecLessThanOrEqualTo(String value) {
            addCriterion("mSpec <=", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecLike(String value) {
            addCriterion("mSpec like", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecNotLike(String value) {
            addCriterion("mSpec not like", value, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecIn(List<String> values) {
            addCriterion("mSpec in", values, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecNotIn(List<String> values) {
            addCriterion("mSpec not in", values, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecBetween(String value1, String value2) {
            addCriterion("mSpec between", value1, value2, "mspec");
            return (Criteria) this;
        }

        public Criteria andMspecNotBetween(String value1, String value2) {
            addCriterion("mSpec not between", value1, value2, "mspec");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayIsNull() {
            addCriterion("surgeryWeekday is null");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayIsNotNull() {
            addCriterion("surgeryWeekday is not null");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayEqualTo(String value) {
            addCriterion("surgeryWeekday =", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayNotEqualTo(String value) {
            addCriterion("surgeryWeekday <>", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayGreaterThan(String value) {
            addCriterion("surgeryWeekday >", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayGreaterThanOrEqualTo(String value) {
            addCriterion("surgeryWeekday >=", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayLessThan(String value) {
            addCriterion("surgeryWeekday <", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayLessThanOrEqualTo(String value) {
            addCriterion("surgeryWeekday <=", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayLike(String value) {
            addCriterion("surgeryWeekday like", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayNotLike(String value) {
            addCriterion("surgeryWeekday not like", value, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayIn(List<String> values) {
            addCriterion("surgeryWeekday in", values, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayNotIn(List<String> values) {
            addCriterion("surgeryWeekday not in", values, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayBetween(String value1, String value2) {
            addCriterion("surgeryWeekday between", value1, value2, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andSurgeryweekdayNotBetween(String value1, String value2) {
            addCriterion("surgeryWeekday not between", value1, value2, "surgeryweekday");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsIsNull() {
            addCriterion("limit_visits is null");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsIsNotNull() {
            addCriterion("limit_visits is not null");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsEqualTo(Integer value) {
            addCriterion("limit_visits =", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsNotEqualTo(Integer value) {
            addCriterion("limit_visits <>", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsGreaterThan(Integer value) {
            addCriterion("limit_visits >", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_visits >=", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsLessThan(Integer value) {
            addCriterion("limit_visits <", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsLessThanOrEqualTo(Integer value) {
            addCriterion("limit_visits <=", value, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsIn(List<Integer> values) {
            addCriterion("limit_visits in", values, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsNotIn(List<Integer> values) {
            addCriterion("limit_visits not in", values, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsBetween(Integer value1, Integer value2) {
            addCriterion("limit_visits between", value1, value2, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andLimitVisitsNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_visits not between", value1, value2, "limitVisits");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
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