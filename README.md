received a grade of 77% along with Assignment3

## Problem Statement

Using the principles, mechanisms, and techniques seen in Chapters 5 and 6 of the book, design and write the code necessary to enhance the movie library design from the baseline code (adapted from solutions to Assignment 2 and 3) to meet the following requirements. *Your solution should continue to respect principles of good design seen in all prior chapters.*

1. Make it possible to create an enhanced Watchlist filter that is the conjunction (logical "and") of *existing* filters. Make it also possible to create an enhance filter that is the disjunction (logical "or") of *existing* filters. Ensure the enhanced filters *reuse* the filters that exist in the code (including potentially new ones implemented by the client). Demonstrate your design for the following scenario in the Driver: First, implement two new filters, one to select Watchable elements from an arbitrary publishing studio, and the other to select the first episode of all TV shows. Then, in the Driver code, generate a Watchlist of the first episodes of all TV shows from the WarnerBrothers studio that are in either English or French, using the enhanced filters. The LanguageFilter has already been created for you. [5 points]
2. Use the Prototype design pattern to help clients create new Episodes for a particular TV show by defining default values to properties that could remain the same between Episodes. Assume that clients can only create new Episodes via the TVShow class (i.e., they can not directly call creational methods in Episode). Draw a Sequence Diagram (using JetUML or other diagram tool) to demonstrate the creation of a new Episode with prototype. [5 points]
3. Create unit tests to *thoroughly* test your code from Problem 1 and Problem 2. Demonstrate both white box (structural) and black box (functional) testing techniques. [5 points]

