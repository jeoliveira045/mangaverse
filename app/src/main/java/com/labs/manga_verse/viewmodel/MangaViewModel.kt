package com.labs.manga_verse.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.labs.manga_verse.model.Series
import com.labs.manga_verse.model.SeriesListRequest
import com.labs.manga_verse.repository.SeriesRepository
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//import com.labs.manga_verse.model.MangaUseCase
//import com.labs.manga_verse.service.MangaApiService

class MangaViewModel(private val repository: SeriesRepository = SeriesRepository()): ViewModel() {
    val coroutineExceptionHandler = CoroutineExceptionHandler{_, throwable ->
        throwable.printStackTrace()
    }
    init {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler){
            seriesState.value = getAllSeries()
        }
    }

    var seriesState: MutableState<List<Series>> = mutableStateOf(emptyList<Series>())
    suspend fun getAllSeries(): List<Series>{
        return repository.getAllSeries().data
    }

}
