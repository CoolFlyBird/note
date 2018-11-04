package com.unual.note.service.impl

import com.unual.note.dao.NoteDao
import com.unual.note.entity.Task
import com.unual.note.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteServiceImpl : NoteService {
    @Autowired
    var noteDao: NoteDao? = null

    override fun queryTasks(date: String): List<Task> {
        return noteDao?.queryTasksByDate(date) ?: ArrayList()
    }
}