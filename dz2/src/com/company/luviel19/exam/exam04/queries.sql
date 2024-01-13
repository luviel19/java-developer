SELECT b.name, ft.departureDate, c.fishType, c.weight
FROM Boat b
         JOIN FishingTrip ft ON b.id = ft.boat_id
         JOIN Catch c ON ft.id = c.fishingTrip_id;

-- Для каждого катера вывести количество рейсов
SELECT b.name, COUNT(ft.id) as tripCount
FROM Boat b
         JOIN FishingTrip ft ON b.id = ft.boat_id
GROUP BY b.name;

-- Вывести список катеров, которые получили улов выше заданного значения
SELECT b.name
FROM Boat b
         JOIN FishingTrip ft ON b.id = ft.boat_id
         JOIN Catch c ON ft.id = c.fishingTrip_id
GROUP BY b.name
HAVING SUM(c.weight) > []; --заданное значение