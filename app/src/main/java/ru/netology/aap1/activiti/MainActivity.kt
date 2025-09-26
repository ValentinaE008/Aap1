package ru.netology.aap1.activiti

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ru.netology.aap.databinding.ActivityMainBinding
import ru.netology.aap1.adapter.PostAdapter
import ru.netology.aap1.viewmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel: PostViewModel by viewModels()
        val adapter = PostAdapter (
            { viewModel.likeById(it.id) },
            { viewModel.shareById(it.id) }
        )
        binding.list.adapter = adapter
        viewModel.data.observe(this) { posts ->
            //adapter.list = posts
            adapter.submitList(posts)
        }
    }
}