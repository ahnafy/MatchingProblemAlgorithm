
```
Matching Problem
```
Your task is to design and implement an algorithm that finds a solution to
the following problem:

```
N programmers are looking for a job;
N companies are looking to hire a programmer.
Each programmer has a ranking of the companies based on his/her
preferences for a workplace.
Likewise, each company has a ranking of the N programmers
based on whom they would like to hire.
```

Given a set of rankings, it may be impossible to find a pairing of pro-
grammers with companies when everyone gets their first choice (what would
be an example of such ranking, say, among 3 programmers and companies?).
However, it is always possible to find a satisfactory pairing. A pairing of
programmers with companies is called satisfactory if there is no pair of as-
signments (P1, C1), (P2, C2) (denoting programmers as P and companies
as C) such that P1 ranks C2 higher than C1 and C2 ranks P1 higher than
P2 (in other words, P1 can switch to C1 to increase both their own and C1’s
level of satisfaction).

Below is an example of preferences of five companies A, B, C, D, E and
five programmers 1, 2, 3, 4, 5:

```
A B C D E 1 2 3 4 5
2 1 5 1 2 E D D C A
5 2 3 3 3 A E B B D
1 3 2 2 5 D B C D B
3 4 1 4 4 B A E A C
4 5 4 5 1 C C A E E
```
The pairing A1 B3 C2 D4 E5 is unsatisfactory since A prefers programmer 2
to programmer 1 and programmer 2 prefers company A to company C. Find
a satisfactory pairing; you may use it as your test example.

Your task is to do the following:

1. Develop an algorithm that, given preferences for N programmers and
    N companies, finds a satisfactory pairing. If there is more than one
    satisfactory pairing, you need to find just one.
2. Implement your algorithm and test it on several cases of preferences. It
    does not matter how your algorithm takes data, but you should clearly
    explain this in the documentation so that we know how to test it. Also
    make sure to document all your test cases and results. Check that the
    pairings found by your program are satisfactory (write a method to do
    this to save yourself some time).
3. Explain why your algorithm is correct (i.e. it always stops and
    outputs a satisfactory pairing). You don’t need to go into low-level
    details of your program, but your argument must be precise enough to
   convince someone who has not seen your program before that it is
   indeed correct.

4. Find the efficiency of your algorithm in the worst case, justify your
    answer.

```
What to submit
```
- Your program, appropriately documented. Your program may read
    data in any convenient format (from the Java console or from a file).
    The comments in the program should clearly explain how it reads the
    data (examples help). If you are reading data from a file, please include
    the test files, otherwise just copy/paste the test data into a separate
    file or into comments at the end of the program.
- The test data and the results.
- A clear explanation of your algorithm in English.
- Answers to all questions above, with required explanations.


