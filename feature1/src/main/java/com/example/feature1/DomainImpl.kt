package com.example.feature1

import com.example.domain.Domain1
import javax.inject.Inject

class DomainImpl @Inject constructor() : Domain1 {
    override fun text() = "Domain1"
}