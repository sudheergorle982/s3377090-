package uk.ac.tees.mad.shoplist.domain

data class ShoppingItem(
    val id: Int,
    val name: String,
    val quantity: Int,
    val isPurchased: Boolean
)