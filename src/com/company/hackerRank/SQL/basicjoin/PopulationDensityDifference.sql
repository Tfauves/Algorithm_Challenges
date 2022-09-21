--Query the difference between
--the maximum and minimum populations
--in CITY.

SELECT MAX(Population) - MIN(Population)
AS PopulationDensityDifference
FROM City;