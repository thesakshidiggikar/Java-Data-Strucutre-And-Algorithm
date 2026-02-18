# Java Data Structures & Algorithms

A comprehensive collection of Java programming examples, data structures, and algorithmic problem-solving patterns. This repository serves as a complete reference for learning DSA and technical interview preparation.

---

## Project Overview

This repository documents a structured learning journey from Java fundamentals to advanced data structures and algorithms. It is designed to help programmers:

- Master Core Java — from basic syntax to object-oriented principles
- Understand Data Structures — implementation and practical application of arrays, linked lists, trees, queues, stacks, and hash tables
- Learn Algorithmic Patterns — two-pointer technique, sliding window, binary search, recursion, and dynamic programming
- Prepare for Technical Interviews — coverage of high-frequency problems from leading tech companies

## Key Features

- Progressive Learning Path — Logical progression from basics to advanced concepts
- Clean, Readable Code — Well-structured implementations with comprehensive comments
- Multiple Approaches — Various solutions to the same problem for deeper understanding
- Interview-Focused — Topics and problems aligned with technical interview requirements
- Hands-on Practice — 100+ practical exercises across different domains

## Directory Structure

### 1. Basic_of_Java

Foundational Java concepts and syntax fundamentals.

| File                                           | Topic                           |
| ---------------------------------------------- | ------------------------------- |
| HelloWorld.java, Variable.java                 | Variables and Basic Output      |
| Forloop.java, Whileloop.java, DoWhileLoop.java | Loop Constructs                 |
| IfElse.java, SwitchCase.java                   | Conditional Logic               |
| InputFromUser.java, InputVariable.java         | User Input Handling             |
| Pattern1-9.java, AdvPattern1.java              | Logic-Building Pattern Printing |
| OddEven.java, SumOfNNautralNumbers.java        | Basic Math Problems             |

### 2. DSA — Data Structures & Algorithms (Core Module)

#### Linear Data Structures

- **Arrays** — Basic operations, searching, 2D arrays, and array-specific problem patterns
  - Arrays/Basic.java — Array fundamentals
  - Arrays/SearchELement.java — Efficient search algorithms
  - Arrays_Patterns/ — Specialized array problem patterns
- **LinkedList** — Single and doubly linked lists, common operations
- **Stack** — Stack implementation and pattern-based problems
- **Queue** — Queue operations and specialized queue problems
- **Strings** — String manipulation and pattern matching

#### Non-Linear Data Structures

- **Tree** — Binary trees, BST, tree traversals, and tree problems
- **HashSet & HashMap** — Hash-based data structure implementations and usage

#### Algorithmic Patterns

- **Recursion** — Recursive problem-solving and backtracking
- **Sortings** — Bubble sort, merge sort, quick sort implementations
- **Sliding Window** — Fixed window and variable window techniques
- **Two Pointer Approach** — Pointer manipulation for optimized solutions
- **Collections Framework** — Java's built-in collection utilities

### 3. PatternPractice (Specialized Problem Patterns)

Focused practice on recognizing and applying specific algorithmic patterns:

- **Binary Search** — Classic binary search and searching variants
- **Sliding Window** — Problems requiring window-based iteration
- **Two Pointers** — Optimization techniques for array and string problems
- **Stack** — Monotonic stack and other stack-based approaches
- **LeetCode-Style Problems** — Real interview questions with solutions

**Sample Problems:**

- TwoSum.java — Finding pairs with target sum
- MaximumSubarray.java — Kadane's algorithm
- ValidParentheses.java — Stack-based solution
- LongestSubstring.java — Sliding window approach
- BinarySearch.java — Searching in sorted arrays

### 4. Practice1 & Round0 (Miscellaneous)

General coding practice and entry-level problems:

- Basic arithmetic and logic problems
- Initial DSA practice problems
- Experimental implementations

## Quick Start

### Prerequisites

