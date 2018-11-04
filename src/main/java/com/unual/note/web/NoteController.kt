package com.unual.note.web

import com.unual.note.entity.Task
import com.unual.note.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/")
class NoteController {
    @Autowired
    var noteService: NoteService? = null

    @ResponseBody
    @RequestMapping(value = "/daily", method = arrayOf(RequestMethod.GET))
    private fun loadTasksByDate(@RequestParam params: Map<String, String>): List<Task> {
        var date = params["date"] ?: ""
        System.out.println("loadTasksByDate:${date}")
        var response = noteService?.queryTasks(date)
        System.out.println("response:${response}")
        return response ?: ArrayList()
    }

}