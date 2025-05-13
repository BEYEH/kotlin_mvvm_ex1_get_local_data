package com.example.kotlin_mvvm_ex1_get_local_data.model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun fetchUserData(): UserData {
        // Get the data from retrofit, firebase or any other api.
        delay(2000)
        return UserData("John", 25)
    }

}