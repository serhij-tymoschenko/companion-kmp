package dev.tymoshenko.companion.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import companion.shared.generated.resources.Res
import companion.shared.generated.resources.workout
import dev.tymoshenko.companion.ui.screens.auth.elems.AuthTextField
import dev.tymoshenko.companion.ui.theme.chocolateBg
import dev.tymoshenko.companion.ui.theme.midnightBg
import org.jetbrains.compose.resources.painterResource

@Composable
fun Auth() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.35F)
                .background(chocolateBg),
            contentAlignment = Alignment.BottomEnd
        ) {
            Image(
                modifier = Modifier
                    .fillMaxHeight(0.75F)
                    .padding(end = 16.dp),
                painter = painterResource(Res.drawable.workout),
                contentDescription = null
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 32.dp, top = 128.dp)
            ) {
                Text(
                    text = "Companion",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    modifier = Modifier.padding(start = 4.dp),
                    color = Color.White,
                    text = "improve yourself",
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(midnightBg)
                .imePadding(),
            contentAlignment = Alignment.Center
        ) {
            Column {
                AuthTextField(
                    modifier = Modifier.fillMaxWidth(), onValueChange = {}, value = "adsfsdgs",
                    placeholderText = "G"
                )
            }
        }
    }
}