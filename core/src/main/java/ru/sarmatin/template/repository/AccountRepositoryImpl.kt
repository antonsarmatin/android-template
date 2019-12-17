package ru.sarmatin.template.repository

import javax.inject.Inject

class AccountRepositoryImpl @Inject constructor(private val accountSource: AccountSource) : AccountRepository {

    override fun getTest(): String {
        return accountSource.getTest()
    }

}