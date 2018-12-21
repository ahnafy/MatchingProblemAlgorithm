## Correctness 

Eventually as all the pairs are made, the algorithm finally stops after it is done keeping track of number of pairs.

The algorithm first tries to match a company's first choice.

Provided that is taken, the algorithm checks if the programmer prefers this company compared to the one it is already paired with. 

If this company is not preferred, the algorithm moves to the next programmer on the list.

## Efficiency 

The worst case of this algorithm is O(N3). 

This is because there are 3 inner for loops:

* The loop for the list of companies

* Each company's list of preferences

* The method for checking which company the programmer prefers

Each has a worst case of O(N), where N is the number of pairs to be made

## Resources

https://www.geeksforgeeks.org/stable-marriage-problem/ 
