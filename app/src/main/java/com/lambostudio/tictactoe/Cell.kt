package com.lambostudio.tictactoe

class Cell(val row:Int, val col:Int) {
    var content: Seed = Seed.EMPTY
    fun clear() {
        content = Seed.EMPTY
    }
}