package ru.netology.aap1.dto

data class Post(
    val id: Int,
    val author: String,
    val content: String,
    val published: String,
    val likes: Int,
    val shares: Int,
    val views: String,
    val likedByMe: Boolean,
    val repostByMe: Boolean,
    val viewByMe: Boolean
)