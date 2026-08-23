CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        SELECT MAX(salary) AS getNthHighestSalary
        FROM (
            SELECT salary,
            DENSE_RANK() OVER(ORDER BY salary DESC) AS `rank`
            FROM Employee
        ) t
        WHERE `rank`=N
  );
END