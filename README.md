# Glints task 1

Task 1
HDB is demolishing an estate of aging flats in Redhill and wants to know how many clusters of households still reside in each block of flats. An example of a flat occupancy diagram of a single block is as below, with + representing an occupied unit and 0 representing an empty unit.

000++0
+++00+
000000
+0000+
++00+0
Any 1 or more occupied units are defined as part of household cluster if they're adjacent, be it horizontally, vertically or diagonally. In other words, this diagram below is considered to have 1 cluster.

0+0
+0+
0++
Judging by these criteria, our first example above contains 3 clusters.

Write a program for HDB that takes in an input text file with diagrams as above, and print out the number of distinct clusters. The number of rows and columns will be between 3 and 50. Include clear instructions on how to run your program with the input file. We only accept either a stdin or a < redirection, and we only expect a single integer to be printed out in the console.

Sample Input File 1

000++0
+++00+
000000
+0000+
++00+0
Sample Output 1

3

Make sure that your script can handle matrices of dimensions up to 60x60.

Sample Input File 2

0000000000++++00+00++00++0+0+000+0+
00++0000+++000000+00++0+0+0++++0+++
00++++0+0+000+0+++0+++000++00+0+++0
000+0000+0++0+++++++000++0+0+++++00
0++++0+++00+00+0000+0++0000000++000
0+0+++0++++000++++++++0000++00+0++0
++0+00000+++0++0++000++++++000++0++
0++0000+00+++0+++000+++0+0+0000+++0
0++++000++00++0+000+0000++00+000000
+0++0+++0+++++0+++00+0+0+0++0++0+0+
000000+0000++0000+++++++00++0+0+0++
0+0+++++000++++0++++00+0++00++0++++
++0++++0+0+000+000++00+0+000+0++0+0
00+0+++++++0+0+000++000+++++00+0000
+0+0+0+++0++000000+++++0+00+++0+++0
+++0+0+++00++0++++++0+++00000000++0
0+0++++0000+0+0++0+++00000000++0000
00000+++0++0000+0000++0+0+0+++00++0
0+0++0+0++++++00000++++0+000+0+00+0
0+0000+0+0+++0++000++00+00+00+00+0+
0+++++000+++0+++00++00++++++++++000
000+0000++0+++000+0+00+0+000+++++00
++0+0+0++0++++0+0+00+00+00++0+000+0
0++000+0+00++00+++00++0+0000+++00++
000+0++0+++0000+000+00++0+00+000+++
+000++0+0+0+++00++++++0+0+0+++0++00
0+0++00++0000+00++000000++0+00++000
+0+++0+++0++00+000+++00++00+0+0+0++
0000++++++++++0++00++0+0+000++0++++
+000000+0+0++0++0000++00000000++0+0
Sample Output 2

2
