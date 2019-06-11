package com.example.tugasmaterikotlin

class Konstanta {
    companion object {
        var username: String = ""

        lateinit var genders: String

        fun setGender(genders: String) {
            this.genders = genders
        }

        fun getGender(): String {
            return this.genders
        }
    }
}