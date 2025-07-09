# 🐍 Java Snake Game (Console Version)

This is a **console-based Snake Game** implemented in **Java**. The snake moves on a 2D grid and consumes food (represented by `'X'`). The snake grows when it eats food and the game ends if it hits the wall or its own body.

---

## 🕹️ Gameplay Overview

- You control the snake using keyboard directions: `U` (Up), `D` (Down), `L` (Left), `R` (Right)
- The snake grows when it eats food placed on the board
- The game ends when:
  - The snake hits the wall (out of bounds)
  - The snake moves into an invalid (empty) space

---

## ✅ Features

- Console-based interface (no GUI)
- Food represented as `'X'`
- Snake body represented as `'.'`
- Snake trail represented as `'-'`
- Dynamic movement using recursion and `Scanner` input
- Snake’s body tracked using `Queue<Node>`

---

## 📁 File Structure

```
JAVA SNAKE GAME/
├── Main.java # Entry point (you can trigger Snake game here)
├── Snake.java # Game logic and board rendering
├── Node.java # Helper class for snake coordinates
└── README.md


---

## 🚀 How to Run

### 🖥 Terminal / VS Code Instructions:

1. Make sure all 3 Java files (`Main.java`, `Snake.java`, `Node.java`) are in the same folder.
2. Compile:

```bash
javac Main.java Snake.java Node.java
java Main

---
Grid Setup:
Default board initialized with some food (X) at hardcoded positions:

(1,0), (2,2), (3,4), (5,2)

Snake starts at (0,0)

Controls:
After each move, you'll be prompted:

mathematica
Copy
Edit
Enter direction
U / D / L / R

---
SAMPLE OUTPUT:
.-------
X-------
--X-----
----X---
-------
--X-----
Enter direction:
R
---

🌟 Like this project?
*)Give it a ⭐ on GitHub
*)Fork it and try adding new features
*)Share with your Java-learning friends!
