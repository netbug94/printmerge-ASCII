import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        printASCII()
        mainScreen()
        olrScn("\uD83C\uDF35olr")
    }
}

