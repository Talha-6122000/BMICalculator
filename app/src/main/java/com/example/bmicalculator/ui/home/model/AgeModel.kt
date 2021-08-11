package com.example.bmicalculator.ui.home.model

/**
 * This is used for exercise details it is a custom model class.
 * with getter setter functions and a constructor
 */
class AgeModel(
    private var id: Int,
    private var age: Int,
    private var isOnScreen: Boolean,
) {

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getIsOnScreen(): Boolean {
        return isOnScreen
    }

    fun setIsOnScreen(isOnScreen: Boolean) {
        this.isOnScreen = isOnScreen
    }

}