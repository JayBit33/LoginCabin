package edu.uc.rosemajm.logincabin.dto

class UserDTO(username: String, password:String) {
    var loginName = username
    var loginPassword = password



    var accounts = ArrayList<AccountDTO>()

    // Create and add a new account to the users list of saved accounts
    fun addUserAccount(accountName:String, userName: String, password: String) {
        val account = AccountDTO(accountName,userName,password)
        // Add new account to list of user accounts
        accounts.add(account)
    }

    // a function to delete an existing account from the arraylist
    fun deleteUserAccount(account: AccountDTO) {
        if (accounts.contains(account)){
            accounts.remove(account)
        }
    }

    fun updateUsername(newUsername: String) {
        loginName = newUsername
    }

    fun updatePassword(newPassword: String) {
        loginPassword = newPassword
    }

    // Update an account username
    fun updateAccountUsername(account: AccountDTO, newUsername: String) {
        if (accounts.contains(account)) {
            updateUsername(newUsername)
        }
    }

    // Update an account password
    fun updateAccountPassword(account: AccountDTO, newPassword: String) {
        if (accounts.contains(account)) {
            updateUsername(newPassword)
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