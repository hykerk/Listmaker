package com.raywenderlich.listmaker.ui.main.detail.detail

import androidx.lifecycle.ViewModel
import com.raywenderlich.listmaker.TaskList

class ListDetailViewModel : ViewModel() {
    lateinit var onTaskAdded: (() -> Unit)

    lateinit var list: TaskList

    fun addTask(task: String) {
        list.tasks.add(task)
        onTaskAdded.invoke()
    }
}