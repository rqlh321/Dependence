package com.example.feature1

import androidx.lifecycle.ViewModel
import com.example.domain.Domain1
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Feature1ViewModel @Inject constructor(
    val domain1: Domain1
) : ViewModel()