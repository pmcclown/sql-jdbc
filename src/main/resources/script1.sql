select name, product_name from ORDERS
                                   join CUSTOMERS on ORDERS.customer_id = CUSTOMERS.id
where lower(CUSTOMERS.name) = lower('ALeXey');