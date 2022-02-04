SELECT * FROM EMP;
SELECT * FROM DEPT;

SELECT * FROM EMP
WHERE DEPTNO IN (20,30)
;

SELECT * FROM EMP
WHERE DEPTNO NOT IN (20,30)
;

SELECT ENAME, HIREDATE 
FROM EMP
WHERE HIREDATE BETWEEN '05/01/1981' AND '12/09/1982'
;

SELECT ENAME, SAL 
FROM EMP
WHERE SAL NOT BETWEEN 1100 AND 1500
;

-- ASSIGNMENT : 
SELECT ENAME, COMM, SAL
FROM EMP
-- don't make any commission
WHERE COMM IS NULL 
-- have a salary greater than 1100 but less than 5000
-- AND SAL BETWEEN 1100 AND 5000
AND SAL > 1100 AND SAL < 5000

-- exclude that have a salary equal to 3000
AND SAL NOT IN 3000 
AND SAL <> 3000 -- <> is equal to !=
;

-- ASSIGNMENT : 
SELECT ENAME, JOB, COMM FROM EMP 
WHERE JOB = 'SALESMAN' -- employees that're salesman
AND (COMM = 300 OR COMM > 1000) -- commission is equal to 300 or greater than 1000
; 
