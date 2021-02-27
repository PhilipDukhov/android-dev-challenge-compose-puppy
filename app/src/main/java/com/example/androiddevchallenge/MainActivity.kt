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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.model.DogInfo
import com.example.androiddevchallenge.ui.screens.dogDetails.DogDetailsScreen
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.screens.dogList.DogListScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

object MainDestinations {
    const val List = "list"
    const val DogDetailsRoute = "dogDetails"
    const val DogDetailsIdKey = "dogInfoId"
}

@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        val navController = rememberNavController()
        NavHost(navController, startDestination = "list") {
            composable(MainDestinations.List) {
                DogListScreen(DogInfo.mocks.values.sortedBy { it.id }) { dogInfoId ->
                    navController.navigate("${MainDestinations.DogDetailsRoute}/$dogInfoId")
                }
            }
            composable(
                route = "${MainDestinations.DogDetailsRoute}/{${MainDestinations.DogDetailsIdKey}}",
                arguments = listOf(navArgument(MainDestinations.DogDetailsIdKey) { type = NavType.IntType })
            ) { backStackEntry ->
                val arguments = requireNotNull(backStackEntry.arguments)
                val dogId = arguments.getInt(MainDestinations.DogDetailsIdKey)
                val dogInfo = requireNotNull(DogInfo.mocks[dogId])
                DogDetailsScreen(dogInfo)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}
