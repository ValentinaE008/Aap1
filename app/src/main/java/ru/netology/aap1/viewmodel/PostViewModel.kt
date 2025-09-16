package ru.netology.aap1.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.netology.aap1.dto.Post
import ru.netology.aap1.repository.PostRepository
import ru.netology.aap1.repository.PostRepositoryInMemoryImpl

class PostViewModel : ViewModel() {
    private val repository: PostRepository = PostRepositoryInMemoryImpl()
    val data: LiveData<Post> = repository.get()
    fun like() = repository.like()
    fun sharing() = repository.sharing()
}