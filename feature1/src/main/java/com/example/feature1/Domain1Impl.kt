package com.example.feature1

import com.example.domain.Domain1
import javax.inject.Inject

class Domain1Impl @Inject constructor() : Domain1 {
    override fun text() = "Domain1"
}