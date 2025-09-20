# 🏦 ATM Simulation in Java

This project is a simple **ATM Simulation System** built in Java.  
It allows users to enter a PIN and Card last 4-digits to match and validates it, and gives access to account options.  
Users get **3 attempts** to enter the correct PIN. After 3 failed attempts, the program exits and displays **"Try again after 24 hours"**.

---

## 📂 Project Structure
```
ATM-Simulation/
├── Account.java   # Defines the Account class (stores PIN and account data)
├── ATM.java       # ATM logic (PIN verification, masking, options)
├── Main.java      # Entry point of the program
└── README.md      # Project documentation
```

---

## 🚀 Features
- ✅ Secure PIN entry 
- ✅ 3 attempts limit for PIN entry  
- ✅ Lockout message after 3 failed attempts  
- ✅ Simple ,clean and modular design with separate classes  

---

## ⚡ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/anuuhsingh98/ATM-Simulation.git
   cd ATM-Simulation
   ```

2. Compile the project:
   ```bash
   javac Main.java ATM.java Account.java
   ```

3. Run the program:
   ```bash
   java Main
   ```

---

## 🖥 Example Usage
```
Enter Pin: ****
✅ Pin Accepted!
👉 Accessing account options...
```

If the wrong PIN is entered 3 times:
```
Enter Pin: ****
❌ Wrong Pin! Attempts left: 2
Enter Pin: ****
❌ Wrong Pin! Attempts left: 1
Enter Pin: ****
🚫 Too many failed attempts. Try again after 24 hours.
```

---

## 🛠 Requirements
- Java 8 or later  
- Works best when run in **terminal/command prompt**  

---

## 👨‍💻 Author
**Anurag Kumar**
