package ru.gto.gtoadmin.framework.source

import ru.sarmatin.template.repository.AccountSource


/**
 * Created by antonsarmatin
 * Date: 2019-12-16
 * Project: gto-android-judge-kotlin
 */
class AccountSourceNetwork : AccountSource {

    override fun getTest(): String {
        return "this is string from source via core module"
    }
}