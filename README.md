# 📲 Task Manager & Location Tracker App 🚀

This is a **Kotlin Android application** built in **Android Studio**, using **Firebase Authentication** and **Firebase Realtime Database**. It enables users to:

✅ **Sign up & Log in** securely using Firebase Authentication.  
✅ **Save their current location (latitude & longitude)** to Firebase Realtime Database.  
✅ **Add tasks**, which are also saved in the database.  
✅ **Sync data under the logged-in user**, allowing another app (for the manager) to **view tasks & location** where the tasks need to be performed.  

---

## 📸 Screenshots & Features

### 🖼️ **1. Welcome & Authentication Screen**

<img width="200" alt="Screen Shot 2023-06-23 at 6 25 42 AM" src="https://github.com/IAMRABIEH/TheOriginal/assets/93038081/277d886d-a719-4c40-bbbc-62d78b3ec83c">

🔹 The app starts with a **clean login & register UI**.  
🔹 Users can **log in or register** using **Firebase Authentication**.  
🔹 Credentials are securely stored in Firebase.

---

### 🖼️ **2. Register a New Account**

<img width="200" alt="Screen Shot 2023-06-23 at 6 25 58 AM" src="https://github.com/IAMRABIEH/TheOriginal/assets/93038081/f79b587e-15a8-40d7-9568-7a7d9907e6e6">

🔹 Users can **create a new account** by entering their **email and password**.  
🔹 Passwords are securely stored using **Firebase Authentication**.  
🔹 After successful registration, the user is redirected to the main dashboard.

---

### 🖼️ **3. Login & Password Recovery**

<img width="200" alt="Screen Shot 2023-06-23 at 6 26 30 AM" src="https://github.com/IAMRABIEH/TheOriginal/assets/93038081/ef4c638a-a448-4a78-aa2c-90249d3d4f1e">


🔹 Users can **log in** using their **email and password**.  
🔹 **Forgot Password?** Users can reset their password via Firebase.  
🔹 Secure authentication ensures **only registered users** can access their tasks.

---

### 🖼️ **4. Location Tracking & Storage**

<img width="200" alt="Screen Shot 2023-06-23 at 6 31 44 AM" src="https://github.com/IAMRABIEH/TheOriginal/assets/93038081/b5d112ff-41fd-4e62-a785-4ec86e5a692b">

🔹 Users can **fetch their current GPS location** (Latitude & Longitude).  
🔹 Location data is **saved in Firebase Realtime Database** under the logged-in user.  
🔹 This data is accessible in a **manager's app**, helping track the location where tasks need to be completed.  

---

### 🖼️ **5. Task Management & Storage**

<img width="200" alt="Screen Shot 2023-06-23 at 6 32 02 AM" src="https://github.com/IAMRABIEH/TheOriginal/assets/93038081/6901cff2-c975-4216-8ab8-b01834ca3dc4">

🔹 Users can **write a task**, which is **saved in Firebase Realtime Database**.  
🔹 Tasks are linked to the **logged-in user's account**.  
🔹 The manager app **retrieves these tasks** to monitor assigned work.  

---

## 🛠️ **Tech Stack**
✅ **Kotlin** – Android Native Development  
✅ **Firebase Authentication** – Secure user login & signup  
✅ **Firebase Realtime Database** – Stores location & tasks  
✅ **Google Play Services** – Fetches GPS location  
---
## 🔥 **How It Works?**
1️⃣ **User registers or logs in** using Firebase Authentication.  
2️⃣ **User fetches current location**, which is stored in Firebase under their user ID.  
3️⃣ **User adds tasks**, which are saved to Firebase.  
4️⃣ **Manager's app retrieves the tasks & location** to track where the work is needed.  

---
