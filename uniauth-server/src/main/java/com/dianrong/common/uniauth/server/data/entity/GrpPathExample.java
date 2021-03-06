package com.dianrong.common.uniauth.server.data.entity;

import java.util.ArrayList;
import java.util.List;

public class GrpPathExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public GrpPathExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
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

        public Criteria andAncestorIsNull() {
            addCriterion("ancestor is null");
            return (Criteria) this;
        }

        public Criteria andAncestorIsNotNull() {
            addCriterion("ancestor is not null");
            return (Criteria) this;
        }

        public Criteria andAncestorEqualTo(Integer value) {
            addCriterion("ancestor =", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotEqualTo(Integer value) {
            addCriterion("ancestor <>", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorGreaterThan(Integer value) {
            addCriterion("ancestor >", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ancestor >=", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorLessThan(Integer value) {
            addCriterion("ancestor <", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorLessThanOrEqualTo(Integer value) {
            addCriterion("ancestor <=", value, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorIn(List<Integer> values) {
            addCriterion("ancestor in", values, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotIn(List<Integer> values) {
            addCriterion("ancestor not in", values, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorBetween(Integer value1, Integer value2) {
            addCriterion("ancestor between", value1, value2, "ancestor");
            return (Criteria) this;
        }

        public Criteria andAncestorNotBetween(Integer value1, Integer value2) {
            addCriterion("ancestor not between", value1, value2, "ancestor");
            return (Criteria) this;
        }

        public Criteria andDescendantIsNull() {
            addCriterion("descendant is null");
            return (Criteria) this;
        }

        public Criteria andDescendantIsNotNull() {
            addCriterion("descendant is not null");
            return (Criteria) this;
        }

        public Criteria andDescendantEqualTo(Integer value) {
            addCriterion("descendant =", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantNotEqualTo(Integer value) {
            addCriterion("descendant <>", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantGreaterThan(Integer value) {
            addCriterion("descendant >", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantGreaterThanOrEqualTo(Integer value) {
            addCriterion("descendant >=", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantLessThan(Integer value) {
            addCriterion("descendant <", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantLessThanOrEqualTo(Integer value) {
            addCriterion("descendant <=", value, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantIn(List<Integer> values) {
            addCriterion("descendant in", values, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantNotIn(List<Integer> values) {
            addCriterion("descendant not in", values, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantBetween(Integer value1, Integer value2) {
            addCriterion("descendant between", value1, value2, "descendant");
            return (Criteria) this;
        }

        public Criteria andDescendantNotBetween(Integer value1, Integer value2) {
            addCriterion("descendant not between", value1, value2, "descendant");
            return (Criteria) this;
        }

        public Criteria andDeepthIsNull() {
            addCriterion("deepth is null");
            return (Criteria) this;
        }

        public Criteria andDeepthIsNotNull() {
            addCriterion("deepth is not null");
            return (Criteria) this;
        }

        public Criteria andDeepthEqualTo(Byte value) {
            addCriterion("deepth =", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthNotEqualTo(Byte value) {
            addCriterion("deepth <>", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthGreaterThan(Byte value) {
            addCriterion("deepth >", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthGreaterThanOrEqualTo(Byte value) {
            addCriterion("deepth >=", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthLessThan(Byte value) {
            addCriterion("deepth <", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthLessThanOrEqualTo(Byte value) {
            addCriterion("deepth <=", value, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthIn(List<Byte> values) {
            addCriterion("deepth in", values, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthNotIn(List<Byte> values) {
            addCriterion("deepth not in", values, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthBetween(Byte value1, Byte value2) {
            addCriterion("deepth between", value1, value2, "deepth");
            return (Criteria) this;
        }

        public Criteria andDeepthNotBetween(Byte value1, Byte value2) {
            addCriterion("deepth not between", value1, value2, "deepth");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * grp_path
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 27 11:53:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table
     * grp_path
     *
     * @mbggenerated Tue Sep 27 11:53:21 CST 2016
     */
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
