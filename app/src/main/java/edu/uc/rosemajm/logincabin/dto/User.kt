package edu.uc.rosemajm.logincabin.dto

// Account info

class User(username: String, password:String) {
    private var loginName = username
    private var loginPassword = password

    var accounts = ArrayList<Account>()

    // Create and add a new account to the users list of saved accounts
    fun addUserAccount( userName: String, password: String, email: String) {
        val account = Account(userName,password, email)
        // Add new account to list of user accounts
        accounts.add(account)
    }

    // a function to delete an existing account from the arraylist
    fun deleteUserAccount(account: Account) {
        if (accounts.contains(account)){
            accounts.remove(account)
        }
    }

    // Update an account username
    fun updateAccountUsername(account: Account, newUsername: String) {
        if (accounts.contains(account)) {
            account.updateUsername(newUsername)
        }
    }

    // Update an account password
    fun updateAccountPassword(account: Account, newPassword: String) {
        if (accounts.contains(account)) {
            account.updateUsername(newPassword)
        }
    }

    // Change the users login username
    fun updateLoginName(newLoginName: String) {
        loginName = newLoginName
    }

    // Change the users login password
    fun updateLoginPassword(newLoginPassword: String) {
        loginPassword = newLoginPassword
    }


}