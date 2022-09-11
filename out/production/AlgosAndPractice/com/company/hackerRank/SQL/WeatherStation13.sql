--Query the sum of Northern Latitudes (LAT_N) from STATION
--having values greater than and less than .
--Truncate your answer to decimal places.

SELECT TRUNCATE(sum(lat_n), 4)
FROM station
WHERE lat_n BETWEEN 38.7881
AND 137.2344;