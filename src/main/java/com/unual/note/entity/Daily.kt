package com.unual.note.entity

/**
 * 对应daily表
 */
class Daily {
    /**
     * 自增id
     */
    var id: Int? = null
    /**
     * 日期 date(2018-11-1)
     */
    var date: String? = null
    /**
     * 描述 255字节
     */
    var brife: String? = null
    /**
     * 内容 无限制
     */
    var content: String? = null
    /**
     * 当天noteId，关联着一些任务id
     */
    var noteId: Int? = null
}