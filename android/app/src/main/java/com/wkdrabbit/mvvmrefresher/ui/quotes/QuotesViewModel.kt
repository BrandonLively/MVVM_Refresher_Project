package com.wkdrabbit.mvvmrefresher.ui.quotes

import androidx.lifecycle.ViewModel
import com.wkdrabbit.mvvmrefresher.data.Quote
import com.wkdrabbit.mvvmrefresher.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}