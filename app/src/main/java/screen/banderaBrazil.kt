package screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaBrazil(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF009739)), // Verde de fondo
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .size(220.dp)
                .background(
                    color = Color(0xFFFFCC29),
                    shape = GenericShape { size, _ ->
                        moveTo(size.width / 2, 0f)
                        lineTo(size.width, size.height / 2)
                        lineTo(size.width / 2, size.height)
                        lineTo(0f, size.height / 2)
                        close()
                    }
                ),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(0xFF002776), shape = CircleShape)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBrazil() {
    BanderaBrazil()
}
