# 🚖 Java Taxi Ticket Booking System

This project simulates a **taxi booking system** in Java, allowing customers to book a taxi based on availability, proximity, and earnings of taxis. It handles customer requests, calculates fare, maintains each taxi's trip history, and prioritizes taxis efficiently.

---

## 📌 Features

- 📍 Book a taxi by selecting **pickup and drop points**
- ⏰ Supports scheduling based on **pickup time**
- 🚕 Assigns nearest and **least earning** taxi available
- 💰 Calculates dynamic **fare** based on distance
- 🧾 Tracks and displays **trip history** and earnings of each taxi

---

## 🧠 Concepts Used

- Object-Oriented Programming (OOP)
- Collections (`ArrayList`, `List`)
- Sorting using `Comparator`
- Basic simulation and CLI interface

---

## 🗂️ Folder Structure

```
JAVA TAXI TICKET BOOKING/
├── Booking.java
├── Taxi.java
└── README.md
```

---

## 🚦 Booking Logic

- Taxis start at spot **'A'** and are **free from 6 AM**
- Travel time: 15 minutes per unit distance (`A -> B -> C -> D`)
- Fare: ₹100 base fare + ₹10 per unit distance after 5 km
- Distance and time are calculated from ASCII values of pickup and drop locations

---

## 🔁 Sample Flow
```
0: BOOK A TAXI
1: PRINT TAXI DETAILS
2: EXIT

### ✅ Booking Example

Enter Pickup point: A
Enter Drop point: C
Enter pick up time: 6

Taxi booked successfully!
---
```
## 🚀 How to Run
```
1. Save `Booking.java` and `Taxi.java` in the same folder
2. Compile:
```bash
javac Booking.java Taxi.java
java Booking

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

