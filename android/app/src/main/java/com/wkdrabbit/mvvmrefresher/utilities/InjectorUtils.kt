package com.wkdrabbit.mvvmrefresher.utilities

import com.wkdrabbit.mvvmrefresher.data.FakeDatabase
import com.wkdrabbit.mvvmrefresher.data.QuoteRepository
import com.wkdrabbit.mvvmrefresher.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}