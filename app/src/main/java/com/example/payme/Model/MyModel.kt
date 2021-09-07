package com.example.payme.Model

import java.io.Serializable

class MyModel: Serializable{

    var img = 0

    constructor(img: Int) {
        this.img = img
    }
}