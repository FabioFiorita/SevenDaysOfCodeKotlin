package model

data class Top250Data(
    val items: List<Top250DataDetail>,
    val errorMessage: String
)