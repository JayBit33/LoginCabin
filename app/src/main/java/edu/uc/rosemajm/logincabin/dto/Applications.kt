package edu.uc.rosemajm.logincabin.dto

data class Applications (var appName : String, var username : String, var password: String, var comments: String) {
    override fun toString(): String {
        return appName + comments
    }
}