SELECT LEFT(PRODUCT_CODE,2) AS 'CATEGORY', COUNT(PRODUCT_CODE) AS 'PRODUCTS' FROM PRODUCT GROUP BY CATEGORY ORDER BY CATEGORY