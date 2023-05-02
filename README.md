# Advent of code 2022 - day 1

## Today's challenge

Given a list of inventories containing food items' caloric values, find the inventory with the largest caloric sum.

## Implementation

The input is a text file with each caloric value in a separate line. Inventories are separated by an additional blank line.
The file can be read whole, split first on double newline characters (to inventories), and then mapped and the individual inventories split again (to items).
So a list of lists of strings is created. Each internal list of strings has to be mapped to their parsed integers.
Then each inventory can be mapped to its sum. Then the max element of the list of inventories has to be found.

## Part 2 plot twist

The top 3 inventories' sum must be found.
The beginning is the same as above. At the end, instead of finding the max element of the inventory list, we just sort the list of inventories descending, take the first 3 elements and sum them.

## What I learned

* Reading the whole file with okio: `val contents = FileSystem.SYSTEM.read(path) { readUtf8() }`
* To get rid of the unnecessary newline at the end of the file just `dropLast(1)`
* `List.sortedDescending()`, `List.sum()`, `List().max()`
