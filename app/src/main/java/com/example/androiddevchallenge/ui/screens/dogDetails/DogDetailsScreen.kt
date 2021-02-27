package com.example.androiddevchallenge.ui.screens.dogDetails

import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.model.DogInfo

@Composable
fun DogDetailsScreen(dogInfo: DogInfo) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        var showDialog by rememberSaveable { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painterResource(dogInfo.image),
                contentDescription = "${dogInfo.name} image",
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                dogInfo.name,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                dogInfo.description,
                style = MaterialTheme.typography.body1,
                modifier = Modifier
                    .padding(horizontal = 10.dp)
            )
        }
        val interactionSource = remember { MutableInteractionSource() }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(20.dp)
                .size(44.dp)
                .clickable(
                    role = Role.Button
                ) {
                    showDialog = true
                }
                .background(Color.Green, shape = CircleShape)
        ) {
            Image(
                painterResource(R.drawable.ic_round_call_24),
                contentDescription = "Call the curator",
            )
        }

        if (showDialog) {
            CallingDialog { showDialog = false }
        }
    }
}