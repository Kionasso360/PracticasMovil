package screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun PixelSpiderman() {
    val pixel = 20.dp
    val R = Color.Red
    val W = Color.White
    val K = Color.Black
    val X = Color.Transparent

    ConstraintLayout(
        modifier = Modifier
            .size(300.dp)
            .background(Color.White)
    ) {
        val pixels = listOf(
            listOf(X, X, X, X, K, K, K, K, K, K, K, X, X, X, X),
            listOf(X, X, K, K, R, R, R, R, R, R, R, K, K, X, X),
            listOf(X, K, R, R, R, R, R, R, R, R, R, R, R, K, X),
            listOf(X, K, R, R, R, R, R, R, R, R, R, R, R, K, X),
            listOf(K, R, K, K, R, R, R, R, R, R, R, K, K, R, K),
            listOf(K, K, W, W, K, R, R, R, R, R, K, W, W, K, K),
            listOf(K, W, W, W, W, K, R, R, R, K, W, W, W, W, K),
            listOf(K, W, W, W, W, W, K, R, K, W, W, W, W, W, K),
            listOf(K, W, W, W, W, W, W, K, W, W, W, W, W, W, K),
            listOf(K, W, W, W, W, W, W, K, W, W, W, W, W, W, K),
            listOf(X, K, K, W, W, W, K, R, K, W, W, W, K, K, X),
            listOf(X, K, R, K, K, K, R, R, R, K, K, K, R, K, X),
            listOf(X, X, K, R, R, R, R, R, R, R, R, R, K, X, X),
            listOf(X, X, X, K, R, R, R, R, R, R, R, K, X, X, X),
            listOf(X, X, X, X, K, K, K, K, K, K, K, X, X, X, X)
        )


        pixels.forEachIndexed { rowIndex, row ->
            row.forEachIndexed { colIndex, color ->
                if (color != X) {
                    Box(
                        modifier = Modifier
                            .size(pixel)
                            .background(color)
                            .constrainAs(createRef()) {
                                start.linkTo(parent.start, margin = colIndex * pixel)
                                top.linkTo(parent.top, margin = rowIndex * pixel)
                            }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSpidermanPixel() {
    PixelSpiderman()
}