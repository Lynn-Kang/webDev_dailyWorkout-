-- Alias: making much more meaningful, easy to understand
SELECT ENAME EMPLOYEE_NAME, SAL INCOME, COMM COMMISSION 
SELECT ENAME "employee NAME", SAL INCOME, COMM COMMISSION -- use "" for Alias, use '' for String dataType
SELECT ENAME as Employee_name, SAL as INCOME, COMM as COMMISSION
FROM EMP;

-- Concatenation : combine 2 attributes into 1 sentence. (operator: pipes || )
SELECT 'Hello, My name is ' || ename as "concatenated value", -- use "" for Alias, use '' for String dataType
       JOB 
FROM EMP
WHERE JOB = 'MANAGER';  

    -- ASSIGNMENT: King makes $5000 per month, Blake makes $2850 per month
    SELECT ename || ' makes $' || sal || ' per month' as "Report"
    FROM EMP;

-- ORDER BY + ascending / descending 
SELECT DEPTNO, ENAME
FROM EMP
ORDER BY DEPTNO;

SELECT DEPTNO, ENAME
FROM EMP
ORDER BY ENAME DESC;

SELECT *
FROM EMP
ORDER BY DEPTNO, SAL;

--  Assignment : Practice with Single Table Queries
1.
    SELECT SUPPLIER_NAME, STATE 
    FROM SUPPLIER_MNG
    WHERE STATE = 'Georgia' 
    OR STATE = 'California'
    ;

2.
    SELECT SUPPLIER_NAME
    FROM SUPPLIER_MNG
    -- WHERE SUPPLIER_NAME = '%wo%' 
        -- = : exactly data, like : similar data
    WHERE SUPPLIER_NAME like '%wo%'
    -- AND (SUPPLIER_NAME = '%l%' OR SUPPLIER_NAME = '%i%')
    AND (SUPPLIER_NAME like '%l%' OR SUPPLIER_NAME like '%i%')
    ;

3.
    SELECT SUPPLIER_NAME, TOTAL_SPENT
    FROM SUPPLIER_MNG
    WHERE TOTAL_SPENT BETWEEN 37000 AND 80000
    ORDER BY TOTAL_SPENT
    ;

4.
    SELECT SUPPLIER_NAME, STATE
    -- FROM clause missing
    FROM SUPPLIER_MNG
    -- WHERE (STATE = 'Georgia' OR STATE = 'Alaska')
    WHERE STATE IN ('Georgia','Alaska')
    AND (SUPPLIER_ID = 100 OR SUPPLIER_ID > 600)
    AND (TOTAL_SPENT < 100000 OR TOTAL_SPENT = 220000)
    ;

5. FALSE
6. FALSE 
-- 7. FALSE (SELECT  *)
7. TRUE / WHERE 1=1 means no WHERE clause. It will always be true (All records will be returned). 
-- 8. FALSE
8. TRUE / 
9. FALSE / ORDER BY is one of the last clauses processed by the database query engine

-- Section 3: Single Row Functions (SRF) & USING THE Dual TABLE 

-- Function : predefined, has own its name
-- SRF(Single Row Function): 1 row at a time, perform every sigle row of the table 

-- select 'my name is ' || ename
-- from emp
-- ;
select CONCAT('my name is..',ename) as SENTENCE
from emp
;

SELECT UPPER('hello')
from emp
where deptno=20;

SELECT 'hellop'
from dept
;

-- Dual : temporarily supplied by Oracle / mainly used for testing query 
SELECT lower('donghee KANG')
from DUAL
;

SELECT 'pizza' as FOOD, 
'pepsi' as COKE,
CONCAT('May I help you? ', initcap(ename)) as Greeting
FROM emp;

-- Dual + Function (SRFs)
SELECT CONCAT(lower(ename), upper(' is the name')) as S
from EMP;

-- ASSIGNMENT: king IS THE NAME and their job is : MANAGER 🙌
SELECT CONCAT( concat(lower(ename), upper(' is the name')) , concat(' and their job is: ',job) ) as "Function call"
from EMP;

-- Details of SRFs
    
-- WHERE Clause can also do function call
SELECT * FROM EMP
WHERE LOWER(ENAME)='martin';
WHERE job = upper('manager');

-- String SRFs : concat, upper, lower, initcap, length
SELECT initcap('hello my name is donghee kang') -- Capitalize first letter of every word
SELECT length('hello my name is donghee kang') -- Length incl.space
SELECT substr('hello',0,3)-- Extract the part of String (Oracle's first: 1)
from dual
;
SELECT ename,
       length(ename) as "LENGTH"
from emp
WHERE length(ename) = 6
;
SELECT substr('wiorjI LOVE YOUqwoghrewerj',6,10) -- argument : material, start idx, how many
FROM DUAL
;
SELECT LPAD(initcap('donghee'),11,'&') -- argument : material, total width(length) after the func, added character in front of material
SELECT RPAD(initcap('donghee'),11,'&') -- argument : material, total width(length) after the func, added character end of material
FROM DUAL
;
SELECT RTRIM('HHHhellohhhh','h')
from dual
;

-- Numeric and Date SRFs
SELECT round(107.088,2) -- 107.09
SELECT round(107.088) -- 107
SELECT round(107.5) -- 108 (반올림)
SELECT trunc(100.882538977) -- 100 
SELECT trunc(100.882538977,3) -- removes the rest according to parameter(2nd) 100.882
FROM DUAL
; 

select SYSDATE 
select SYSTIMESTAMP
select add_months(SYSDATE,100)
select months_between('12/8/1990','2/4/2022') -- arguments : smaller date, larger date / year doesn't matter / -373.87096774193548387096774193548387097
select months_between('2/4/2022','12/8/1990') --                                                                373.870967741935483870967741935483870968
select months_between('2/4/2022','9/20/1989') --                                                                388.483870967741935483870967741935483871
select months_between('2/4/2022','3/3/1986') --                                                                 431.032258064516129032258064516129032258
select months_between('2/4/2022','8/17/1960') --                                                                737.580645161290322580645161290322580645
select months_between('2/4/2022','12/2/1957') --                                                                770.064516129032258064516129032258064516
select trunc(SYSTIMESTAMP) -- equal to SYSDATE
select trunc(SYSTIMESTAMP,'YEAR') 
FROM DUAL
;
select ename
       ,hiredate 
    --    ,trunc(hiredate,'YEAR')
       ,trunc(hiredate,'MONTH') 
FROM emp
;
select ename, hiredate, trunc(hiredate,'MONTH') --  05/01/1981
from emp
where trunc(hiredate,'YEAR') = '01/01/1982'
;