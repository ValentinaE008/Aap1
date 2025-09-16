package ru.netology.aap1.repository

import androidx.lifecycle.LiveData
import ru.netology.aap1.dto.Post

interface PostRepository {
    fun get(): LiveData<Post>
    fun like()
    fun sharing()
}