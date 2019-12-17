package ru.sarmatin.template.framework.source

import retrofit2.Response
import ru.sarmatin.template.core.exception.Failure
import ru.sarmatin.template.core.functional.Either

/**
 * Created by antonsarmatin
 * Date: 2019-12-17
 * Project: android-template
 */
interface BaseSource {


    fun <T : Any> execute(call: suspend () -> Response<T>): Either<Failure, T>


}
