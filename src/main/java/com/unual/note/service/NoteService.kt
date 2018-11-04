package com.unual.note.service

import com.unual.note.entity.Task

interface NoteService {
    fun queryTasks(date: String): List<Task>
}