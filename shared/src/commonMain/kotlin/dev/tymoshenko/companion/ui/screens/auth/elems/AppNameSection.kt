package dev.tymoshenko.companion.ui.screens.auth.elems

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.tymoshenko.companion.ui.theme.onChocolate

@Composable
fun AppNameSection(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(start = 32.dp, top = 128.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Companion",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = onChocolate
        )

        Text(
            modifier = Modifier.padding(start = 4.dp),
            color = onChocolate,
            text = "improve yourself",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic
        )
    }
}