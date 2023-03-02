package model

class Top250DataDetail(
    val id: String,
    val rank: String,
    val title: String,
    val fullTitleval: String,
    val year: String,
    val image: String,
    val crew: String,
    val imDbRating: String,
    val imDbRatingCount: String
) {
    fun toMovie(): Movie = Movie(
        title = this.title,
        image = this.image,
        rating = imDbRating.toDouble(),
        year = year.toInt()
    )
}
