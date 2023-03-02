import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import component.MovieItem
import webclient.MovieWebClient
import model.Movie

@Composable
@Preview
fun App(movies: List<Movie>) {
    MaterialTheme(
        colors = darkColors()
    ) {
        Surface {
            LazyColumn {
                items(movies) { movie ->
                    MovieItem(movie = movie)
                }
            }
        }
    }
}

fun main() = application {
    val client = MovieWebClient()
    var movies: List<Movie> by remember {
        mutableStateOf(emptyList())
    }
    client.findTop250Movies {
        movies = it
    }
    Window(
        onCloseRequest = ::exitApplication,
        title = "IMDB",
    ) {
        App(movies)
    }
}