package andy.model;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

        public Criteria andRoldidIsNull() {
            addCriterion("roldId is null");
            return (Criteria) this;
        }

        public Criteria andRoldidIsNotNull() {
            addCriterion("roldId is not null");
            return (Criteria) this;
        }

        public Criteria andRoldidEqualTo(Integer value) {
            addCriterion("roldId =", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidNotEqualTo(Integer value) {
            addCriterion("roldId <>", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidGreaterThan(Integer value) {
            addCriterion("roldId >", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roldId >=", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidLessThan(Integer value) {
            addCriterion("roldId <", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidLessThanOrEqualTo(Integer value) {
            addCriterion("roldId <=", value, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidIn(List<Integer> values) {
            addCriterion("roldId in", values, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidNotIn(List<Integer> values) {
            addCriterion("roldId not in", values, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidBetween(Integer value1, Integer value2) {
            addCriterion("roldId between", value1, value2, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldidNotBetween(Integer value1, Integer value2) {
            addCriterion("roldId not between", value1, value2, "roldid");
            return (Criteria) this;
        }

        public Criteria andRoldnameIsNull() {
            addCriterion("roldName is null");
            return (Criteria) this;
        }

        public Criteria andRoldnameIsNotNull() {
            addCriterion("roldName is not null");
            return (Criteria) this;
        }

        public Criteria andRoldnameEqualTo(String value) {
            addCriterion("roldName =", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameNotEqualTo(String value) {
            addCriterion("roldName <>", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameGreaterThan(String value) {
            addCriterion("roldName >", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameGreaterThanOrEqualTo(String value) {
            addCriterion("roldName >=", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameLessThan(String value) {
            addCriterion("roldName <", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameLessThanOrEqualTo(String value) {
            addCriterion("roldName <=", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameLike(String value) {
            addCriterion("roldName like", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameNotLike(String value) {
            addCriterion("roldName not like", value, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameIn(List<String> values) {
            addCriterion("roldName in", values, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameNotIn(List<String> values) {
            addCriterion("roldName not in", values, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameBetween(String value1, String value2) {
            addCriterion("roldName between", value1, value2, "roldname");
            return (Criteria) this;
        }

        public Criteria andRoldnameNotBetween(String value1, String value2) {
            addCriterion("roldName not between", value1, value2, "roldname");
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