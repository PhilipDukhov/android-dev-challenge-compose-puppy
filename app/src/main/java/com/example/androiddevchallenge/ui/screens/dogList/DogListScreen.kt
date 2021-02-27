package com.example.androiddevchallenge.ui.screens.dogList

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.DogInfo
import com.example.androiddevchallenge.model.DogInfoId

@Composable
fun DogListScreen(
    dogsInfo: List<DogInfo>,
    onSelect: (DogInfoId) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(padding)
    ) {
        items(dogsInfo) { dogInfo ->
            DogInfoView(
                dogInfo,
                modifier = Modifier
                    .clickable {
                        onSelect(dogInfo.id)
                    }
            )
            Spacer(modifier = Modifier.height(padding))
        }
    }
}

private val padding = 10.dp