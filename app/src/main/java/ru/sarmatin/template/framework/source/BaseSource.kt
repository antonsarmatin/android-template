package ru.sarmatin.template.framework.source

import retrofit2.Response
import ru.sarmatin.template.core.exception.Failure
import ru.sarmatin.template.core.functional.Either

/**
 * Created by antonsarmatin
 * Date: 2019-12-17
 * Project: android-template
 */
abstract class BaseSource {


    protected suspend fun <T, R> request(call: suspend () -> Response<T>, transform: (T) -> R, default: T): Either<Failure, R> {
        return try {
            val response = call.invoke()
            when (response.isSuccessful) {
                true -> Either.Right(transform((response.body() ?: default)))
                false -> Either.Left(Failure.ServerError)
            }
        } catch (exception: Throwable) {
            Either.Left(Failure.ServerError)
        }

    }



}
