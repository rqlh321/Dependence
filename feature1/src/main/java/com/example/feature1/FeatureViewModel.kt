package com.example.feature1

import androidx.lifecycle.ViewModel
import com.example.domain.Domain1
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeatureViewModel @Inject constructor(val domain: Domain1) : ViewModel()