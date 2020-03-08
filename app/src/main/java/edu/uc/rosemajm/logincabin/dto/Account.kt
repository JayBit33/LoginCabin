package edu.uc.rosemajm.logincabin.dto

// This class will help update the account info

class Account(_username: String, _password: String, _email: String) {

    // Removed unused account name

    var username : String = _username
    var password : String = _password
    var email : String = _email


    fun updateUsername(newUsername: String) {
        username = newUsername
    }

    fun updatePassword(newPassword: String) {
        password = newPassword
    }

    fun updateEmail(newEmail: String) {
        email = newEmail
    }
}