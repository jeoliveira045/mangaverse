package com.labs.manga_verse.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.labs.manga_verse.model.MangaState
//import com.labs.manga_verse.model.MangaUseCase
//import com.labs.manga_verse.service.MangaApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

//class MangaViewModel(): ViewModel() {
//
//    private val _data = MutableStateFlow<MangaState>(MangaState())
//    val data: StateFlow<MangaState> get() = _data
//
//    val useCase: MangaUseCase
//
//    init{
//        var service = MangaApiService()
//
//        useCase = MangaUseCase(service)
//
//        getDataFromApi()
//    }
//    private fun getDataFromApi(){
//        viewModelScope.launch {
//            val mangas = useCase.getManga()
//
//            _data.emit(MangaState(mangaList = mangas))
//        }
//    }
//}
