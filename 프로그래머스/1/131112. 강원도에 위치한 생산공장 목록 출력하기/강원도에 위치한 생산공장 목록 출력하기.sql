SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE LEFT(ADDRESS,3) = '강원도'
ORDER BY FACTORY_ID