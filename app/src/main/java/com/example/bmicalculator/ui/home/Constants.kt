package com.example.bmicalculator.ui.home

import com.example.bmicalculator.ui.home.model.AgeModel
import java.util.*

/**
 * Constant Class where you can add the constant values of the project.
 */
class Constants {
    companion object {

        // The drawable images used here is added in the drawable folder.
        /**
         * Here we are adding all exercises to a single list with all the default values.
         */
        fun defaultAgeList(): ArrayList<AgeModel> {

            val ageList = ArrayList<AgeModel>()

            val age2 =
                AgeModel(1,2,false)
            ageList.add(age2)

            val age3=AgeModel(2,3,false)
            ageList.add(age3)

            val age4=AgeModel(3,4,false)
            ageList.add(age4)
            val age5=AgeModel(4,5,false)
            ageList.add(age5)
            val age6=AgeModel(5,6,false)
            ageList.add(age6)
            val age7=AgeModel(6,7,false)
            ageList.add(age7)
            val age8=AgeModel(7,8,false)
            ageList.add(age8)
            val age9=AgeModel(8,9,false)
            ageList.add(age9)
            val age10=AgeModel(9,10,false)
            ageList.add(age10)
            val age11=AgeModel(10,11,false)
            ageList.add(age11)
            val age12=AgeModel(11,12,false)
            ageList.add(age12)
            val age13=AgeModel(12,13,false)
            ageList.add(age13)
            val age14=AgeModel(13,14,true)
            ageList.add(age14)
            val age15=AgeModel(14,15,false)
            ageList.add(age15)
            val age16=AgeModel(15,16,false)
            ageList.add(age16)
            val age17=AgeModel(16,17,false)
            ageList.add(age17)
            val age18=AgeModel(17,18,false)
            ageList.add(age18)



            return ageList
        }
    }
}