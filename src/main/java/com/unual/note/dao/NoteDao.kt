package com.unual.note.dao

import com.unual.note.entity.Task

interface NoteDao {

//    /**
//     * 通过日期查询 查询 日记id
//     */
//    fun queryNoteIdByDate(date: String): Int
//
//    /**
//     * 通过任务id 查询任务
//     */
//    fun queryTaskById(taskId: Int): Task

    /**
     * 通过日期查询 查询 任务id
     */
    fun queryTasksByDate(date: String): List<Task>
}