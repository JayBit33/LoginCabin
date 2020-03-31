package edu.uc.rosemajm.logincabin.dto

data class Application (var appName : String, var username : String, var password: String, var comments: String) {
    override fun toString(): String
    {
        return appName + comments
    }

    fun getAppName(application:Application):String
    {
        return application.appName
    }
}