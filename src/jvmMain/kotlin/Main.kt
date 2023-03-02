import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import component.MovieItem
import model.Movie

@Composable
@Preview
fun App() {
    MaterialTheme(
        colors = darkColors()
    ) {
        Surface {
            val movies = listOf(
                Movie(
                    title = "The Shawshank Redemption",
                    image = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX674_.jpg",
                    rating = 8.7,
                    year = 1994
                ),
                Movie(
                    title = "The Shawshank Redemption",
                    image = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX674_.jpg",
                    rating = 8.7,
                    year = 1994
                ),
                Movie(
                    title = "The Shawshank Redemption",
                    image = "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_FMjpg_UX674_.jpg",
                    rating = 8.7,
                    year = 1994
                ),
            )
            LazyColumn {
                items(movies) { movie ->
                    MovieItem(movie = movie)
                }
            }
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "IMDB",
    ) {
        App()
    }
}
