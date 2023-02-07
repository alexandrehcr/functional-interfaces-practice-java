# Practice with Java's Functional Interfaces

This repository is dedicated to explore the functional interfaces in Java, including _Comparable_, _Comparator_, _Predicate_, _Consumer_, and _Function_. Using product list, implement these interfaces through five distinct techniques[^1], including anonymous classes and lambda expressions.

The code demonstrates the usage of the functional interfaces as follows:

- Sorting the list of products by name and price with the `Collections.sort()` method using the _Comparable_ interface, and using the `List.sort()` method using the _Comparator_ interface;
- Filtering items using the `List.removeIf()` method and the _Predicate_ interface;
- Adjusting prices with the `List.forEach()` method and the _Consumer_ interface; and
- Converting product names to uppercase using the `Stream.map()` method and the _Function_ interface.

Each commit in the repository presents a different implementation approach, offering a comprehensive comparison of the techniques used in the functional interface implementation, providing an understanding of the strengths and limitations of each approach.

**Footnotes:**

[^1]: Techniques include: instantiating a class implementing the functional interface, using a static method reference, a non-static method reference, a declared lambda expression, and a lambda expression as an argument to the method.
