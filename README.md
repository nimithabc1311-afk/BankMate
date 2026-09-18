# BankMate – Personal Banking Application

## Student Details

| Name | Nimitha BC |
| USN | 25MCAR0132 |
| Experiment | Experiment 6 |
| Project Name | BankMateLabinternal |
| Application Name | BankMate |
| Language | Kotlin |
| UI Design | XML |
| Platform | Android |
| IDE | Android Studio |

---

## 1. Aim

To develop a basic Android application using Views, Activities, Fragments, Intents, Input Validation, Notifications, SharedPreferences, and Activity Lifecycle methods.

The application developed for this experiment is a personal banking application called **BankMate**.

---

## 2. Objectives

- To develop an Android application using basic Views.
- To design the user interface using XML.
- To use Activities and Fragments.
- To implement navigation using Intents.
- To implement fund transfer functionality.
- To validate user input.
- To update the account balance after a successful transaction.
- To store transaction details using SharedPreferences.
- To display transaction history.
- To generate a notification after a successful transaction.
- To demonstrate Activity Lifecycle methods.
- To test the application using different test cases.
- To upload the complete project to GitHub.

---

## 3. Concept / Technology Used

### Android Activities

The application contains:

- MainActivity
- AccountActivity
- TransactionActivity

### Android Fragments

The application contains:

- AccountDetailsFragment
- FundTransferFragment
- TransactionHistoryFragment

### XML Views

The application uses:

- TextView
- EditText
- Button
- RadioButton
- RadioGroup
- ScrollView
- FrameLayout
- LinearLayout

### Intent

Intent is used to navigate from the fund transfer screen to the transaction details screen and pass transaction information.

### SharedPreferences

SharedPreferences is used to store:

- Current account balance
- Transaction history

### Input Validation

The application validates:

- Empty fields
- Invalid amount
- Transfer mode selection
- Insufficient balance

### Notification

A notification is generated after a successful transaction.

### Activity Lifecycle

The application demonstrates:

- onCreate()
- onStart()
- onResume()
- onPause()
- onStop()
- onDestroy()

Lifecycle events are logged using the tag:

```text
BankMateLifecycle

### OutputScreenshot
 <img width="1920" height="1080" alt="MAD LAB INTERNAl" src="https://github.com/user-attachments/assets/f3916ba2-9137-4717-af02-832de9bd41ba" />
<img width="1920" height="1080" alt="MAD LAB INTERNAL 2" src="https://github.com/user-attachments/assets/b6897d3a-6182-4e20-bb5c-55e9a5c87c2f" />
<img width="1920" height="1080" alt="LAB 3" src="https://github.com/user-attachments/assets/016f9562-e29f-4e21-b953-d67de4a1d83d" />
<img width="1920" height="1020" alt="LAB 4" src="https://github.com/user-attachments/assets/d802fe82-1174-468e-8a9c-a4916bfa89bc" />
<img width="1920" height="1080" alt="LAB 5" src="https://github.com/user-attachments/assets/491e67ba-804c-4243-920b-98d67a04cffb" />
<img width="1920" height="1020" alt="LAB6" src="https://github.com/user-attachments/assets/487e32f2-f688-4a85-b7de-0d2ab95377e4" />



### File Structure
BankMateLabinternal/
│
├── app/
│   │
│   └── src/
│       └── main/
│           │
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── bankmatelabinternal/
│           │               │
│           │               ├── MainActivity.kt
│           │               ├── AccountActivity.kt
│           │               ├── TransactionActivity.kt
│           │               ├── AccountDetailsFragment.kt
│           │               ├── FundTransferFragment.kt
│           │               └── TransactionHistoryFragment.kt
│           │
│           ├── res/
│           │   └── layout/
│           │       ├── activity_account.xml
│           │       ├── activity_transaction.xml
│           │       ├── fragment_account_details.xml
│           │       ├── fragment_fund_transfer.xml
│           │       └── fragment_transaction_history.xml
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│
└── README.md

### Conclusion

The BankMate Personal Banking Application was successfully developed using Android Studio and Kotlin.

The application demonstrates important Android concepts including:

Basic Views
XML layouts
Activities
Fragments
Intents
Input validation
SharedPreferences
Fund transfer
Balance update
Transaction history
Notifications
Activity Lifecycle
Logcat monitoring
Git and GitHub

The application provides a simple banking scenario where a user can view account information, perform a fund transfer, update the account balance, receive transaction confirmation, and view transaction history
