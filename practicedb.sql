1. select COLUMN_NAME
from INFORMATION_SCHEMA.COLUMNS
where TABLE_SCHEMA = 'practicedb'
and TABLE_NAME = 'salespeople';

2. SELECT cnum, cname from customers where rating = 100;

3. select * from customers where city is NULL;

4. select onum, odate, s.sname, o.snum, max(amt) from orders o join salespeople s on s.snum = o. snum group by odate, s.sname;

5. select * from orders order by cnum desc;

6. select distinct o.snum, s.sname from orders o join salespeople s on o.snum = s.snum ;

7. select c.cname, s.sname from customers c join salespeople s on c.snum = s.snum;

8. select t.sname, t.snum from (select s.sname, s.snum, count(c.cnum) from salespeople s join customers c on s.snum = c.snum) as t;

9. select  s.snum, s.sname, count(o.snum) num_of_orders from orders o right outer join salespeople s on s.snum = o.snum group by o.snum order by num_of_orders desc;

10. select * from customers where city = 'san jose';

11. select * from salespeople s join customers c on s.city = c.city and s.snum = c.snum;

12. select s.sname, s.snum, max(amt) from orders o right outer join salespeople s on s.snum = o.snum group by s.snum;

13. select * from customers where rating > 200 and city = 'san jose';

14. select s.sname, s.comm from salespeople s where s.city = 'london';

15. select o.onum, o.snum, s.sname, s.snum from salespeople s join orders o on s.snum = o.snum where s.sname = 'motika';

16. select o.onum, o.odate, c.cnum, c.cname from orders o join customers c on o.cnum = c.cnum where o.odate =  '10/03/96';

17. select sum(amt) sum_amt, o.odate, max(amt) max_amt from orders o group by o.odate having sum_amt >= 2000+max_amt;

18. select o.onum, o.odate, o.amt from orders o where o.amt > (select min(amt) from orders where odate = '10/06/96');

OR

select * from orders o 
where exists 
(select 1 from orders o2
where odate='10/06/96'
and o.amt > o2.amt);

?19. select * from salespeople s join customers c on s.snum = c.snum where exists (select * from customers c1 where c1.rating = 300);

20. select c1.cname, c2.cname, c1.rating from customers c1 join customers c2 on c1.rating = c2.rating and c1.cname < c2.cname;

21. select c.cname, c.cnum from customers c join salespeople s on c.snum = s.snum where c.cnum >= (1000 + (select s1.snum from salespeople s1 where s1.sname ='serres'));

22. select round(t.comm*100) as comm_percentage, t.sname from (select comm, sname from salespeople) as t;

23. select * from (select o.odate, s.sname, max(o.amt) as max_order from orders o right join salespeople s on s.snum = o.snum group by o.odate) as t where t.max_order > 3000;

24. select t.odate, t.sname, max(t.amt) from (select o.odate, o.amt, s.sname from orders o join salespeople s on s.snum = o.snum where o.odate = '10/03/96') as t group by t.sname; 

25. select c1.city, c1.cname, s1.sname from customers c1 join salespeople s1 on s1.snum = c1.snum where exists (select 1 from customers c join salespeople s on s.snum = c.snum where s.sname = 'serres' and c.city = c1.city);

26. select c.cname, c.rating from customers c where c.rating > 200;

27. select count(*) from (select distinct o.snum, s.sname from orders o join salespeople s on s.snum = o.snum) as t;

28. select * from (select c.cname, s.sname, round(100*s.comm) as comm_percent from customers c join salespeople s on s.snum = c.snum) as t where t.comm_percent > 12; 

29. select s.sname, count(c.snum) as s_count from salespeople s join customers c on s.snum = c.snum group by c.snum having s_count > 1;