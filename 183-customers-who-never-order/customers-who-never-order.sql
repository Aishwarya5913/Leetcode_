# Write your MySQL query statement below
select name as Customers
from customers c1
left join orders c2
on c1.id = c2.customerid
where customerid is null;
