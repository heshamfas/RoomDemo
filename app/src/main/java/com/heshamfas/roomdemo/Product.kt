package com.heshamfas.roomdemo

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull

@Entity(tableName = "products")
class Product {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name="productId")
    var id:Int = 0
    @ColumnInfo(name="productName")
    var productName: String? = null
    var quantity:Int = 0

    constructor(){}
    constructor(id:Int, productname:String, quantity:Int){
        this.id = id
        this.productName = productName
        this.quantity = quantity
    }

    constructor(productname: String,quantity: Int){
        this.productName=productName
        this.quantity =quantity
    }
}