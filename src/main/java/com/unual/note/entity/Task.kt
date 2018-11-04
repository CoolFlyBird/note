package com.unual.note.entity

class Task {
    /**
     * 自增id
     */
    var taskId: Int? = null
    /**
     * 任务名，255字符
     */
    var name: String? = null
    /**
     * 描述，无限制
     */
    var describe: String? = null
    /**
     * 总计，float
     */
    var total: Float? = null
    /**
     * 当前，float
     */
    var current: Float? = null
    /**
     * 单位，20字符
     */
    var unit: String? = null
    /**
     * 单位，20字符
     */
    var status: Int? = null
}