- **Java Development Kit (JDK)** — Version 8 or higher
  - Download from [oracle.com](https://www.oracle.com/java/technologies/downloads/) or use [OpenJDK](https://openjdk.org/)
- **IDE/Editor** — VS Code, IntelliJ IDEA, or any Java-compatible editor
- **Java Command Line Tools** — javac (compiler) and java (runtime)

### Running Java Programs

#### Method 1: Command Line

```bash
# Navigate to the file's directory
cd Basic_of_Java

# Compile the Java program
javac MyFirstCode.java

# Run the compiled program
java MyFirstCode
```

#### Method 2: VS Code (Using Built-in Tasks)

The project includes VS Code tasks for quick compilation and execution:

1. **Compile:** Ctrl+Shift+B → Select "Compile MyFirstCode"
2. **Run:** Ctrl+Shift+B → Select "Run MyFirstCode" (automatically compiles first)

#### Method 3: IDE

- Open any .java file in IntelliJ IDEA or VS Code with Java extensions
- Click the "Run" button or use the keyboard shortcut (usually Shift+F10 or Ctrl+F5)

### Example: Running Pattern Programs

```bash
cd Basic_of_Java
javac Pattern1.java
java Pattern1
# Output: Various pattern outputs based on the program logic
```

## Topics Covered

### Java Fundamentals

- Variables and data types
- Control flow (loops, conditionals)
- Functions and methods
- Object-oriented programming basics

### Data Structures

| Data Structure | Files               | Concepts                                 |
| -------------- | ------------------- | ---------------------------------------- |
| Arrays         | DSA/Arrays/         | Traversal, searching, sorting, 2D arrays |
| LinkedList     | DSA/LinkedList/     | Insertion, deletion, traversal           |
| Stack          | DSA/StackTechnique/ | Push, pop, stack-based problems          |
| Queue          | DSA/Queue/          | Enqueue, dequeue, circular queues        |
| Trees          | DSA/Tree/           | Traversals, BST, tree problems           |
| Hash Tables    | DSA/HashSet/        | Hashing, collision handling              |
| Strings        | DSA/Strings/        | String manipulation, pattern matching    |

### Algorithmic Techniques

| Technique      | Files                             | Use Cases                      |
| -------------- | --------------------------------- | ------------------------------ |
| Recursion      | DSA/Recursion/                    | Divide & conquer, backtracking |
| Two Pointers   | DSA/TwoPointerApproach/           | Array problems, palindromes    |
| Sliding Window | DSA/SlidingWindow/                | Substring/subarray problems    |
| Binary Search  | PatternBasic/BinarySearch.java    | Searching sorted data          |
| Sorting        | DSA/Sortings/                     | Various sorting algorithms     |
| Prefix Sum     | DSA/Arrays_Patterns/05_PrefixSum/ | Range sum queries              |

## Learning Outcomes

After exploring this repository, you will understand:

- Core Java syntax and object-oriented principles
- How to design and implement fundamental data structures
- When and how to apply different algorithmic patterns
- Optimization techniques for solving coding problems efficiently
- How to approach and solve real-world technical interview questions
- Time and space complexity analysis

## How to Use This Repository

### For Beginners

1. Start with Basic_of_Java/ to understand Java syntax
2. Move to DSA/ and explore data structures progressively
3. Practice implementation of each data structure

### For Interview Preparation

1. Study the relevant algorithmic patterns in PatternPractice/ and PatternBasic/
2. Solve the example problems provided
3. Analyze time and space complexity of solutions
4. Modify and extend solutions for deeper understanding

### For Quick Reference

- Use Ctrl+F (or Cmd+F on Mac) to search for specific topics
- Check the directory structure above for file organization
- Each file typically contains one focused concept or problem

## Tech Stack

| Component   | Details                       |
| ----------- | ----------------------------- |
| Language    | Java (JDK 8+)                 |
| IDE         | VS Code                       |
| Build Tools | Maven, Gradle (if applicable) |
| Repository  | Git/GitHub                    |

## Repository Statistics

- Total Java Programs: 100+
- Topics Covered: 20+
- Problem Categories: 10+
- Last Updated: February 2026

## Contributing

This is a personal learning repository, but suggestions and improvements are welcome.

If you would like to:

- Report issues or improvements
- Add new problem solutions
- Improve documentation
- Fix bugs

Feel free to create an issue or fork the repository.

## Recommended Resources

- **Books**: "Cracking the Coding Interview" by Gayle Laakmann McDowell
- **Websites**: LeetCode, HackerRank, CodeSignal
- **Java Documentation**: [Official Java Docs](https://docs.oracle.com/en/java/)
- **DSA Courses**: Coursera, Udemy, GeeksforGeeks

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---

## Quick Links

- GitHub Repository: [Java-Data-Structure-And-Algorithm](https://github.com/thesakshidiggikar/Java-Data-Strucutre-And-Algorithm)
- Author: [Sakshi Diggikar](https://github.com/thesakshidiggikar)

---

Built with dedication for the Java and DSA learning community.
