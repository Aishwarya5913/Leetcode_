# Write your MySQL query statement below
select product_name , year, price
from product p
inner join sales s 
on s.product_id = p.product_id
