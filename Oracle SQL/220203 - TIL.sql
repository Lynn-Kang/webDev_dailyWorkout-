-- LIKE operator : SEARCH FOR ~~ kind of match (NOT 100% correct)
SELECT * FROM EMP
WHERE JOB LIKE 'S%' -- start with 'S' , wild card 
WHERE JOB LIKE '%GER'
-- WHERE JOB LIKE 's%' -- no data found (UPPER/lower must be checked)