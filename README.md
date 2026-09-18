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
<img width="1920" height="1080" alt="LAB 3" src="https://github.com/user-attachments/assets/12748bba-3f70-46a9-b62d-f8721fa1d655" />

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
