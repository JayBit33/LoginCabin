package edu.uc.rosemajm.logincabin.dto

class Accounts {

    var accounts = ArrayList<String>()

    //a function to add new accounts to the arrayList

    fun addAccount(userName: String, password: String) {

        accounts.add(userName + password)
    }

    //a function to delete an existing account fromt the arraylist

    fun deleteAccount(userName: String) {

        for (item in accounts)
            if (accounts.contains(userName)) {
                accounts.remove(userName)
            }
    }

    //a function to update accounts to the arrayList

    fun updateAccount(
        userName: String,
        password: String,
        newUserName: String,
        newPassword: String
    ) {

        for (item in accounts)
            if (accounts.contains(userName)) {
                accounts.replaceAll { newUserName -> userName }
                accounts.replaceAll { newPassword -> password }
            }
    }

}