package com.example.androiddevchallenge.ui.screens.dogList

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.DogInfo

@Composable
fun DogInfoView(
    dogInfo: DogInfo,
    modifier: Modifier,
) {
    Box(modifier = modifier) {
        Image(
            painterResource(dogInfo.image),
            contentDescription = "${dogInfo.name} image",
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            dogInfo.name,
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 5.dp)
        )
    }
}