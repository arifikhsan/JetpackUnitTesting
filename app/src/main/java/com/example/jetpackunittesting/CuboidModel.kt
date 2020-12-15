package com.example.jetpackunittesting

class CuboidModel {
    private var width = 0.0
    private var length = 0.0
    private var height = 0.0

    fun getVolume(): Double = width * length * height

    fun getSurfaceArea(): Double {
        val widthLength = width * length
        val widthHeight = width * height
        val lengthHeight = length * height

        return 2 * (widthHeight * widthHeight * lengthHeight)
    }

    fun getCircumference(): Double = 4 * (width * length * height)

    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }
}