/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
