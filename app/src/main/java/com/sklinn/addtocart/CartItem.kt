package com.sklinn.addtocart

data class CartItem(
    var product: Product,
    var quantity: Int = 0
)