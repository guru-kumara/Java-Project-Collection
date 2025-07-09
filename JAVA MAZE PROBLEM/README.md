# 🧭 Java Maze Shortest Path Finder

This project implements a **shortest path finder in a square maze** (`n x n`) using **Dijkstra’s Algorithm** with 8-directional movement (up, down, left, right, and diagonals). The program is CLI-based and allows users to input a source and destination position and computes the shortest path between them.

---

## 🎯 Features

- Accepts matrix size and source/destination positions via **Scanner input**
- Visualizes the matrix and path progress
- Uses a **priority queue** (min-heap) to implement Dijkstra’s algorithm
- Allows **8-directional movement** (N, S, E, W, NE, NW, SE, SW)
- Efficient time complexity for pathfinding

---

## 📁 File Structure

```
JAVA MAZE PROBLEM/
├── Shortestpath.java
└── README.md

---

---
```
## 🧠 Concepts Used

- Graph Algorithms
- Dijkstra’s Algorithm
- Java PriorityQueue with Custom Comparator
- 2D Arrays and Matrix Traversal
- CLI Input with Scanner

---

## 🔢 Matrix Notation

- `1` → Source (Adventurer)
- `2` → Destination (Goal)
- `0` → Empty Cell

Example output for a 5x5 matrix:
```
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 2
```
---

---

## 🖥️ How to Run

1. Save `Shortestpath.java`
2. Compile:
```bash
javac Shortestpath.java
java Shortestpath
---

📋 Menu Options:
0: Shortest Path
1: Exit
---
🧪 Sample Input/Output:
Enter Matrix Dimensions(n*n)
5
Enter Adventure Position(row,col)
0 0
Enter Destination Position(row,col)
4 4
Matrix
1 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 2
Shortest Path is 4
---
```
## 👨‍💻 Author

**Kumaraguru**  
🎓 3rd Year CSE | Sri Sairam Institute of Technology  
🔗 [GitHub](https://github.com/guru-kumara)  
🔗 [LinkedIn](https://www.linkedin.com/in/kumara-guru1/)

---

## ⭐ Like this Repository?

- Star this repo 🌟 to support
- Fork it and try out your own versions
- Connect with me on GitHub and LinkedIn

