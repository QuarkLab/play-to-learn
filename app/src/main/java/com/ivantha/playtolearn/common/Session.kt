package com.ivantha.playtolearn.common

import com.ivantha.playtolearn.model.Board
import com.ivantha.playtolearn.model.Level

object Session {

    var currentLevel: Level? = null
    var currentBoard: Board? = null

    const val COLUMN_COUNT = 6
    const val ROW_COUNT = 10

    val settingsHelper: SettingsHelper = SettingsHelper()

}