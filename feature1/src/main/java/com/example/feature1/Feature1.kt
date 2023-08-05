package com.example.feature1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun Feature1(viewModel: Feature1ViewModel = hiltViewModel()) = Text(viewModel.domain1.text())