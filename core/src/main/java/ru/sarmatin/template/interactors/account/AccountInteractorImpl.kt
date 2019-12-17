package ru.sarmatin.template.interactors.account

import ru.sarmatin.template.repository.AccountRepository
import javax.inject.Inject

class AccountInteractorImpl @Inject constructor(private val accountRepository: AccountRepository) : AccountInteractor {

    override fun getTest(): String {
        return accountRepository.getTest() + " yeees! this interactor message"
    }
}