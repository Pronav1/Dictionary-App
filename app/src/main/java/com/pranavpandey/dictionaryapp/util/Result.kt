package com.pranavpandey.dictionaryapp.util



sealed class Result<T>(val data: T? = null, val message: String? = null) {

    class Success<T>(data: T?) : Result<T>(data)

    class Error<T>(message: String) : Result<T>(null, message = message)

    class Loading<T> (isLoading: Boolean = true): Result<T>(null)
}