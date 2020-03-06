package edu.uc.rosemajm.logincabin.dto

class Account(_accountName: String, _username: String, _password: String) {

    var accountName: String = _accountName
    var username : String = _username
    var password : String = _password


    fun updateUsername(newUsername: String) {
        username = newUsername
    }

    fun updatePassword(newPassword: String) {
        password = newPassword
    }
}