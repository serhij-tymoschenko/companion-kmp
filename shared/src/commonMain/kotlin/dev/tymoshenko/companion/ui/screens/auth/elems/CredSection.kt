package dev.tymoshenko.companion.ui.screens.auth.elems

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.tymoshenko.companion.ui.theme.midnightButtonBg
import dev.tymoshenko.companion.ui.theme.onMidnightButton

@Composable
fun CredSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialCredSection(
            modifier = Modifier
                .fillMaxWidth(),
            onGoogleAuth = {},
            onGithubAuth = {}
        )

        Spacer(modifier = Modifier.height(16.dp))

        AuthTextField(
            modifier = Modifier
                .fillMaxWidth(),
            onValueChange = {},
            value = "adsfsdgs",
            placeholderText = "G"
        )

        Spacer(modifier = Modifier.height(12.dp))

        AuthTextField(
            modifier = Modifier.fillMaxWidth(),
            onValueChange = {},
            value = "adsfsdgs",
            placeholderText = "G"
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = midnightButtonBg,
                contentColor = onMidnightButton
            ),
            elevation = null,
            onClick = {}
        ) {
            Text("Sign in with Email")
        }

        Row {
            Spacer(modifier = Modifier.weight(1F))

            TextButton(
                colors = ButtonDefaults.textButtonColors().copy(
                    contentColor = Color.White.copy(alpha = 0.7F)
                ),
                onClick = {}
            ) {
                Text(
                    text = "Don't have an account?",
                    fontSize = 10.sp
                )
            }
        }
    }
}