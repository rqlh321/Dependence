package com.example.myapplication

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.feature1.Feature1

@Composable
fun MainScreen() = LazyColumn {
    item { Feature1() }
}