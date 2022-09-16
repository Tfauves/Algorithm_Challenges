--Query the list of CITY names
--from STATION that either do not start with vowels
--or
--do not end with vowels.
--Your result cannot contain duplicates.

SELECT
DISTINCT city
FROM station
WHERE Right(CITY,1)
NOT in ('a', 'e', 'i', 'o', 'u')
OR LEFT(CITY,1)
NOT in ('a', 'e', 'i', 'o', 'u');