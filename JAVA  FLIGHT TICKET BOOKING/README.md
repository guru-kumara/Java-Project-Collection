# ✈️ Java Flight Ticket Booking System

This is a **Java console-based application** that simulates a **flight ticket booking system**. It allows users to book and cancel flight tickets by managing available seats, dynamic pricing, and passenger details using a simple interface.

---

## 📌 Features

- ✅ Book flight tickets for one or more passengers
- 🗑 Cancel bookings using flight ID and passenger ID
- 🪑 Real-time tracking of available seats (starting from 50)
- 💰 Dynamic pricing: price increases by ₹200 per passenger booked
- 📦 Uses Java `HashMap` to manage and store passenger data
- 📋 Simple menu-based interaction with `Scanner`

---

## 🧠 Concepts Used

- Java Classes and Objects
- HashMap (Key-Value store for bookings)
- Scanner for user input
- Conditional logic and switch-case
- Basic data encapsulation using `Passenger` class

---

📁 File Structure
 ```
JAVA FLIGHT TICKET BOOKING/
├── Booking.java       # Main logic and menu
├── Passenger.java     # Model class for passenger data
└── README.md
---


## 🚀 How to Run

### 🖥 Using Terminal or VS Code

1. Ensure both files `Booking.java` and `Passenger.java` are in the same folder.
2. Open terminal in that folder.
3. Compile the files:

```bash
javac Booking.java Passenger.java
java Booking
---

🧪 Sample Interaction
0:Book Flight
1:Cancel Flight
2:Exit
Enter Flight ID:
1001
How many passengers?
2
Flight booked successfully!
Flight ID: 1001
Passenger ID: 1
Total Seats Available: 48
Price per seat: 5400


Enter Flight ID to cancel:
1001
Enter Passenger ID to cancel:
1
Flight ID: 1001
Passenger ID: 1
Total Seats Available: 50
Price per seat: 5000
Flight cancelled successfully for Passenger ID: 1

---
🌟 Like this project?
Give it a ⭐ on GitHub

Fork it and try adding new features

Share with your Java-learning friends!
